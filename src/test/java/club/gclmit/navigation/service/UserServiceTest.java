package club.gclmit.navigation.service;

import java.util.ArrayList;
import java.util.List;
import club.gclmit.navigation.model.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * User Service
 *
 * @author gclm
 * @since 12/21/2020 3:05 PM
 * @since 1.8
 */
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void add(){
        List<User> userList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setNickname("test" + i);
            user.setPassword("123456");
            user.setEmail("171998267"+i+"@qq.com");
            user.setSex(0);
            user.setAge(11);
            user.setRole(1);
            user.setPhone("1732603951"+i);
            user.setAvatar("https://image.coderlab.cn/preview/1340673166610694146");
            userList.add(user);
        }
        userService.saveBatch(userList);
    }
}
