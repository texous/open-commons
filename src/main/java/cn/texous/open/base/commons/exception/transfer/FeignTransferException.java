package cn.texous.open.base.commons.exception.transfer;

import cn.texous.open.base.commons.enums.HttpStatus;
import cn.texous.open.base.commons.enums.ResultCode;
import cn.texous.open.base.commons.exception.annotation.RespStatus;
import cn.texous.open.base.commons.model.Result;
import cn.texous.open.base.commons.exception.base.TransferException;

/**
 * 远程调用异常
 *
 * @author texousliu
 * @since 20220-07-23 14:00:00
 */
@RespStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class FeignTransferException extends TransferException {

    public FeignTransferException(String message) {
        super(ResultCode.FEIGN_TRANSFER_ERROR.getCode(), message);
    }

    public FeignTransferException(String message, Result<?> response) {
        super(ResultCode.FEIGN_TRANSFER_ERROR.getCode(), message, response);
    }

    public FeignTransferException(String message, Result<?> responseVo, Throwable cause) {
        super(ResultCode.FEIGN_TRANSFER_ERROR.getCode(), message, responseVo, cause);
    }

}
