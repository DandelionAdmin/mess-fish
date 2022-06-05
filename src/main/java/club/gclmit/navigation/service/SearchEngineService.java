package club.gclmit.navigation.service;

import club.gclmit.navigation.model.dto.query.EngineQuery;
import club.gclmit.navigation.model.pojo.SearchEngine;
import club.gclmit.navigation.model.vo.SimpleSearchEngine;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author gclm
 * @since 2020-11-23
 */
public interface SearchEngineService extends IService<SearchEngine> {

    List<SimpleSearchEngine> getEnableEngineList();

    Page<SearchEngine> queryList(EngineQuery engineQuery);
}
