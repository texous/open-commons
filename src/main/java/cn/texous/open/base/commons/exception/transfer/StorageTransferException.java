package cn.texous.open.base.commons.exception.transfer;

import cn.texous.open.base.commons.enums.HttpStatus;
import cn.texous.open.base.commons.enums.ResultCode;
import cn.texous.open.base.commons.exception.annotation.RespStatus;
import cn.texous.open.base.commons.exception.base.BaseException;

/**
 * 存储异常
 *
 * @author texousliu
 * @since 20220-07-23 14:00:00
 */
@RespStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class StorageTransferException extends BaseException {
    private static final long serialVersionUID = 1320510593757496091L;

    public StorageTransferException(String message) {
        this(ResultCode.STORAGE_TRANSFER_ERROR.getCode(), message);
    }

    public StorageTransferException(String message, Throwable cause) {
        this(ResultCode.STORAGE_TRANSFER_ERROR.getCode(), message, cause);
    }

    public StorageTransferException(int code, String message) {
        super(code, message);
    }

    public StorageTransferException(int code, String message, Throwable cause) {
        super(code, message, cause);
    }

}
