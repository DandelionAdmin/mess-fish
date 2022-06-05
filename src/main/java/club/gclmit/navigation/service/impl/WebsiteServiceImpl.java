package club.gclmit.navigation.service.impl;

import club.gclmit.navigation.model.vo.Node;
import club.gclmit.navigation.model.vo.Website;
import club.gclmit.navigation.model.pojo.WebsiteDetail;
import club.gclmit.navigation.model.pojo.WebsiteType;
import club.gclmit.navigation.service.WebsiteDetailService;
import club.gclmit.navigation.service.WebsiteService;
import club.gclmit.navigation.service.WebsiteTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author gclm
 * @since 2020-11-23
 */
@Service
public class WebsiteServiceImpl implements WebsiteService {

    @Autowired
    private WebsiteTypeService typeService;

    @Autowired
    private WebsiteDetailService detailService;

    /**
     * 获取已经启用的网站列表
     * @author gclm
     * @date 12/16/2020 12:31 PM
     * @return java.util.List<club.gclmit.navigation.model.dto.Website>
     */
    @Override
    public List<Website> getEnableWebsiteList() {
        List<WebsiteType> typeList = typeService.getEnableTypeList();
        List<WebsiteDetail> detailList = detailService.getEnableDetailList();

        return typeList.stream().map(websiteType -> {
            Website website = Website.builder().icon(websiteType.getIcon()).name(websiteType.getName()).build();

            /**
             * 1.先根据类型进行筛选出对象的集合
             * 2.进行Bean Copy
             * 3.组装List集合
             */
            List<Node> nodes = detailList.stream()
                    .filter(websiteDetail -> websiteDetail.getTypeId().equals(websiteType.getId()))
                    .map(websiteDetail -> Node.builder()
                             .icon(websiteDetail.getIcon()).name(websiteDetail.getName())
                             .url(websiteDetail.getUrl()).build())
                    .collect(Collectors.toList());

            website.setNode(nodes);
            return website;
        }).collect(Collectors.toList());
    }
}
