package cn.texous.open.base.commons.model;

import cn.texous.open.base.commons.enums.Code;
import cn.texous.open.base.commons.enums.ResultCode;
import lombok.Data;

import java.io.Serializable;

/**
 * 返回结构体
 *
 * @author texousliu
 * @since 20220-07-23 14:00:00
 */
@Data
public class Result<T> implements Serializable {

    /**
     * 返回状态, 200 = 成功, 其他 = 失败
     */
    private int code;
    /**
     * 请求响应信息
     */
    private String message;
    /**
     * 请求响应数据
     */
    private T data;

    /**
     * 使用字段来禁用 success 序列化
     */
    private transient boolean success;


    public boolean isSuccess() {
        return this.code == ResultCode.SUCCESS.getCode();
    }

    private void setSuccess(boolean success) {
        this.success = success;
    }

    public Result() {
    }

    public Result(int code) {
        this.code = code;
        this.data = null;
    }

    public Result(int code, String message) {
        this.code = code;
        this.message = message;
        this.data = null;
    }

    public Result(T data) {
        this.data = data;
    }

    public Result(int code, T data) {
        this.code = code;
        this.data = data;
    }

    public Result(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static Result<Void> ok() {
        return new Result<>(ResultCode.SUCCESS.getCode());
    }

    public static <T> Result<T> ok(T t) {
        return new Result<>(ResultCode.SUCCESS.getCode(), t);
    }

    public static <T> Result<T> ok(String message, T t) {
        return new Result<>(ResultCode.SUCCESS.getCode(), message, t);
    }

    public static Result<Void> error(Code code) {
        return new Result<>(code.getCode(), code.getMessage());
    }

    public static <T> Result<T> error(Code code, T data) {
        return new Result<>(code.getCode(), code.getMessage(), data);
    }

    public static Result<Void> error(String message) {
        return new Result<>(ResultCode.BASE_ERROR.getCode(), message);
    }

    public static Result<Void> error(int code, String message) {
        return new Result<>(code, message);
    }

    public static <T> Result<T> error(int code, String message, T data) {
        return new Result<>(code, message, data);
    }

}
