package io.liononon.media.quick.mediaApiService;

import io.liononon.media.quick.pojo.dto.MediaParseResult;

/**
 */
public interface BaseMediaApi {
    /**
     * 根据flag确定是否可以解析
     * @param flag
     * @return
     */
    boolean canParse(String flag);

    /**
     * 获取Api类型，如douyin、kuaishou等
     * @return
     */
    String getMediaApiType();

    /**
     * 解析链接，返回MediaParseResult对象
     * @param flag
     * @return
     */
    MediaParseResult parse(String flag);

}
