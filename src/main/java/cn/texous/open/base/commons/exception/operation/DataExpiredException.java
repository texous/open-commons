package cn.texous.open.base.commons.exception.operation;

import cn.texous.open.base.commons.enums.ResultCode;
import cn.texous.open.base.commons.exception.base.OperationException;

/**
 * 数据过期异常
 *
 * @author texousliu
 * @since 20220-07-23 14:00:00
 */
public class DataExpiredException extends OperationException {

    public DataExpiredException(String message) {
        super(ResultCode.DATA_EXPIRED_ERROR.getCode(), message);
    }

    public DataExpiredException(String message, Throwable cause) {
        super(ResultCode.DATA_EXPIRED_ERROR.getCode(), message, cause);
    }

}
