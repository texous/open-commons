package cn.texous.open.base.commons.exception.operation;

import cn.texous.open.base.commons.enums.HttpStatus;
import cn.texous.open.base.commons.enums.ResultCode;
import cn.texous.open.base.commons.exception.annotation.RespStatus;
import cn.texous.open.base.commons.exception.base.OperationException;

/**
 * 数据重复异常
 *
 * @author texousliu
 * @since 20220-07-23 14:00:00
 */
@RespStatus(HttpStatus.CONFLICT)
public class DataDuplicateException extends OperationException {

    public DataDuplicateException(String message) {
        super(ResultCode.DATA_DUPLICATE_ERROR.getCode(), message);
    }

    public DataDuplicateException(String message, Throwable cause) {
        super(ResultCode.DATA_DUPLICATE_ERROR.getCode(), message, cause);
    }

}
