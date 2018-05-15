package com.whu.cherry.handler;

/**
 * @author cherry
 * @date 2018/5/15 20:05
 */

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * 统一异常处理类
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = RuntimeException.class)
    @ResponseBody
    private Map<String, Object> exceptionHandler(HttpServletRequest request, RuntimeException e){
        Map<String, Object> map = new HashMap<>();
        map.put("success", false);
        map.put("errMsg", e.getMessage());
        return map;

    }
}
