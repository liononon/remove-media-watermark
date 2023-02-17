package com.lpc.media.quick.pojo.dto;

import lombok.Data;

import java.util.List;

/**
 * 视频媒体
 * @author ZuoBro
 * date: 2021/5/20
 * time: 19:07
 */
@Data
public class Video extends Media {

    private String audioUrl;
    private String title;
    private String videoCover;
    private List<String> urls;

}
