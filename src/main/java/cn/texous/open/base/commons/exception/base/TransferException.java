package cn.texous.open.base.commons.exception.base;

import cn.texous.open.base.commons.enums.ResultCode;

/**
 * 调用异常
 *
 * @author texousliu
 * @since 20220-07-23 14:00:00
 */
public class TransferException extends BaseException {

    private Object data;

    public TransferException(String message) {
        this(ResultCode.TRANSFER_ERROR.getCode(), message);
    }

    public TransferException(String message, Object data) {
        this(ResultCode.TRANSFER_ERROR.getCode(), message, data);
    }

    public TransferException(String message, Throwable cause) {
        this(ResultCode.TRANSFER_ERROR.getCode(), message, cause);
    }

    public TransferException(String message, Object data, Throwable cause) {
        this(ResultCode.TRANSFER_ERROR.getCode(), message, data, cause);
    }

    public TransferException(int code, String message) {
        super(code, message);
    }

    public TransferException(int code, String message, Object data) {
        super(code, message);
        this.data = data;
    }

    public TransferException(int code, String message, Throwable cause) {
        super(code, message, cause);
    }

    public TransferException(int code, String message, Object data, Throwable cause) {
        super(code, message, cause);
        this.data = data;
    }

    public Object getData() {
        return data;
    }

}
