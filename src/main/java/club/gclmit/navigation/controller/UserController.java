package club.gclmit.navigation.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import club.gclmit.chaos.core.utils.StringUtils;
import club.gclmit.chaos.web.annotation.ChaosQuery;
import club.gclmit.chaos.web.controller.QueryCondition;
import club.gclmit.chaos.web.controller.RestApiController;
import club.gclmit.chaos.web.result.ApiCode;
import club.gclmit.chaos.web.result.ApiPageResult;
import club.gclmit.chaos.web.result.ApiResult;
import club.gclmit.navigation.model.constants.Key;
import club.gclmit.navigation.model.constants.Roles;
import club.gclmit.navigation.model.dto.param.LoginParam;
import club.gclmit.navigation.model.dto.param.PasswordParam;
import club.gclmit.navigation.model.dto.query.UserQuery;
import club.gclmit.navigation.model.pojo.User;
import club.gclmit.navigation.model.vo.LoginDetail;
import club.gclmit.navigation.model.vo.SimpleUserDetail;
import club.gclmit.navigation.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;

/**
 * 用户表(User)表控制层
 *
 * @author 孤城落寞
 * @since 2020-03-24 14:52:42
 */
@Slf4j
@RestController
@RequestMapping("/api/user")
@Api(value = "用户表服务", tags = "用户表服务")
public class UserController extends RestApiController<UserService, User> {

    @Autowired
    private UserService userService;

    private static final String LOCATION_PATH = "/index.html";

    @ApiOperation("登陆/注册接口")
    @PostMapping("/login")
    public ApiResult login(@RequestBody LoginParam params, HttpSession session) {
        log.info("登陆参数: [{}]", StringUtils.toString(params));
        SimpleUserDetail userDetail = userService.login(params);
        if (userDetail == null) {
            return ApiResult.fail("登陆失败，账号或密码错误");
        }
        String path = (String) session.getAttribute(Key.LOGIN_LOCALTION_PATH.name());
        session.setAttribute(Key.SESSION_USER_KEY.name(),userDetail);
        session.removeAttribute(Key.LOGIN_LOCALTION_PATH.name());
        if (StringUtils.isEmpty(path) || Roles.ADMIN.getId().equals(userDetail.getRole())){
            path = LOCATION_PATH;
        }
        return ApiResult.ok("登陆成功", new LoginDetail(path, userDetail));
    }

    @ApiOperation("注销登陆接口")
    @GetMapping("/logout")
    public ApiResult logout(HttpSession session) {
        session.removeAttribute(Key.SESSION_USER_KEY.name());
        return ApiResult.ok("退出登陆成功");
    }

    @ApiOperation(value = "修改密码", notes = "修改密码")
    @ApiParam(name = "id", required = true, example = "1111")
    @PutMapping("/{id:\\d+}")
    public ApiResult updatePassword(@PathVariable String id, @RequestBody PasswordParam param) {
        Assert.notNull(id, "id不能为空");
        log.info("修改密码数据: id:[{}]\tPasswordParam:[{}]", id, StringUtils.toString(param));
        String message = userService.updatePassword(id, param);
        return ApiResult.ok(ApiCode.OK.getCode(), message, "");
    }

    /**
     * 添加用户
     *
     * @param user 用户
     * @return club.gclmit.chaos.web.response.Result
     * @author gclm
     */
    @Override
    @ApiOperation(value = "添加用户", notes = "添加用户")
    @PostMapping
    public ApiResult create(@Valid @RequestBody User user) {
        log.info("添加用户数据:{}", StringUtils.toString(user));
        return userService.addUser(user) ? ApiResult.ok() : ApiResult.fail("添加用户失败，手机号重复！");
    }

    /**
     * 分页查询所有数据
     *
     * @param query 分页查询对象
     * @return 所有数据
     */
    @Override
    @GetMapping
    @ApiOperation(value = "分页查询",httpMethod = "GET")
    public ApiResult list(@ChaosQuery(clazz = UserQuery.class) QueryCondition query) {
        UserQuery userQuery = (UserQuery) query;
        log.info("分页查询\t:[{}]", StringUtils.toString(userQuery));
        Page<SimpleUserDetail> pages = userService.queryList(userQuery);
        ApiPageResult apiPageResult =
            new ApiPageResult(pages.getTotal(), pages.getRecords(), query.getPage(), query.getPageSize());
        return ApiResult.ok(apiPageResult);
    }
}