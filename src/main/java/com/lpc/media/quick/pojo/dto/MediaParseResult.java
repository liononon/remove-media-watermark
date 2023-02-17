package com.lpc.media.quick.pojo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 媒体解析结果
 * @author ZuoBro
 * date: 2021/5/20
 * time: 14:53
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MediaParseResult {

    private User user;
    private Media media;
    private String mediaApiType;

}





