package club.gclmit.navigation.model.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;

/**
 * <p>
 * 网站类型
 * </p>
 *
 * @author gclm
 * @since 2020-11-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@ApiModel(value="网站类型", description="")
public class WebsiteType implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 类型图标
     */
    @ApiModelProperty(value = "类型图标")
    private String icon;

    /**
     * 类型名字
     */
    @ApiModelProperty(value = "类型名字")
    private String name;

    /**
     * 类型状态
     */
    @ApiModelProperty(value = "类型状态")
    private Integer status;

    public WebsiteType(Long id, Integer status) {
        this.id = id;
        this.status = status;
    }
}
