package cn.texous.open.base.commons.exception.validate;

import cn.texous.open.base.commons.enums.ResultCode;
import cn.texous.open.base.commons.exception.base.ValidateException;

/**
 * 参数校验异常
 *
 * @author texousliu
 * @since 20220-07-23 14:00:00
 */
public class ParamValidateException extends ValidateException {

    public ParamValidateException(String message) {
        super(ResultCode.PARAM_VALIDATE_ERROR.getCode(), message);
    }

    public ParamValidateException(String message, Throwable cause) {
        super(ResultCode.PARAM_VALIDATE_ERROR.getCode(), message, cause);
    }

}
