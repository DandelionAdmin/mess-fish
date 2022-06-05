package club.gclmit.navigation.service;

import club.gclmit.navigation.model.vo.Website;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author gclm
 * @since 2020-11-23
 */
public interface WebsiteService {

    List<Website> getEnableWebsiteList();
}
