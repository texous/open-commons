package cn.texous.open.base.commons.exception.permission;

import cn.texous.open.base.commons.enums.HttpStatus;
import cn.texous.open.base.commons.enums.ResultCode;
import cn.texous.open.base.commons.exception.annotation.RespStatus;
import cn.texous.open.base.commons.exception.base.PermissionException;

/**
 * 认证异常
 *
 * @author texousliu
 * @since 20220-07-23 14:00:00
 */
@RespStatus(HttpStatus.UNAUTHORIZED)
public class AuthenticationException extends PermissionException {

    public AuthenticationException(String message) {
        super(ResultCode.AUTHENTICATION_ERROR.getCode(), message);
    }

    public AuthenticationException(String message, Throwable cause) {
        super(ResultCode.AUTHENTICATION_ERROR.getCode(), message, cause);
    }

}
