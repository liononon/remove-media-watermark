package io.liononon.media.quick.mediaApiService;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author: liupengcheng
 * @email: liupengcheng@zork.com.cn
 * @date: 2023/3/1 21:04
 * @description：
 */

@SpringBootTest
public class DouyinApiTest {

    @Resource(name = "douyinApi")
    BaseMediaApi baseMediaApi;

    @Test
    void canParse() {
        String url = "3.3 fB:/ 返场啦 %你的女友已上线  https://v.douyin.com/ePF6UCY/ 緮制此链接，打kaiDou茵搜索，値接观kan視频！\n";
        assertTrue(baseMediaApi.canParse(url),"支持");
    }

    @Test
    void cannotParse() {
        String url = "3.3 fB:/ 返场啦 %你的女友已上线  https://v/ePF6UCY/ 緮制此链接，打kaiDou茵搜索，値接观kan視频！\n";
        assertTrue(baseMediaApi.canParse(url),"不支持的链接");
    }

    @Test
    void getMediaApiType() {
    }

    @Test
    void parse() {
    }

    @Test
    void parseVideo() {
    }
}