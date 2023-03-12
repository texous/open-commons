package cn.texous.open.base.commons.page;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 分页结果
 *
 * @author texousliu
 * @since 20220-07-23 14:00:00
 */
@Data
public class PageResp<T> implements Serializable {
    /**
     * 查询数据列表
     */
    protected List<T> records;

    /**
     * 总数
     */
    protected long total;

    /**
     * 每页显示条数
     */
    protected long size;

    /**
     * 当前页
     */
    protected long current;

    /**
     * 总页数
     */
    protected long pages;

    /**
     * 游标
     */
    protected String cursor;
    
    public PageResp(long current, long size) {
        this(current, size, 0);
    }
    
    public PageResp(long current, long size, long total) {
        this(current, size, total, null);
    }

    public PageResp(long current, long size, long total, List<T> records) {
        assert size > 0;
        this.current = current;
        this.size = size;
        this.total = total;
        this.records = records;
        this.pages = (total + size - 1) / size;
    }

}
