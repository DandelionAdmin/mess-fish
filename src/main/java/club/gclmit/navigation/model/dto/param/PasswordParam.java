package club.gclmit.navigation.model.dto.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 修改密码参数
 * </p>
 *
 * @author gclm
 * @since 1.8
 */
@ApiModel(value="修改密码参数", description="修改密码参数")
public class PasswordParam {

    /**
     * 密码
     */
    @ApiModelProperty(value = "密码")
    private String password;

    /**
     * 更新密码
     */
    @ApiModelProperty(value = "更新密码")
    private String updatePassword;


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUpdatePassword() {
        return updatePassword;
    }

    public void setUpdatePassword(String updatePassword) {
        this.updatePassword = updatePassword;
    }
}
