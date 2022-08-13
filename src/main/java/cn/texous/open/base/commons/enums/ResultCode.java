package cn.texous.open.base.commons.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 通用相应状态码枚举
 *
 * @author texousliu
 * @since 20220-07-23 14:00:00
 */
@Getter
@AllArgsConstructor
public enum ResultCode implements Code {

    /**
     * 成功
     */
    SUCCESS(200, "Success"),


    BASE_ERROR(400000, "Base Error"),

    // -------------------------------------- 校验异常 ----------------------------------------------- //
    /**
     * 校验异常
     */
    VALIDATE_ERROR(400100, "Validate Error"),
    /**
     * 请求校验失败
     */
    REQUEST_VALIDATE_ERROR(400101, "Request Validate Error"),
    /**
     * 请求校验失败
     */
    PARAM_VALIDATE_ERROR(400102, "Param Validate Error"),


    // -------------------------------------- 操作异常 ----------------------------------------------- //
    /**
     * 操作异常
     */
    OPERATION_ERROR(400200, "Operation Error"),
    /**
     * 不存在数据
     */
    DATA_NOT_FOUND_ERROR(400201, "Data Not Found Error"),
    /**
     * 重复数据
     */
    DATA_DUPLICATE_ERROR(400202, "Data Duplicate Error"),
    /**
     * 数据过期
     */
    DATA_EXPIRED_ERROR(400203, "Data Expired Error"),
    /**
     * 方法未实现
     */
    METHOD_NOT_IMPLEMENTED_ERROR(400204, "Method Not Implemented Error"),
    /**
     * LOCK 操作异常
     */
    LOCK_OPERATION_ERROR(400220, "Lock Operation Error"),
    /**
     * Redis 操作异常
     */
    REDIS_OPERATOR_ERROR(400240, "Redis Operation Error"),


    // -------------------------------------- 调用异常 ----------------------------------------------- //
    /**
     * 远程调用异常
     */
    TRANSFER_ERROR(400300, "Transfer Error"),
    /**
     * FEIGN 调用失败
     */
    FEIGN_TRANSFER_ERROR(400301, "Feign Transfer Error"),
    /**
     * 第三方存储调用异常
     */
    STORAGE_TRANSFER_ERROR(400302, "Storage Transfer Error"),


    // -------------------------------------- 权限异常 ----------------------------------------------- //
    /**
     * 权限异常
     */
    PERMISSION_ERROR(400400, "Permission Error"),
    /**
     * 认证失败
     */
    AUTHENTICATION_ERROR(400401, "Authentication Failure"),
    /**
     * 授权失败
     */
    AUTHORIZATION_ERROR(400403, "Authorization Failure"),


    // -------------------------------------- 业务异常 ----------------------------------------------- //
    /**
     * 业务异常
     */
    BUSINESS_ERROR(400500, "Business Error"),

    ;

    private final int code;
    private final String message;

}
