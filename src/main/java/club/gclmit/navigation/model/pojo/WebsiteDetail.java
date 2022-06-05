package club.gclmit.navigation.model.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;

/**
 * <p>
 * 网站详情
 * </p>
 *
 * @author gclm
 * @since 2020-11-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@ApiModel(value="网站详情", description="")
public class WebsiteDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 网站类型Id
     */
    @ApiModelProperty(value = "网站类型Id")
    private Long typeId;

    /**
     * 网站类型名字
     */
    @ApiModelProperty(value = "网站类型名字")
    private String typeName;

    /**
     * 网站图标
     */
    @ApiModelProperty(value = "网站图标")
    private String icon;

    /**
     * 网站名字
     */
    @ApiModelProperty(value = "网站名字")
    private String name;

    /**
     * 网站链接
     */
    @ApiModelProperty(value = "网站链接")
    private String url;

    /**
     * 网站链接的hash值
     */
    @ApiModelProperty(value = "网站链接的hash值")
    private String hash;

    /**
     * 网站状态
     */
    @ApiModelProperty(value = "网站状态")
    private Integer status;

    public WebsiteDetail(Long id, Integer status) {
        this.id = id;
        this.status = status;
    }
}
