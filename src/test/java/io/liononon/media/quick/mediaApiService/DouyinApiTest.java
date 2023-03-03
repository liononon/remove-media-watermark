package io.liononon.media.quick.mediaApiService;


import io.liononon.media.quick.pojo.dto.MediaParseResult;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import javax.annotation.Resource;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    private String url = "6.64 pDH:/ 复制打开抖音，看看【ff.的作品】# 转笔奶茶转场挑战 # vlog日常 好喝  https://v.douyin.com/S6pENHU/";

    @Test
    void canParse() {
        assertTrue(baseMediaApi.canParse(url),"不支持");
    }

    @Test
    void getMediaApiType() {
    }

    @Test
    void parse() {
        MediaParseResult parseResult = baseMediaApi.parse(url);
        System.out.println(parseResult);
    }

    @Test
    void parseVideo() {
    }

    private static final Pattern FLAG_PATTERN = Pattern.compile("(https?://v\\.douyin\\.com/[^/]+/?)\\s|(https?://www\\.iesdouyin\\.com/[\\S]*)");
    private static final Pattern FLAG_PATTERN2 = Pattern.compile("(https?://v.douyin.com/[\\S]*)|(https?://www.iesdouyin.com/[\\S]*)");
    @Test
    void patternTest() {
        Matcher matcher = FLAG_PATTERN.matcher(url);
        if (matcher.find()) {
            System.out.println(matcher.group(0));
        }
    }
    @Test
    void pattern2Test() {
        Matcher matcher = FLAG_PATTERN2.matcher(url);
        if (matcher.find()) {
            System.out.println(matcher.group(0));
        }
    }
}