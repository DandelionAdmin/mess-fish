package club.gclmit.navigation.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

/**
 * TODO
 *
 * @author gclm
 * @since 2020/11/24 14:30
 * @since 1.8
 */
@Data
@Builder
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Website对象", description="")
public class Website implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "类型图标")
    private String icon;

    @ApiModelProperty(value = "类型名字")
    private String name;

    @ApiModelProperty(value = "类型站点")
    private List<Node> node;
}

