package com.mpy.stage.bean;

/**
 * @ClassName JsonResult
 * @Description: 统一返回对象
 * @Author: qgm
 * @Date: 2021/1/12 11:02
 * @Version: 1.0
 */
public class JsonResult<T> {

    private T data;
    private String code;
    private String msg;

    /***
     * @author: qgm
     * @description: 若没有数据返回，默认状态码为0，提示信息为：操作成功！
     * @date: 2021/1/12 11:10
     * @param
     * @return
     */
    public JsonResult() {
        this.code = "0";
        this.msg = "操作成功";
    }

    /**
     * @author: qgm
     * @description: 若没有数据返回，可以人为指定状态码和提示信息
     * @date: 2021/1/12 11:09
     * @param code 返回码
     * @param msg  返回信息
     * @return
     */
    public JsonResult(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * @author: qgm
     * @description: 有数据返回时，状态码为0，默认提示信息为：操作成功！
     * @date: 2021/1/12 11:12
     * @param data
     * @return 
     */
    public JsonResult(T data) {
        this.data = data;
        this.code = "0";
        this.msg = "操作成功";
    }

    /**
     * @author: qgm
     * @description: 有数据返回，状态码为0，人为指定提示信息
     * @date: 2021/1/12 11:12
     * @param data
     * @return
     */
    public JsonResult(T data, String msg) {
        this.data = data;
        this.code = "0";
        this.msg = msg;
    }

    /**
     * @author: qgm
     * @description: 有数据返回，人为指定返回码和提示信息
     * @date: 2021/1/12 11:12
     * @param data
     * @return
     */
    public JsonResult(T data, String msg, String code) {
        this.data = data;
        this.code = code;
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "JsonResult{" +
                "data=" + data +
                ", code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }
}
