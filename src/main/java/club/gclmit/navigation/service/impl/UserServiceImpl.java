package club.gclmit.navigation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import club.gclmit.chaos.core.utils.BeanUtils;
import club.gclmit.chaos.core.utils.StringUtils;
import club.gclmit.navigation.mapper.UserMapper;
import club.gclmit.navigation.model.constants.Roles;
import club.gclmit.navigation.model.dto.param.LoginParam;
import club.gclmit.navigation.model.dto.param.PasswordParam;
import club.gclmit.navigation.model.dto.query.UserQuery;
import club.gclmit.navigation.model.pojo.User;
import club.gclmit.navigation.model.vo.SimpleUserDetail;
import club.gclmit.navigation.service.UserService;
import lombok.extern.slf4j.Slf4j;

/**
 * 用户表(User)
 *
 * @author gclm
 * @since 2020-12-19 22:39:51
 */
@Slf4j
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     *  登录
     *
     * @author gclm
     * @param loginParam : 登录参数
     * @return club.gclmit.navigation.model.vo.SimpleUserDetail
     */
    @Override
    public SimpleUserDetail login(LoginParam loginParam) {

        /**
         * 进行查询登陆操作
         */
        LambdaQueryWrapper<User> queryWrapper = new QueryWrapper<User>().lambda();
        queryWrapper.eq(User::getPhone,loginParam.getPhone());
        User user = userMapper.selectOne(queryWrapper);

        if (user != null && loginParam.getPassword().equals(user.getPassword())) {
            return BeanUtils.copyBean(user, SimpleUserDetail.class);
        }
        return null;
    }

    /**
     *  添加用户
     *
     * @author gclm
     * @param user  User
     * @return boolean
     */
    @Override
    public boolean addUser(User user) {

        LambdaQueryWrapper<User> queryWrapper = new QueryWrapper<User>().lambda();
        queryWrapper.eq(User::getPhone,user.getPhone());
        User findUser = userMapper.selectOne(queryWrapper);
        if (findUser == null) {
            save(user);
            return true;
        }
        return false;
    }

    /**
     *  查询用户列表
     *
     * @author gclm
     * @param query 查询参数
     * @return com.baomidou.mybatisplus.extension.plugins.pagination.Page<club.gclmit.train.model.vo.UserDetail>
     */
    @Override
    public Page<SimpleUserDetail> queryList(UserQuery query) {
        /**
         * 初始化参数
         */
        Integer role = query.getRole();
        String email = query.getEmail();
        String nickname = query.getNickname();
        String phone = query.getPhone();
        log.info("当前查询角色：{}",role);
        LambdaQueryWrapper<User> queryWrapper = new QueryWrapper<User>().lambda();

        /**
         * 基于角色查询
         */
        if (role != null && Roles.GUEST.getId().equals(role)) {
            queryWrapper.eq(User::getRole,Roles.GUEST.getId());
        }

        if (query.getStatus() != null) {
            queryWrapper.eq(User::getRole,query.getStatus());
        }

        /**
         * 其他条件判定
         */
        if (StringUtils.isNotEmpty(email)) {
            queryWrapper.like(User::getEmail,email);
        }

        if (StringUtils.isNotEmpty(nickname)) {
            queryWrapper.like(User::getNickname,nickname);
        }

        if (StringUtils.isNotEmpty(phone)) {
            queryWrapper.like(User::getPhone,phone);
        }

        Page<User> page = userMapper.selectPage(new Page<>(query.getPage(), query.getPageSize()), queryWrapper);

        return new Page<SimpleUserDetail>().setTotal(page.getTotal())
            .setRecords(BeanUtils.copyList(page.getRecords(), SimpleUserDetail.class));
    }


    /**
     * 修改密码
     *
     * @author gclm
     * @param id    用户id
     * @param param 修改密码参数
     * @return java.lang.String
     */
    @Override
    public String updatePassword(String id, PasswordParam param) {
        User user = getById(id);
        String message = "密码修改成功";
        if (user == null) {
            message = "修改密码失败,当前用户不存在";
        } else if (!param.getPassword().equals(user.getPassword())) {
            message = "修改密码失败,旧密码不正确";
        } else {
            User saveUser = new User(user.getId(),param.getUpdatePassword());
            boolean b = updateById(saveUser);
            if (!b) {
                message = "修改密码失败,当前网络繁忙,请稍后再试";
            }
        }
        return message;
    }
}