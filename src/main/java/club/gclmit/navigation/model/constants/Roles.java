package club.gclmit.navigation.model.constants;

import lombok.Getter;
import lombok.ToString;

/**
 * <p>
 * 角色枚举
 * </p>
 *
 * @author gclm
 * @since 1.8
 */
@Getter
@ToString
public enum Roles {

    /**
     * 管理员
     */
    ADMIN(0, "管理员", "admin"),

    /**
     * 游客
     */
    GUEST(1, "游客", "guest");

    /**
     * 枚举ID
     */
    private Integer id;

    /**
     * 枚举描述
     */
    private String name;

    /**
     * 内容
     */
    private String menu;


    Roles(Integer id, String name, String menu) {
        this.id = id;
        this.name = name;
        this.menu = menu;
    }

    public static String getName(Integer id) {
        Roles[] values = Roles.values();
        for (Roles role : values()) {
            if (role.getId().equals(id)) {
                return role.getName();
            }
        }
        return GUEST.getName();
    }

    public static String getMenu(Integer id) {
        Roles[] values = Roles.values();
        for (Roles role : values()) {
            if (role.getId().equals(id)) {
                return role.getMenu();
            }
        }
        return GUEST.getMenu();
    }
}
