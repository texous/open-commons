package cn.texous.open.base.commons.exception.base;

import cn.texous.open.base.commons.enums.Code;
import cn.texous.open.base.commons.enums.HttpStatus;
import cn.texous.open.base.commons.enums.ResultCode;
import cn.texous.open.base.commons.exception.annotation.RespStatus;

/**
 * 基础异常
 *
 * @author texousliu
 * @since 20220-07-23 14:00:00
 */
@RespStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class BaseException extends RuntimeException implements Code {

    protected Integer code = ResultCode.BASE_ERROR.getCode();

    public BaseException() {
        super();
    }

    public BaseException(Code code) {
        this(code.getCode(), code.getMessage());
    }

    public BaseException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public BaseException(Integer code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    public BaseException(String message) {
        super(message);
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseException(BaseException cause) {
        super(cause.getMessage(), cause);
        this.code = cause.getCode();
    }

    public BaseException(Throwable cause) {
        super(cause);
    }

    protected BaseException(Integer code,
                            String message,
                            Throwable cause,
                            boolean enableSuppression,
                            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.code = code;
    }

    protected BaseException(String message,
                            Throwable cause,
                            boolean enableSuppression,
                            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public Integer getCode() {
        return code;
    }

}
