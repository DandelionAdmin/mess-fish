package club.gclmit.navigation.service;

import java.util.ArrayList;
import java.util.List;
import club.gclmit.navigation.model.pojo.WebsiteType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Type Service
 *
 * @author gclm
 */
@SpringBootTest
public class WebsiteTypeServiceTest {

    @Autowired
    private WebsiteTypeService typeService;

    @Test
    public void add(){
        List<WebsiteType> typeList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            WebsiteType websiteType = new WebsiteType();
            websiteType.setIcon("type-icon-"+i);
            websiteType.setName("test-"+i);
            websiteType.setStatus(0);
            typeList.add(websiteType);
        }
        typeService.saveBatch(typeList);
    }
}
