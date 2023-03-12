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
public class PageReq<T> implements Serializable {
    /**
     * 默认页面
     */
    public static final int DEFAULT_PAGE = 1;

    /**
     * 默认分页大小
     */
    public static final int DEFAULT_SIZE = 50;

    /**
     * 页码，第几页
     */
    private long current = DEFAULT_PAGE;

    /**
     * 分页数量，每页查询数量
     */
    private long size = DEFAULT_SIZE;

    /**
     * 查询数据列表
     */
    protected T query;

}
