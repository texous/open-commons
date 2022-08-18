package cn.texous.open.base.commons.exception.base;

import cn.texous.open.base.commons.enums.HttpStatus;
import cn.texous.open.base.commons.enums.ResultCode;
import cn.texous.open.base.commons.exception.annotation.RespStatus;

/**
 * 操作异常
 *
 * @author texousliu
 * @since 20220-07-23 14:00:00
 */
@RespStatus(HttpStatus.BAD_REQUEST)
public class OperationException extends BaseException {

    public OperationException(String message) {
        this(ResultCode.OPERATION_ERROR.getCode(), message);
    }

    public OperationException(String message, Throwable cause) {
        this(ResultCode.OPERATION_ERROR.getCode(), message, cause);
    }

    public OperationException(int code, String message) {
        super(code, message);
    }

    public OperationException(int code, String message, Throwable cause) {
        super(code, message, cause);
    }

}
