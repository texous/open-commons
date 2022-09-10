package cn.texous.open.base.commons.model;

import lombok.Data;

import java.util.Map;
import java.util.Set;

/**
 * Token 信息.
 * <p>
 * {@link cn.texous.open.base.commons.constants.HeaderConstants#HEADER_TOKEN_INFO}
 *
 * @author texousliu
 * @since 2022-08-06
 */
@Data
public class OpenToken {

    /**
     * clientId
     */
    private String clientId;
    /**
     * 授权范围
     */
    private Set<String> scope;
    /**
     * uuid
     */
    private String jti;
    /**
     * 生效时间
     */
    private Long iat;
    /**
     * 到期时间
     */
    private Long exp;
    /**
     * 有效时长
     */
    private Long expiresIn;
    /**
     * 附加信息
     */
    private Map<String, Object> additionalInformation;

}
