package club.gclmit.navigation.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import club.gclmit.navigation.model.pojo.WebsiteDetail;
import club.gclmit.navigation.model.pojo.WebsiteType;
import cn.hutool.core.lang.Console;

/**
 * 效验方法
 *
 * @author gclm
 */
@SpringBootTest
public class WebsiteDetailServiceTest {

    @Autowired
    private WebsiteDetailService detailService;

    @Autowired
    private WebsiteTypeService typeService;

    public static final String API = "https://www.google.com/s2/favicons?domain=";

    @Test
    public void add() {
        List<WebsiteDetail> detailList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            WebsiteDetail detail = new WebsiteDetail();
            detail.setTypeId(1L);
            detail.setTypeName("常用/搜索");
            detail.setIcon("type-icon-" + i);
            detail.setName("test-" + i);
            detail.setUrl("http://baidu" + i + ".com");
            detail.setHash("1243" + i);
            detail.setStatus(0);
            detailList.add(detail);
        }
        detailService.saveBatch(detailList);
    }

    @Test
    public void list() {
        List<WebsiteDetail> details = detailService.list();
        details.forEach(System.out::println);
    }

    @Test
    public void getFavicon() {
        List<WebsiteDetail> details = detailService.list();
        for (WebsiteDetail detail : details) {
            String url = detail.getUrl();
            Console.log("网站：{}\t图标：{}", detail.getName(), judgeFaviconStatus(url));
        }
    }

    @Test
    public void update() {
        detailService.list().forEach(websiteDetail -> {
            WebsiteType type = typeService.getById(websiteDetail.getTypeId());
            websiteDetail.setTypeName(type.getName());
            websiteDetail.setStatus(0);
            detailService.updateById(websiteDetail);
        });
    }

    /**
     * 效验Favicon状态
     *
     * @param url : 网站连接
     * @return boolean
     * @author gclm
     */
    public static boolean judgeFaviconStatus(String url) {
        if (url.contains("https://")) {
            url = url.substring(0, url.length() - 1).replace("https://", "");
        } else if (url.contains("http://")) {
            url = url.substring(0, url.length() - 1).replace("http://", "");
        }
        String icon = API + url;
        return false;
        // return HttpUtils.judgeUrl(icon);
    }
}
