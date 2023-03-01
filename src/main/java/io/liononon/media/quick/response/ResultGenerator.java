package io.liononon.media.quick.response;

import org.apache.commons.lang3.StringUtils;

/**
 * @author: liupengcheng
 * @email: liupengcheng@zork.com.cn
 * @date: 2023/1/4 22:38
 * @description：
 */
public class ResultGenerator {

    private static final String DEFAULT_SUCCESS_MSG = "SUCCESS";
    private static final String DEFAULT_FAIL_MSG = "FAIL";

    public static final int RESULT_CODE_SUCCESS = 200;  // 成功处理请求
    public static final int RESULT_CODE_BAD_REQUEST = 412;  // 请求错误
    public static final int RESULT_CODE_NOT_LOGIN = 402;  // 未登录
    public static final int RESULT_CODE_PARAM_ERROR = 406;  // 传参错误
    public static final int RESULT_CODE_SERVER_ERROR= 500;  // 服务器错误

    /**
     * 默认成功code与msg无数据
     * */
    public static Result successNoDataResult(){
        Result result = new Result();
        result.setCode(RESULT_CODE_SUCCESS);
        result.setMsg(DEFAULT_FAIL_MSG);
        return result;
    }

    /**
     * 默认成功code、自定义msg无数据
     * */
    public static Result successNoDataResult(String message){
        Result result = new Result();
        result.setCode(RESULT_CODE_SUCCESS);
        result.setMsg(message);
        return result;
    }

    /**
     * 默认成功code、msg 有数据
     * */
    public static Result successWithDataResult(Object data){
        Result result = new Result();
        result.setCode(RESULT_CODE_SUCCESS);
        result.setMsg(DEFAULT_SUCCESS_MSG);
        result.setData(data);
        return result;
    }

    /**
     * 默认成功code、msg 有数据
     * */
    public static Result successMsgWithDataResult(String msg,Object data){
        Result result = new Result();
        result.setCode(RESULT_CODE_SUCCESS);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }

    /**
     * 失败自定义msg（默认code：500）
     * */
    public static Result failMsgResult(String msg){
        Result result = new Result();
        result.setCode(RESULT_CODE_SERVER_ERROR);
        if(StringUtils.isEmpty(msg)){
            result.setMsg(DEFAULT_FAIL_MSG);
        }else{
            result.setMsg(msg);
        }
        return result;
    }

    /**
     * 失败自定义code、msg
     * */
    public static Result failCodeMsgResult(int code, String message){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(message);
        return result;
    }

}

