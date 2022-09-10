package cn.texous.open.base.commons.constants;

/**
 * 请求头常量
 *
 * @author texousliu
 * @since 20220-07-23 14:00:00
 */
public interface HeaderConstants {
    /**
     * TOKEN
     */
    String HEADER_TOKEN = "open-token";

    /**
     * 验签常量
     */
    String HEADER_AUTHORIZATION = "open-authorization";

    /**
     * 验签常量
     */
    String HEADER_COMMON_AUTH = "authorization";

    /**
     * 链路追踪码
     */
    String HEADER_TRACK_CODE = "open-track-code";

    /**
     * 租户id
     */
    String HEADER_TENANT_ID = "open-tenant-id";

    /**
     * 用户id
     */
    String HEADER_USER_ID = "open-user-id";

    /**
     * 接口版本
     */
    String HEADER_API_VERSION = "open-api-version";

    /**
     * 应用id
     */
    String HEADER_APP_ID = "open-app-id";

    /**
     * 用户信息
     */
    String HEADER_USER_INFO = "open-user-info";

    /**
     * 授权信息
     */
    String HEADER_TOKEN_INFO = "open-token-info";

    /**
     * 已登录账户标识
     */
    String HEADER_VERIFIED_ACCOUNT = "open-verified-account";

}
