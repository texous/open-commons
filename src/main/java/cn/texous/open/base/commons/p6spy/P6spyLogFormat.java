package cn.texous.open.base.commons.p6spy;

import cn.texous.open.base.commons.constants.StringConstants;
import com.p6spy.engine.spy.appender.MessageFormattingStrategy;

import java.util.Objects;

/**
 * P6spy 数据库日志格式化
 *
 * @author texousliu
 * @since 2022-08-07
 */
public class P6spyLogFormat implements MessageFormattingStrategy {

    @Override
    public String formatMessage(final int connectionId, final String now, final long elapsed,
                                final String category, final String prepared, final String sql, final String url) {
        return Objects.nonNull(sql)
                ? " Execute SQL：>>>>"
                + sql.replaceAll("[\\s]+", StringConstants.SPACE)
                + String.format(" <<<< Execute time: %s ms", elapsed)

                : null;
    }
}