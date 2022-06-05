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
public class TypeQuery extends QueryCondition {

    /**
     *  名字
     */
    @ApiModelProperty(value = "昵称")
    private String name;

    /**
     * 状态
     */
    @ApiModelProperty(value = "状态")
    private Integer status;
}