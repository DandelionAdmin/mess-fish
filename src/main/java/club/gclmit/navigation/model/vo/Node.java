package club.gclmit.navigation.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * TODO
 *
 * @author gclm
 * @since 2020/11/24 14:32
 * @since 1.8
 */
@Data
@Builder
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="node", description="")
public class Node implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "网站图标")
    private String icon;

    @ApiModelProperty(value = "网站名字")
    private String name;

    @ApiModelProperty(value = "网站链接")
    private String url;

}
