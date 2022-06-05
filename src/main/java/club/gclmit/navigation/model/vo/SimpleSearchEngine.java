package club.gclmit.navigation.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 搜索引擎详情
 *
 * @author gclm
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="搜索引擎详情", description="")
public class SimpleSearchEngine {

    /**
     * 引擎图标
     */
    @ApiModelProperty(value = "引擎图标")
    private String icon;

    /**
     * 引擎名字
     */
    @ApiModelProperty(value = "引擎名字")
    private String name;

    /**
     * 搜索链接
     */
    @ApiModelProperty(value = "搜索链接")
    private String url;
}
