package cn.texous.open.base.commons.enums;

import java.util.Objects;

/**
 * 自定义枚举基类
 *
 * @author texousliu
 * @since 2022/7/30 11:42
 */
public interface BaseEnum extends Code {

    /**
     * 获取名称
     */
    String name();

    default boolean eqName(String name) {
        return Objects.equals(this.name(), name);
    }

    default boolean eqNameIgnoreCase(String name) {
        return (this.name() == null && name == null) || (name != null && name.equalsIgnoreCase(this.name()));
    }

}
