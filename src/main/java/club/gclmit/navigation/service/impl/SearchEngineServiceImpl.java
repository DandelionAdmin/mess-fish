package club.gclmit.navigation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import club.gclmit.chaos.core.utils.BeanUtils;
import club.gclmit.chaos.core.utils.StringUtils;
import club.gclmit.navigation.mapper.SearchEngineMapper;
import club.gclmit.navigation.model.dto.query.EngineQuery;
import club.gclmit.navigation.model.pojo.EnableStatus;
import club.gclmit.navigation.model.pojo.SearchEngine;
import club.gclmit.navigation.model.vo.SimpleSearchEngine;
import club.gclmit.navigation.service.SearchEngineService;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author gclm
 * @since 2020-11-23
 */
@Service
public class SearchEngineServiceImpl extends ServiceImpl<SearchEngineMapper, SearchEngine> implements SearchEngineService {

    @Autowired
    private SearchEngineMapper engineMapper;

    /**
     * 获取启用的引擎列表
     *
     * @return java.util.List<club.gclmit.navigation.model.pojo.SearchEngine>
     * @author gclm
     * @date 12/16/2020 12:24 PM
     */
    @Override
    public List<SimpleSearchEngine> getEnableEngineList() {
        LambdaQueryWrapper<SearchEngine> queryWrapper = new QueryWrapper<SearchEngine>().lambda();
        queryWrapper.eq(SearchEngine::getStatus, EnableStatus.ENABLE.getCode());
        return BeanUtils.copyList(engineMapper.selectList(queryWrapper), SimpleSearchEngine.class);
    }

    /**
     * 查询引擎列表
     * @author gclm
     * @param query  查询参数
     * @date 12/21/2020 1:00 PM
     * @return com.baomidou.mybatisplus.extension.plugins.pagination.Page<club.gclmit.navigation.model.pojo.SearchEngine>
     */
    @Override
    public Page<SearchEngine> queryList(EngineQuery query) {


        Integer status = query.getStatus();
        String name = query.getName();
        LambdaQueryWrapper<SearchEngine> queryWrapper = new QueryWrapper<SearchEngine>().lambda();

        if (status != null) {
            queryWrapper.eq(SearchEngine::getStatus, query.getStatus());
        }

        if (StringUtils.isNotEmpty(name)) {
            queryWrapper.like(SearchEngine::getName, name);
        }

        return engineMapper.selectPage(new Page<>(query.getPage(), query.getPageSize()), queryWrapper);
    }
}
