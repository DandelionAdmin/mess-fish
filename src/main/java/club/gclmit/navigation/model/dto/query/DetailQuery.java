package club.gclmit.navigation.model.dto.query;

import club.gclmit.chaos.web.controller.QueryCondition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 查询条件封装
 * </p>
 *
 * @author gclm
 * @since 1.8
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "查询条件")
public class DetailQuery extends QueryCondition {

    /**
     *  类型名字
     */
    @ApiModelProperty(value = "类型名字")
    private String typeName;

    /**
     * 网站名字
     */
    @ApiModelProperty(value = "网站名字")
    private String name;

    /**
     * 网站状态
     */
    @ApiModelProperty(value = "网站状态")
    private Integer status;
}