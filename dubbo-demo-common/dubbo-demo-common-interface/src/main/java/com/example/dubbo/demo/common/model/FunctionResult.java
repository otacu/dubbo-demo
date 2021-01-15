package com.example.dubbo.demo.common.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class FunctionResult implements Serializable {
    private String code;
    private String msg;
    private Object data;
}
