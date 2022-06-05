package club.gclmit.navigation.service;

import club.gclmit.navigation.model.pojo.SearchEngine;
import cn.hutool.core.io.resource.ResourceUtil;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @author gclm
 */
@SpringBootTest
public class SearchEngineServiceTest {

    @Autowired
    private SearchEngineService engineService;

    @Test
    public void insert(){
        String str = ResourceUtil.readUtf8Str("data/search.json");
        JSONArray array = JSONArray.parseArray(str);
        List<SearchEngine>  engines = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            JSONObject object = array.getJSONObject(i);
            String name = object.getString("name");
            String icon = object.getString("icon");
            String url = object.getString("url");
            SearchEngine engine = SearchEngine.builder()
                    .icon(icon)
                    .name(name)
                    .url(url)
                    .status(0).build();
            engines.add(engine);
        }

        engines.forEach(System.out::println);

        engineService.saveBatch(engines);
    }
}
