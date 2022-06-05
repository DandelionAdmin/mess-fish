package club.gclmit.navigation.model.vo;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 登陆详情
 * </p>
 *
 * @author gclm
 * @since 1.8
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="登陆详情", description="")
public class LoginDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 跳转路径
     */
    private String path;

    /**
     * 用户详情
     */
    private SimpleUserDetail detail;

    public LoginDetail(String path, SimpleUserDetail detail) {
        this.path = path;
        this.detail = detail;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public SimpleUserDetail getDetail() {
        return detail;
    }

    public void setDetail(SimpleUserDetail detail) {
        this.detail = detail;
    }
}
