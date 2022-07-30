package cn.texous.open.base.commons.exception.permission;

import cn.texous.open.base.commons.enums.ResultCode;
import cn.texous.open.base.commons.exception.base.PermissionException;

/**
 * 授权异常
 *
 * @author texousliu
 * @since 20220-07-23 14:00:00
 */
public class AuthorizationException extends PermissionException {

    public AuthorizationException(String message) {
        super(ResultCode.AUTHORIZATION_ERROR.getCode(), message);
    }

    public AuthorizationException(String message, Throwable cause) {
        super(ResultCode.AUTHORIZATION_ERROR.getCode(), message, cause);
    }

}
