package cn.texous.open.base.commons.exception.validate;

import cn.texous.open.base.commons.enums.HttpStatus;
import cn.texous.open.base.commons.enums.ResultCode;
import cn.texous.open.base.commons.exception.annotation.RespStatus;
import cn.texous.open.base.commons.exception.base.ValidateException;

/**
 * 请求校验异常
 *
 * @author texousliu
 * @since 20220-07-23 14:00:00
 */
@RespStatus(HttpStatus.BAD_REQUEST)
public class RequestValidateException extends ValidateException {

    public RequestValidateException(String message) {
        super(ResultCode.REQUEST_VALIDATE_ERROR.getCode(), message);
    }

    public RequestValidateException(String message, Throwable cause) {
        super(ResultCode.REQUEST_VALIDATE_ERROR.getCode(), message, cause);
    }

}
