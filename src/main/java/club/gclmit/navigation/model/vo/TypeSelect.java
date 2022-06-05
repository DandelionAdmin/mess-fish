package club.gclmit.navigation.model.vo;

import io.swagger.annotations.ApiModel;
import lombok.*;

/**
 * 网站类型下拉框封装
 *
 * @author gclm
 * @since 12/21/2020 5:01 PM
 * @since 1.8
 */
@Getter
@Setter
@ToString
@ApiModel(value = "网站类型下拉选项", description = "")
public class TypeSelect {

    /**
     * 网站类型ID
     */
    private Long id;

    /**
     *网站类型名字
     */
    private String name;
}
