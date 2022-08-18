package cn.texous.open.base.commons.exception.operation;

import cn.texous.open.base.commons.enums.HttpStatus;
import cn.texous.open.base.commons.enums.ResultCode;
import cn.texous.open.base.commons.exception.annotation.RespStatus;
import cn.texous.open.base.commons.exception.base.OperationException;

/**
 * Redis 操作异常
 *
 * @author texousliu
 * @since 20220-07-23 14:00:00
 */
@RespStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class RedisOperationException extends OperationException {

    public RedisOperationException(String message) {
        this(ResultCode.REDIS_OPERATOR_ERROR.getCode(), message);
    }

    public RedisOperationException(String message, Throwable cause) {
        this(ResultCode.REDIS_OPERATOR_ERROR.getCode(), message, cause);
    }

    public RedisOperationException(int code, String message) {
        super(code, message);
    }

    public RedisOperationException(int code, String message, Throwable cause) {
        super(code, message, cause);
    }

}
