package io.liononon.media.quick.pojo.dto;

import lombok.Data;

/**
 * 图片媒体
 * @author ZuoBro
 * date: 2021/5/20
 * time: 19:13
 */
@Data
public class Photo extends Media {

    private String title;
    private String url;
    private String audioUrl;

}
