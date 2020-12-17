package com.example.entity;


import lombok.Data;

/**
 * @author: create by chenjh
 * @version: v1.0
 * @description: 返回给前台的通用包装
 * @date: 2019-08-19 03:18
 */
@Data
public class ResponseEntity {

    public static final String DEFAULT_SUCCESS_MESSAGE = "请求成功";

    public static final String DEFAULT_ERROR_MESSAGE = "网络异常";

    public static final Integer DEFAULT_SUCCESS_CODE = 200;

    public static final Integer DEFAULT_ERROR_CODE = 500;

    /**
     * 请求是否成功
     */
    private Boolean success;

    /**
     * 响应状态码
     */
    private Integer code;

    /**
     * 响应信息
     */
    private String message;

    /**
     * 响应对象
     */
    private Object data;

    public ResponseEntity() {
    }

    public ResponseEntity(Boolean success, Integer code, String message, Object data) {
        this.success = success;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static SuccessResponse success() {
        return new SuccessResponse();
    }

    public static SuccessResponse success(Object object) {
        return new SuccessResponse(object);
    }

    public static SuccessResponse success(Integer code, String message, Object object) {
        return new SuccessResponse(code, message, object);
    }

    public static ErrorResponse error(String message) {
        return new ErrorResponse(message);
    }

    public static ErrorResponse error(Integer code, String message) {
        return new ErrorResponse(code, message);
    }

    public static ErrorResponse error(Integer code, String message, Object object) {
        return new ErrorResponse(code, message, object);
    }
}
