package club.gclmit.navigation.service;

import java.util.ArrayList;
import java.util.List;
import club.gclmit.navigation.model.vo.Website;
import club.gclmit.navigation.model.pojo.WebsiteDetail;
import club.gclmit.navigation.model.pojo.WebsiteType;
import cn.hutool.core.io.resource.ResourceUtil;
import cn.hutool.crypto.SecureUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Website测试
 *
 * @author gclm
 * @since 2020/11/21 14:32
 * @since 1.8
 */
@SpringBootTest
public class WebSiteServiceTest {

    @Autowired
    private WebsiteDetailService detailService;

    @Autowired
    private WebsiteTypeService typeService;

    @Autowired
    private WebsiteService websiteService;

//    @Test
//    public void insert() {
//        String str = ResourceUtil.readUtf8Str("data.json");
//        List<WebsiteType> typeList = new ArrayList<>(10);
//        List<WebsiteDetail> detailList = new ArrayList<>();
//
//        JSONArray jsonArray = JSONArray.parseArray(str);
//        for (int i = 0; i < jsonArray.size(); i++) {
//            JSONObject jsonObject = jsonArray.getJSONObject(i);
//            WebsiteType type = WebsiteType.builder().icon(jsonObject.getString("icon")).name(jsonObject.getString("title")).build();
//            typeList.add(type);
//            JSONArray node = jsonObject.getJSONArray("node");
//            for (int j = 0; j < node.size(); j++) {
//                JSONObject object = node.getJSONObject(j);
//                String url = object.getString("url");
//                String hash = SecureUtil.md5(url);
//                int typeId = i;
//                WebsiteDetail detail = WebsiteDetail.builder().url(url)
//                        .hash(hash).name(object.getString("text"))
//                        .icon(object.getString("icon"))
//                        .type((long) ++typeId).build();
//                detailList.add(detail);
//            }
//        }
//
//        typeService.saveBatch(typeList);
//        detailService.saveBatch(detailList);
//
//        for (WebsiteType type : typeList) {
//            System.out.println(type);
//        }
//
//        for (WebsiteDetail detail : detailList) {
//            System.out.println(detail);
//        }
//    }



    @Test
    public void getWebsite(){
        List<Website> websites = websiteService.getEnableWebsiteList();
        for (Website site: websites){
            System.out.println(site);
        }
        String jsonString = JSON.toJSONString(websites);
        System.out.println(jsonString);
    }

}
