package club.gclmit.navigation.model.dto.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * <p>
 * 登陆请求参数
 * </p>
 *
 * @author gclm
 * @since 1.8
 */
@Getter
@Setter
@ToString
@ApiModel(value="登陆请求参数", description="登陆请求参数")
public class LoginParam {

    /**
     * 手机号
     */
    @ApiModelProperty(value = "手机号")
    private String phone;

    /**
     * 密码
     */
    @ApiModelProperty(value = "密码")
    private String password;

}
