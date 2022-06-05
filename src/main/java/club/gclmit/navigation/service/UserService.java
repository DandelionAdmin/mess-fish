package club.gclmit.navigation.service;

import club.gclmit.navigation.model.dto.param.LoginParam;
import club.gclmit.navigation.model.dto.param.PasswordParam;
import club.gclmit.navigation.model.pojo.User;
import club.gclmit.navigation.model.dto.query.UserQuery;
import club.gclmit.navigation.model.vo.SimpleUserDetail;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 用户表(User)
 *
 * @author gclm
 * @since 2020-12-19 22:39:49
 */
public interface UserService extends IService<User> {

    boolean addUser(User user);

    String updatePassword(String id, PasswordParam param);

    SimpleUserDetail login(LoginParam params);

    Page<SimpleUserDetail> queryList(UserQuery query);
}