package club.gclmit.navigation.mapper;

import club.gclmit.navigation.model.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * 用户表(User)
 *
 * @author gclm
 * @since 2020-12-19 22:40:02
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
}