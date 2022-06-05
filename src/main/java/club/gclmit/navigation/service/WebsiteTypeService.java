package club.gclmit.navigation.service;

import club.gclmit.navigation.model.dto.query.TypeQuery;
import club.gclmit.navigation.model.pojo.WebsiteType;
import club.gclmit.navigation.model.vo.TypeSelect;
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
public interface WebsiteTypeService extends IService<WebsiteType> {

    public List<WebsiteType> getEnableTypeList();

    Page<WebsiteType> queryList(TypeQuery query);

    List<TypeSelect> getSelectList();
}
