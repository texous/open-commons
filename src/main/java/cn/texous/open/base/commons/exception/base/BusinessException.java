package cn.texous.open.base.commons.exception.base;

import cn.texous.open.base.commons.enums.Code;
import cn.texous.open.base.commons.enums.HttpStatus;
import cn.texous.open.base.commons.exception.annotation.RespStatus;

/**
 * 业务异常
 *
 * @author texousliu
 * @since 20220-07-23 14:00:00
 */
@RespStatus(HttpStatus.OK)
public class BusinessException extends BaseException {

    private Object data;

    public BusinessException() {
    }

    public BusinessException(Code code) {
        super(code);
    }

    public BusinessException(int code, String message) {
        super(code, message);
    }

    public BusinessException(int code, String message, Throwable cause) {
        super(code, message, cause);
    }

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }

    public BusinessException(Throwable cause) {
        super(cause);
    }

    public BusinessException(int code, String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(code, message, cause, enableSuppression, writableStackTrace);
    }

    public BusinessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public BusinessException(Code code, Object data) {
        this(code.getCode(), code.getMessage(), data);
    }

    public BusinessException(int code, String message, Object data) {
        super(code, message);
        this.data = data;
    }

    //
    public BusinessException(int code, String message, Object data, Throwable cause) {
        super(code, message, cause);
        this.data = data;
    }

    public Object getData() {
        return data;
    }

}
