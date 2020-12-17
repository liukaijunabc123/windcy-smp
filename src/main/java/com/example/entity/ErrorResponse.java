package com.example.entity;


import lombok.Data;

/**
 * @author: create by chenjh
 * @version: v1.0
 * @description: 请求失败的返回
 * @date: 2019-08-19 03:17
 */
@Data
public class ErrorResponse extends ResponseEntity {

    /**
     * 异常的具体类名称
     */
    private String exceptionClazz;

    public ErrorResponse(String message) {
        super(false, ResponseEntity.DEFAULT_ERROR_CODE, message, null);
    }

    public ErrorResponse(Integer code, String message) {
        super(false, code, message, null);
    }

    public ErrorResponse(Integer code, String message, Object object) {
        super(false, code, message, object);
    }
}
