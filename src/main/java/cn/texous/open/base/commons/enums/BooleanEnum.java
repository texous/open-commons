package cn.texous.open.base.commons.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;

/**
 * Boolean 枚举值.
 * <p>
 * false 类型：0、false、ignoreCase("false")、"否" <br/>
 * true 类型：非 false 类型都为 true
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
        return !isFalse(code);
    }

    public static Boolean isFalse(Integer code) {
        return Optional.ofNullable(code)
                .filter(FALSE::eq)
                .map(TRUE_RETURN)
                .orElse(Boolean.FALSE);
    }

    public static Boolean isTrue(Boolean value) {
        return !isFalse(value);
    }

    public static Boolean isFalse(Boolean value) {
        return Optional.ofNullable(value)
                .filter(FALSE::eq)
                .map(TRUE_RETURN)
                .orElse(Boolean.FALSE);
    }

    public static Boolean isTrue(String valueStr) {
        return !isFalse(valueStr);
    }

    public static Boolean isTrueIgnoreCase(String valueStr) {
        return !isFalseIgnoreCase(valueStr);
    }

    public static Boolean isFalse(String valueStr) {
        return Optional.ofNullable(valueStr)
                .filter(FALSE::eq)
                .map(TRUE_RETURN)
                .orElse(Boolean.FALSE);
    }

    public static Boolean isFalseIgnoreCase(String valueStr) {
        return Optional.ofNullable(valueStr)
                .filter(FALSE::eqIgnoreCase)
                .map(TRUE_RETURN)
                .orElse(Boolean.FALSE);
    }

    public static Boolean isTrueMessage(String message) {
        return !isFalseMessage(message);
    }

    public static Boolean isFalseMessage(String message) {
        return Optional.ofNullable(message)
                .filter(FALSE::eqMessage)
                .map(TRUE_RETURN)
                .orElse(Boolean.FALSE);
    }

    public static BooleanEnum get(Integer code) {
        return isFalse(code) ? BooleanEnum.FALSE : BooleanEnum.TRUE;
    }

    public static BooleanEnum get(Boolean value) {
        return isFalse(value) ? BooleanEnum.FALSE : BooleanEnum.TRUE;
    }

    public static BooleanEnum get(String valueStr) {
        return isFalse(valueStr) ? BooleanEnum.FALSE : BooleanEnum.TRUE;
    }

    public static BooleanEnum getIgnoreCase(String valueStr) {
        return isFalseIgnoreCase(valueStr) ? BooleanEnum.FALSE : BooleanEnum.TRUE;
    }

    public static BooleanEnum getByMessage(String message) {
        return isFalseMessage(message) ? BooleanEnum.FALSE : BooleanEnum.TRUE;
    }

    public boolean eq(Boolean value) {
        return Objects.equals(value, this.getValue());
    }

    public boolean eq(String valueStr) {
        return Objects.equals(valueStr, this.getValueStr());
    }

    public boolean eqIgnoreCase(String valueStr) {
        return (this.getValueStr() == null && valueStr == null)
                || (valueStr != null && valueStr.equalsIgnoreCase(this.getValueStr()));
    }

    private static final Function<Object, Boolean> TRUE_RETURN = (o) -> Boolean.TRUE;

}
