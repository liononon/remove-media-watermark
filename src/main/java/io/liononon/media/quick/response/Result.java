package io.liononon.media.quick.response;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: liupengcheng
 * @email: liupengcheng@zork.com.cn
 * @date: 2023/1/4 22:36
 * @description：
 */
@Data
public class Result<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    private int resultCode;
    private String message;
    private T data;

    public Result(){

    }

    public Result(int resultCode, String message){
        this.resultCode = resultCode;
        this.message = message;
    }

}

