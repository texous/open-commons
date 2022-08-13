package cn.texous.open.base.commons.exception.operation;

import cn.texous.open.base.commons.enums.ResultCode;
import cn.texous.open.base.commons.exception.base.OperationException;

/**
 * 方法未实现异常
 *
 * @author texousliu
 * @since 20220-07-23 14:00:00
 */
public class MethodNotImplException extends OperationException {

    public MethodNotImplException(String message) {
        super(ResultCode.METHOD_NOT_IMPLEMENTED_ERROR.getCode(), message);
    }

    public MethodNotImplException(String message, Throwable cause) {
        super(ResultCode.METHOD_NOT_IMPLEMENTED_ERROR.getCode(), message, cause);
    }

}
