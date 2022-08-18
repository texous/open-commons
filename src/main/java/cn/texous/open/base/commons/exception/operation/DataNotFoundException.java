package cn.texous.open.base.commons.exception.operation;

import cn.texous.open.base.commons.enums.HttpStatus;
import cn.texous.open.base.commons.enums.ResultCode;
import cn.texous.open.base.commons.exception.annotation.RespStatus;
import cn.texous.open.base.commons.exception.base.OperationException;

/**
 * 数据不存在异常
 *
 * @author texousliu
 * @since 20220-07-23 14:00:00
 */
@RespStatus(HttpStatus.BAD_REQUEST)
public class DataNotFoundException extends OperationException {

    public DataNotFoundException(String message) {
        this(ResultCode.DATA_NOT_FOUND_ERROR.getCode(), message);
    }

    public DataNotFoundException(String message, Throwable cause) {
        this(ResultCode.DATA_NOT_FOUND_ERROR.getCode(), message, cause);
    }

    public DataNotFoundException(int code, String message) {
        super(code, message);
    }

    public DataNotFoundException(int code, String message, Throwable cause) {
        super(code, message, cause);
    }

}
