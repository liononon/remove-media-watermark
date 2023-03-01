package io.liononon.media.quick.controller;

import io.liononon.media.quick.factory.MediaApiFactory;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;
import io.liononon.media.quick.annotation.ApiLog;
import io.liononon.media.quick.pojo.dto.MediaParseResult;

import javax.annotation.Resource;

@RestController
@RequestMapping("/media")
public class MediaController {
    @Resource
    private MediaApiFactory mediaApiFactory;

    /**
     * 解析短视频链接
     * @param flag 短视频链接（可携带描述信息）
     * @return 返回JSON格式数据
     */
    @PostMapping("/parse")
    @ApiLog
    public MediaParseResult parse(@RequestBody @NonNull String flag) {
        MediaParseResult parseResult = mediaApiFactory.getMediaApi(flag).parse(flag);
        return parseResult;
    }

    /**
     * 下载短视频
     * */
}
