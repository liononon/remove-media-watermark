package io.liononon.media.quick.pojo.dto;

/**
 * @author ZuoBro
 * date: 2021/5/20
 * time: 19:20
 */
public enum MediaType {

    VIDEO("video"),

    PHOTO("photo"),

    VIDEOS("videos"),

    PHOTOS("photos")
    ;

    final private String typeName;

    MediaType(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return typeName;
    }
}
