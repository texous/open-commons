package cn.texous.open.base.commons.page;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 分页请求
 *
 * @author texousliu
 * @since 20220-07-23 14:00:00
 */
@Data
public class CursorResp<T> implements Serializable {

    /**
     * 游标
     */
    private String cursor;
    /**
     * 是否还有下一页
     */
    private Boolean hasNextPage;

    /**
     * 查询数据列表
     */
    protected List<T> records;

}
