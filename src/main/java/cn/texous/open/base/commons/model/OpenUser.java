package cn.texous.open.base.commons.model;

import lombok.Data;

/**
 * 用户信息.
 * <p>
 * {@link cn.texous.open.base.commons.constants.HeaderConstants#HEADER_USER_INFO}
 *
 * @author texousliu
 * @since 2022-09-10
 */
@Data
public class OpenUser {

    /**
     * id
     */
    private Long id;
    /**
     * 用户名
     */
    private String username;

}
