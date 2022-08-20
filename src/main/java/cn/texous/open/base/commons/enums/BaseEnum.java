package cn.texous.open.base.commons.enums;

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


    default boolean eq(Integer code) {
        return this.getCode().equals(code);
    }

}
