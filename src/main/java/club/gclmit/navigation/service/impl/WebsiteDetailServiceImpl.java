package club.gclmit.navigation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import club.gclmit.chaos.core.utils.StringUtils;
import club.gclmit.navigation.mapper.WebsiteDetailMapper;
import club.gclmit.navigation.model.dto.query.DetailQuery;
import club.gclmit.navigation.model.pojo.EnableStatus;
import club.gclmit.navigation.model.pojo.WebsiteDetail;
import club.gclmit.navigation.service.WebsiteDetailService;

/**
 * <p>
 *  网站详情 服务
 * </p>
 *
 * @author gclm
 * @since 2020-11-23
 */
@Service
public class WebsiteDetailServiceImpl extends ServiceImpl<WebsiteDetailMapper, WebsiteDetail> implements WebsiteDetailService {

    @Autowired
    private WebsiteDetailMapper detailMapper;

    /**
     * 获取启用的网站详情列表
     * @author gclm
     * @date 12/16/2020 12:27 PM
     * @return java.util.List<club.gclmit.navigation.model.pojo.WebsiteDetail>
     */
    @Override
    public List<WebsiteDetail> getEnableDetailList() {
        LambdaQueryWrapper<WebsiteDetail> queryWrapper = new QueryWrapper<WebsiteDetail>().lambda();
        queryWrapper.eq(WebsiteDetail::getStatus, EnableStatus.ENABLE.getCode());
        return detailMapper.selectList(queryWrapper);
    }

    /**
     * 查询所有类型列表
     * @author gclm
     * @param query  查询参数
     * @date 12/21/2020 3:31 PM
     * @return com.baomidou.mybatisplus.extension.plugins.pagination.Page<club.gclmit.navigation.model.pojo.WebsiteDetail>
     */
    @Override
    public Page<WebsiteDetail> queryList(DetailQuery query) {
        Integer status = query.getStatus();
        String name = query.getName();
        String typeName = query.getTypeName();

        LambdaQueryWrapper<WebsiteDetail> queryWrapper = new QueryWrapper<WebsiteDetail>().lambda();

        if (status != null) {
            queryWrapper.eq(WebsiteDetail::getStatus, query.getStatus());
        }

        if (StringUtils.isNotEmpty(name)) {
            queryWrapper.like(WebsiteDetail::getName, name);
        }

        if (StringUtils.isNotEmpty(typeName)) {
            queryWrapper.like(WebsiteDetail::getTypeName, typeName);
        }

        return detailMapper.selectPage(new Page<>(query.getPage(), query.getPageSize()), queryWrapper);

    }
}
