package cn.texous.open.base.commons.enums;

/**
 * 自定义枚举基类
 *
 * @author texousliu
 * @since 2022/7/30 11:42
 */
public interface BaseEnum {
    /**
     * 获取枚举编码
     */
    Integer getCode();

    /**
     * 获取枚举描述
     */
    String getDesc();


    default boolean eq(Integer code) {
        return this.getCode().equals(code);
    }

}
