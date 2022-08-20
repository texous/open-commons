package cn.texous.open.base.commons.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Optional;

/**
 * Boolean 枚举值
 * <p>
 * 0/null 为 false ，其余都为 true.
 * <p>
 * <b>注意：</b> eq 方法判断时，null 都为相反值
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
        if (code == null) {
            return Boolean.FALSE;
        }
        return BooleanEnum.FALSE.getCode().equals(code);
    }

    public static Boolean isTrue(Boolean value) {
        return !isFalse(value);
    }

    public static Boolean isFalse(Boolean value) {
        return Optional.ofNullable(value).filter(FALSE::eq).orElse(Boolean.FALSE);
    }

    public static Boolean isTrue(String valueStr) {
        return !isFalse(valueStr);
    }

    public static Boolean isFalse(String valueStr) {
        if (valueStr == null) {
            return Boolean.FALSE;
        }
        return BooleanEnum.FALSE.getValueStr().equals(valueStr);
    }

    public static Boolean isTrueMessage(String message) {
        return !isFalseMessage(message);
    }

    public static Boolean isFalseMessage(String message) {
        if (message == null) {
            return Boolean.FALSE;
        }
        return BooleanEnum.FALSE.getMessage().equals(message);
    }

    public static BooleanEnum get(Integer code) {
        if (code == null) {
            return BooleanEnum.FALSE;
        }
        return BooleanEnum.FALSE.getCode().equals(code) ? BooleanEnum.FALSE : BooleanEnum.TRUE;
    }

    public static BooleanEnum get(Boolean value) {
        if (value == null) {
            return BooleanEnum.FALSE;
        }
        return BooleanEnum.FALSE.getValue().equals(value) ? BooleanEnum.FALSE : BooleanEnum.TRUE;
    }

    public static BooleanEnum get(String valueStr) {
        if (valueStr == null) {
            return BooleanEnum.FALSE;
        }
        return BooleanEnum.FALSE.getValueStr().equals(valueStr) ? BooleanEnum.FALSE : BooleanEnum.TRUE;
    }

    public static BooleanEnum getMessage(String message) {
        if (message == null) {
            return BooleanEnum.FALSE;
        }
        return BooleanEnum.FALSE.getMessage().equals(message) ? BooleanEnum.FALSE : BooleanEnum.TRUE;
    }

    public boolean eq(Boolean value) {
        return this.getValue().equals(value);
    }

    public boolean eq(String valueStr) {
        return this.getValueStr().equals(valueStr);
    }

    public boolean eqMessage(String message) {
        return this.getMessage().equals(message);
    }

}
