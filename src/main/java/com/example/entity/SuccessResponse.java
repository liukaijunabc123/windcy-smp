package com.example.entity;

/**
 * @author: create by chenjh
 * @version: v1.0
 * @description: 请求成功的返回
 * @date: 2019-08-19 03:18
 */
public class SuccessResponse extends ResponseEntity {

    public SuccessResponse() {
        super(true, DEFAULT_SUCCESS_CODE, DEFAULT_SUCCESS_MESSAGE, null);
    }

    public SuccessResponse(Object object) {
        super(true, DEFAULT_SUCCESS_CODE, DEFAULT_SUCCESS_MESSAGE, object);
    }

    public SuccessResponse(Integer code, String message, Object object) {
        super(true, code, message, object);
    }
}
