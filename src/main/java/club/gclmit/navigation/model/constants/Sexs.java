package club.gclmit.navigation.model.constants;

import lombok.Getter;
import lombok.ToString;

/**
 * <p>
 *  性别枚举
 * </p>
 *
 * @author gclm
 * @since 1.8
 */
@Getter
@ToString
public enum Sexs {

    /**
     * 男
     */
    MALE(0,"男性"),

    /**
     * 女性
     */
    FEMALE(1,"女性");

    /**
     * 枚举ID
     */
    private Integer id;

    /**
     * 枚举描述
     */
    private String name;

    Sexs(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public static String getNameById(Integer id){
        Sexs[] values = Sexs.values();
        for (Sexs  sex : values()) {
            if (sex.getId().equals(id)){
                return sex.getName();
            }
        }
        return MALE.getName();
    }

}
