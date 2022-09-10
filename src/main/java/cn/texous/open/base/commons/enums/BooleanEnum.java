package cn.texous.open.base.commons.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Optional;

/**
 * Boolean 枚举值.
 * <p>
 * true 类型：1、true、ignoreCase("true")、"是" <br/>
 * false 类型：非 true 类型都为 false
 *
 * @author texousliu
 * @since 2022/7/30 11:44
 */
@Getter
@AllArgsConstructor
public enum BooleanEnum implements BaseEnum {

    FALSE(0, Boolean.FALSE, "false", "否"),
    TRUE(1, Boolean.TRUE, "true", "是"),
    ;

    private final Integer code;
    private final Boolean value;
    private final String valueStr;
    private final String message;

    public static Boolean isTrue(Integer code) {
        return Optional.ofNullable(code)
                .filter(TRUE::eq)
                .map(True::get)
                .orElse(Boolean.FALSE);
    }

    public static Boolean isFalse(Integer code) {
        return !isTrue(code);
    }

    public static Boolean isTrue(Boolean value) {
        return Optional.ofNullable(value)
                .filter(TRUE::eq)
                .orElse(Boolean.FALSE);
    }

    public static Boolean isFalse(Boolean value) {
        return !isTrue(value);
    }

    public static Boolean isTrue(String valueStr) {
        return Optional.ofNullable(valueStr)
                .filter(TRUE::eq)
                .map(True::get)
                .orElse(Boolean.FALSE);
    }

    public static Boolean isTrueIgnoreCase(String valueStr) {
        return Optional.ofNullable(valueStr)
                .filter(TRUE::eqIgnoreCase)
                .map(True::get)
                .orElse(Boolean.FALSE);
    }

    public static Boolean isFalse(String valueStr) {
        return !isTrue(valueStr);
    }

    public static Boolean isFalseIgnoreCase(String valueStr) {
        return !isTrueIgnoreCase(valueStr);
    }

    public static Boolean isTrueMessage(String message) {
        return Optional.ofNullable(message)
                .filter(TRUE::eqMessage)
                .map(True::get)
                .orElse(Boolean.FALSE);
    }

    public static Boolean isFalseMessage(String message) {
        return !isTrueMessage(message);
    }

    public static BooleanEnum get(Integer code) {
        return isTrue(code) ? BooleanEnum.TRUE : BooleanEnum.FALSE;
    }

    public static BooleanEnum get(Boolean value) {
        return isTrue(value) ? BooleanEnum.TRUE : BooleanEnum.FALSE;
    }

    public static BooleanEnum get(String valueStr) {
        return isTrue(valueStr) ? BooleanEnum.TRUE : BooleanEnum.FALSE;
    }

    public static BooleanEnum getIgnoreCase(String valueStr) {
        return isTrueIgnoreCase(valueStr) ? BooleanEnum.TRUE : BooleanEnum.FALSE;
    }

    public static BooleanEnum getMessage(String message) {
        return isTrueMessage(message) ? BooleanEnum.TRUE : BooleanEnum.FALSE;
    }

    public boolean eq(Boolean value) {
        return this.getValue().equals(value);
    }

    public boolean eq(String valueStr) {
        return this.getValueStr().equals(valueStr);
    }

    public boolean eqIgnoreCase(String valueStr) {
        return this.getValueStr().equalsIgnoreCase(valueStr);
    }

    private static final class True {

        public static Boolean get(Object o) {
            return Boolean.TRUE;
        }

    }

}
