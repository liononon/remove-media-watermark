package io.liononon.media.quick.controller;

import io.liononon.media.quick.response.Result;
import io.liononon.media.quick.response.ResultGenerator;
import org.springframework.web.bind.annotation.*;
import io.liononon.media.quick.annotation.ApiLog;

/**
 * 媒体接口
 * @author ZuoBro
 * date: 2021/5/20
 * time: 16:34
 */
@RestController
@RequestMapping("/record")
public class RecordController {



    @GetMapping("/total")
    @ApiLog
    public Result total() {
        return ResultGenerator.genSuccessResult(10);
    }

    @GetMapping("/records")
    @ApiLog
    public String record() {
        return "12";
    }
}
