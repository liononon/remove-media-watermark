package io.liononon.media.quick.mediaApiService;

import io.liononon.media.quick.pojo.dto.MediaParseResult;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author: liupengcheng
 * @email: liupengcheng@zork.com.cn
 * @date: 2023/3/2 21:22
 * @description：
 */
@SpringBootTest
class WeiBoApiTest {

    @Resource(name = "weiBoApi")
    BaseMediaApi baseMediaApi;

    private String url = "https://h5.video.weibo.com/show?fid=1034:4669734915080214";

    @Test
    void canParse() {
        assertTrue(baseMediaApi.canParse(url),"不支持");
    }

    @Test
    void parse() {
        MediaParseResult parseResult = baseMediaApi.parse(url);
        System.out.println(parseResult);
    }
}