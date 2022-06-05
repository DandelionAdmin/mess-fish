package club.gclmit.navigation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import club.gclmit.chaos.core.utils.StringUtils;
import club.gclmit.chaos.web.annotation.ChaosQuery;
import club.gclmit.chaos.web.controller.QueryCondition;
import club.gclmit.chaos.web.controller.RestApiController;
import club.gclmit.chaos.web.result.ApiPageResult;
import club.gclmit.chaos.web.result.ApiResult;
import club.gclmit.navigation.model.dto.query.TypeQuery;
import club.gclmit.navigation.model.pojo.WebsiteType;
import club.gclmit.navigation.model.vo.TypeSelect;
import club.gclmit.navigation.service.WebsiteTypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author gclm
 * @since 2020-11-23
 */
@Slf4j
@RestController
@RequestMapping("/api/website/type")
@Api(value = "网站类型管理", tags = "网站类型")
public class WebsiteTypeController extends RestApiController<WebsiteTypeService, WebsiteType> {

    @Autowired
    private WebsiteTypeService typeService;

    /**
     * 分页查询所有数据
     *
     * @param queryCondition 分页查询对象
     * @return 所有数据
     */
    @Override
    @GetMapping
    @ApiOperation(value = "分页查询", httpMethod = "GET")
    public ApiResult list(@ChaosQuery(clazz = TypeQuery.class) QueryCondition queryCondition) {
        TypeQuery query = (TypeQuery)queryCondition;
        log.info("分页查询\t:[{}]", StringUtils.toString(query));
        Page<WebsiteType> pages = typeService.queryList(query);
        ApiPageResult apiPageResult =
            new ApiPageResult(pages.getTotal(), pages.getRecords(), query.getPage(), query.getPageSize());
        return ApiResult.ok(apiPageResult);
    }

    /**
     * 选择列表
     * 
     * @author gclm
     * @date 2020/3/25 11:15 上午
     * @return club.gclmit.chaos.web.response.Result
     */
    @GetMapping("/select")
    @ApiOperation(value = "选择列表")
    public ApiResult getSelectList() {
        List<TypeSelect> list = typeService.getSelectList();
        return ApiResult.ok(list);
    }
}
