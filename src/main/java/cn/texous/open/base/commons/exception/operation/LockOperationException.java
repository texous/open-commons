package cn.texous.open.base.commons.exception.operation;

import cn.texous.open.base.commons.enums.HttpStatus;
import cn.texous.open.base.commons.enums.ResultCode;
import cn.texous.open.base.commons.exception.annotation.RespStatus;
import cn.texous.open.base.commons.exception.base.OperationException;

/**
 * 锁操作异常
 *
 * @author texousliu
 * @since 20220-07-23 14:00:00
 */
@RespStatus(HttpStatus.LOCKED)
public class LockOperationException extends OperationException {

    public LockOperationException(String message) {
        this(ResultCode.LOCK_OPERATION_ERROR.getCode(), message);
    }

    public LockOperationException(String message, Throwable cause) {
        this(ResultCode.LOCK_OPERATION_ERROR.getCode(), message, cause);
    }

    public LockOperationException(int code, String message) {
        super(code, message);
    }

    public LockOperationException(int code, String message, Throwable cause) {
        super(code, message, cause);
    }

}
