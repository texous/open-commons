package cn.texous.open.base.commons.page;

import lombok.Data;

import java.io.Serializable;

/**
 * 分页请求
 *
 * @author texousliu
 * @since 20220-07-23 14:00:00
 */
@Data
public class CursorReq<T> implements Serializable {

    /**
     * 游标
     */
    private String cursor;

    /**
     * 查询数据列表
     */
    protected T query;

}
