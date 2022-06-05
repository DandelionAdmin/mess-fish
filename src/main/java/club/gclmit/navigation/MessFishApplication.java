package club.gclmit.navigation;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author gclm
 */
@MapperScan("club.gclmit.navigation.mapper")
@SpringBootApplication
public class MessFishApplication {
    public static void main(String[] args) {
        SpringApplication.run(MessFishApplication.class, args);
    }
}
