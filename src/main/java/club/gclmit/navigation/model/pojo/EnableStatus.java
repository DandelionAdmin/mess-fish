package club.gclmit.navigation.model.pojo;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 启用或禁用状态码
 *
 * @author gclm
 * @since 12/16/2020 12:17 PM
 * @since 1.8
 */
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum EnableStatus {

    ENABLE(0),

    DISABLE(1);

    /**
     * 状态码
     */
    private Integer Code;
}
