package cn.texous.open.base.commons.validate;

import javax.validation.groups.Default;

/**
 * 校验分组接口类
 *
 * @author texousliu
 * @since 2022-08-20
 */
public interface ValidCls {

    /**
     * 删除必填
     */
    interface Delete extends Default {
    }

    /**
     * 修改必填
     */
    interface Update extends Default {
    }

    /**
     * 修改必填
     */
    interface Insert extends Default {
    }

    /**
     * 内部接口必填
     */
    interface Internal extends Default {
    }

    /**
     * 外部接口必填
     */
    interface External extends Default {
    }

    /**
     * 其余必填
     */
    interface Need extends Default {
    }

}
