package com.example.demo.domain;


import static javafx.scene.input.KeyCode.T;

/**
 * http 请求返回的最外层对象
 */
public class Result<T> {

    //错误码
    private Integer code;

    //提示信息
    private String msg;

    // 具体的内容
    private T data;

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
