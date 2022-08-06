package cn.texous.open.base.commons.model;

import lombok.Data;

import java.util.Set;

/**
 * AccessToken 信息
 *
 * @author texousliu
 * @since 2022-08-06
 */
@Data
public class AccessToken {

    /**
     * 用户id
     */
    private String userId;
    /**
     * 应用id
     */
    private String appId;
    /**
     * 租户id
     */
    private String tenantId;
    /**
     * clientId
     */
    private String clientId;
    /**
     * 授权方式
     */
    private String grantType;
    /**
     * 授权范围
     */
    private Set<String> scope;
    /**
     * uuid
     */
    private String jti;
    /**
     * 到期时间
     */
    private Long exp;
    /**
     * 有效时长
     */
    private Long expireIn;

}
