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
import club.gclmit.navigation.mapper.WebsiteTypeMapper;
import club.gclmit.navigation.model.dto.query.TypeQuery;
import club.gclmit.navigation.model.pojo.EnableStatus;
import club.gclmit.navigation.model.pojo.WebsiteType;
import club.gclmit.navigation.model.vo.TypeSelect;
import club.gclmit.navigation.service.WebsiteTypeService;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author gclm
 * @since 2020-11-23
 */
@Service
public class WebsiteTypeServiceImpl extends ServiceImpl<WebsiteTypeMapper, WebsiteType> implements WebsiteTypeService {

    @Autowired
    private WebsiteTypeMapper typeMapper;

    /**
     * 获取启用网站类型
     * @author gclm
     * @date 12/16/2020 12:22 PM
     * @return java.util.List<club.gclmit.navigation.model.pojo.WebsiteType>
     */
    @Override
    public List<WebsiteType> getEnableTypeList() {
        LambdaQueryWrapper<WebsiteType> queryWrapper = new QueryWrapper<WebsiteType>().lambda();
        queryWrapper.eq(WebsiteType::getStatus, EnableStatus.ENABLE.getCode());
        return typeMapper.selectList(queryWrapper);
    }

    /**
     * 查询所有类型列表
     * @author gclm
     * @param query 查询参数
     * @date 12/21/2020 3:31 PM
     * @return com.baomidou.mybatisplus.extension.plugins.pagination.Page<club.gclmit.navigation.model.pojo.WebsiteType>
     */
    @Override
    public Page<WebsiteType> queryList(TypeQuery query) {
        Integer status = query.getStatus();
        String name = query.getName();
        LambdaQueryWrapper<WebsiteType> queryWrapper = new QueryWrapper<WebsiteType>().lambda();

        if (status != null) {
            queryWrapper.eq(WebsiteType::getStatus, query.getStatus());
        }

        if (StringUtils.isNotEmpty(name)) {
            queryWrapper.like(WebsiteType::getName, name);
        }
        return typeMapper.selectPage(new Page<>(query.getPage(), query.getPageSize()), queryWrapper);
    }

    /**
     * 获取下拉列表
     * @author gclm
     * @date 12/21/2020 5:05 PM
     * @return java.util.List<club.gclmit.navigation.model.vo.TypeSelect>
     */
    @Override
    public List<TypeSelect> getSelectList() {
        return BeanUtils.copyList(list(), TypeSelect.class);
    }
}
