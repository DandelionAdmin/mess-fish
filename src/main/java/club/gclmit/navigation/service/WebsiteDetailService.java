package club.gclmit.navigation.service;

import java.util.List;

import club.gclmit.navigation.model.dto.query.DetailQuery;
import club.gclmit.navigation.model.pojo.WebsiteDetail;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author gclm
 * @since 2020-11-23
 */
public interface WebsiteDetailService extends IService<WebsiteDetail> {

    List<WebsiteDetail> getEnableDetailList();

    Page<WebsiteDetail> queryList(DetailQuery query);
}
