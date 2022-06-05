package club.gclmit.navigation.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * 简单用户详情
 * </p>
 *
 * @author 孤城落寞
 * @since 2020-01-28
 */
@Getter
@Setter
@ToString
@ApiModel(value="用户详情", description="用户详情")
public class SimpleUserDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @ApiModelProperty(value = "id")
    private Long id;

    /**
     * 昵称
     */
    @ApiModelProperty(value = "昵称")
    private String nickname;

    /**
     * 电子邮箱
     */
    @ApiModelProperty(value = "电子邮箱")
    private String email;

    /**
     * 性别
     */
    @ApiModelProperty(value = "性别")
    private Integer sex;

    /**
     * 年龄
     */
    @ApiModelProperty(value = "年龄")
    private Integer age;

    /**
     * 角色
     */
    @ApiModelProperty(value = "角色")
    private Integer role;

    /**
     * 手机号
     */
    @ApiModelProperty(value = "手机号")
    private String phone;

    /**
     * 头像
     */
    @ApiModelProperty(value = "头像")
    private String avatar;

    /**
     * 签名
     */
    @ApiModelProperty(value = "签名")
    private String sign;

    public SimpleUserDetail() {
    }

    public SimpleUserDetail(String nickname, String email, Integer sex, Integer role) {
        this.nickname = nickname;
        this.email = email;
        this.sex = sex;
        this.role = role;
    }
}
