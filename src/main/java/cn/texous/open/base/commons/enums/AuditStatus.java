package cn.texous.open.base.commons.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 审核状态常量
 *
 * @author texousliu
 * @since 2022/7/30 12:21
 */
@Getter
@AllArgsConstructor
public enum AuditStatus implements BaseEnum {

    PENDING(0, "待办"),
    REJECT(1, "驳回"),
    APPROVE(2, "同意"),
    CANCEL(3, "取消"),
    INVALID(3, "失效"),
        ;

    private final Integer code;
    private final String message;
}
