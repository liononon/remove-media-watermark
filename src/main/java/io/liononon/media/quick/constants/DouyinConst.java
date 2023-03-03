package io.liononon.media.quick.constants;

/**
 * @author: liupengcheng
 * @email: liupengcheng@zork.com.cn
 * @date: 2023/3/3 09:40
 * @description：
 */
public class DouyinConst {

    private DouyinConst(){

    }

    // 首页推荐
    public static final String TAB_FEED = "https://www.douyin.com/aweme/v1/web/tab/feed/?";

    // 用户短信息（给多少个用户secid就返回多少的用户信息）
    public static final String USER_SHORT_INFO = "https://www.douyin.com/aweme/v1/web/im/user/info/?";

    // 用户详细信息
    public static final String USER_DETAIL = "https://www.douyin.com/aweme/v1/web/user/profile/other/?";

    // 用户作品
    // cookies 暂时只需要 __ac_signature, s_v_web_id两个参数, 好像会过期
    // url 暂时不需要携带 msToken, X-Bogus, _signature
    // 每次返回数据很少
    // public static final String USER_POST = "https://m.douyin.com/web/api/v2/aweme/post/?";
    // 2023/02/19 失效
    public static final String USER_POST = "https://www.douyin.com/aweme/v1/web/aweme/post/?";

    // 作品信息
    public static final String POST_DETAIL = "https://www.douyin.com/aweme/v1/web/aweme/detail/?";

    // 用户喜欢A
    // 需要 odin_tt
    public static final String USER_FAVORITE_A = "https://www.douyin.com/aweme/v1/web/aweme/favorite/?";

    // 用户喜欢B
    public static final String USER_FAVORITE_B = "https://www.iesdouyin.com/web/api/v2/aweme/like/?";

    // 用户历史
    public static final String USER_HISTORY = "https://www.douyin.com/aweme/v1/web/history/read/?";

    // 用户收藏
    public static final String USER_COLLECTION = "https://www.douyin.com/aweme/v1/web/aweme/listcollection/?";

    // 用户评论
    public static final String COMMENT = "https://www.douyin.com/aweme/v1/web/comment/list/?";

    // 首页朋友作品
    public static final String FRIEND_FEED = "https://www.douyin.com/aweme/v1/web/familiar/feed/?";

    // 关注用户作品
    public static final String FOLLOW_FEED = "https://www.douyin.com/aweme/v1/web/follow/feed/?";

    // 合集下所有作品
    // 只需要X-Bogus
    public static final String USER_MIX = "https://www.douyin.com/aweme/v1/web/mix/aweme/?";

    // 用户所有合集列表
    // 需要 ttwid
    public static final String USER_MIX_LIST = "https://www.douyin.com/aweme/v1/web/mix/list/?";

    // 直播
    public static final String LIVE = "https://live.douyin.com/webcast/room/web/enter/?";

    // 音乐
    public static final String MUSIC = "https://www.douyin.com/aweme/v1/web/music/aweme/?";

    // X-Bogus Path
    // 60 秒内,请求同一URI累计超过 600
    public static final String GET_XB_PATH = "https://tiktok.199933.xyz/xb";

}
