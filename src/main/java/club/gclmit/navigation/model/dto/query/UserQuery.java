package club.gclmit.navigation.model.dto.query;

import club.gclmit.chaos.web.controller.QueryCondition;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

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
public class UserQuery extends QueryCondition {

    /**
     *  用户id
     */
    @ApiModelProperty(value = "用户id")
    private Long userId;

    /**
     * 手机号
     */
    @ApiModelProperty(value = "手机号")
    private String phone;

    /**
     * 电子邮箱
     */
    @ApiModelProperty(value = "电子邮箱")
    private String email;

    /**
     *  昵称
     */
    @ApiModelProperty(value = "昵称")
    private String nickname;

    /**
     * 角色
     */
    @ApiModelProperty(value = "角色")
    private Integer role;

    /**
     * 角色筛选字段
     */
    @ApiModelProperty(value = "角色筛选字段")
    private Integer status;
}