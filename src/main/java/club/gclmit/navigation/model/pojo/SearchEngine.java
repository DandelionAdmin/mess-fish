package club.gclmit.navigation.model.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.io.Serializable;

/**
 * <p>
 * 搜索引擎
 *
 * </p>
 *
 * @author gclm
 * @since 2020-11-23
 */
@Data
@Builder
@TableName("website_search")
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "搜索引擎", description = "")
public class SearchEngine implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

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

    /**
     * 引擎状态
     */
    @ApiModelProperty(value = "引擎状态")
    private Integer status;
}
