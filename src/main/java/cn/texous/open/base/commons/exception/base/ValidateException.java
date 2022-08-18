package cn.texous.open.base.commons.exception.base;

import cn.texous.open.base.commons.enums.HttpStatus;
import cn.texous.open.base.commons.enums.ResultCode;
import cn.texous.open.base.commons.exception.annotation.RespStatus;

/**
 * 校验异常
 *
 * @author texousliu
 * @since 20220-07-23 14:00:00
 */
@RespStatus(HttpStatus.BAD_REQUEST)
public class ValidateException extends BaseException {

    public ValidateException(String message) {
        this(ResultCode.VALIDATE_ERROR.getCode(), message);
    }

    public ValidateException(String message, Throwable cause) {
        this(ResultCode.VALIDATE_ERROR.getCode(), message, cause);
    }

    public ValidateException(int code, String message) {
        super(code, message);
    }

    public ValidateException(int code, String message, Throwable cause) {
        super(code, message, cause);
    }

}
