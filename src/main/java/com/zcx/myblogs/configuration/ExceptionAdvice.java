package com.zcx.myblogs.configuration;

import com.zcx.myblogs.common.AjaxResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@ResponseBody
public class ExceptionAdvice {

    @ExceptionHandler
    public Object exceptionAdvice(Exception e){
        return AjaxResult.fail(-1,e.getMessage());
    }

}
