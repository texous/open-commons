package cn.texous.open.base.commons.exception.base;

import cn.texous.open.base.commons.enums.HttpStatus;
import cn.texous.open.base.commons.enums.ResultCode;
import cn.texous.open.base.commons.exception.annotation.RespStatus;

/**
 * 权限异常
 *
 * @author texousliu
 * @since 20220-07-23 14:00:00
 */
@RespStatus(HttpStatus.FORBIDDEN)
public class PermissionException extends BaseException {

    public PermissionException(String message) {
        this(ResultCode.PERMISSION_ERROR.getCode(), message);
    }

    public PermissionException(String message, Throwable cause) {
        this(ResultCode.PERMISSION_ERROR.getCode(), message, cause);
    }

    public PermissionException(int code, String message) {
        super(code, message);
    }

    public PermissionException(int code, String message, Throwable cause) {
        super(code, message, cause);
    }

}
