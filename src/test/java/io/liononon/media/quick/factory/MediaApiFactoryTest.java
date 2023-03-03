package io.liononon.media.quick.factory;

import io.liononon.media.quick.pojo.dto.MediaParseResult;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author: liupengcheng
 * @email: liupengcheng@zork.com.cn
 * @date: 2023/3/2 22:01
 * @description：
 */
@SpringBootTest
class MediaApiFactoryTest {

    @Resource
    private MediaApiFactory mediaApiFactory;

    String flag = "6.64 pDH:/ 复制打开抖音，看看【ff.的作品】# 转笔奶茶转场挑战 # vlog日常 好喝  https://v.douyin.com/S6pENHU/";

    @Test
    void getMediaApi() {
        MediaParseResult parseResult = mediaApiFactory.getMediaApi(flag).parse(flag);
        System.out.println(parseResult);
    }
}