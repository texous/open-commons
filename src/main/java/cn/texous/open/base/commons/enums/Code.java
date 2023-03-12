package cn.texous.open.base.commons.enums;

import java.util.Objects;

/**
 * 接口返状体枚举接口
 *
 * @author texousliu
 * @since 20220-07-23 14:00:00
 */
public interface Code {

    /**
     * 获取code值
     *
     * @return code
     */
    Integer getCode();

    /**
     * 获取msg
     *
     * @return msg
     */
    String getMessage();

    default boolean eq(Integer code) {
        return Objects.equals(code, this.getCode());
    }

    default boolean eqMessage(String message) {
        return Objects.equals(message, this.getMessage());
    }

}
