package com.hzdl.springcloud.util;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 *
 * @Description
 *         200:表示成功
 *         500：表示错误
 *
 * @Author wangyun
 */
public class HzdlJSONResult {
    // 定义jackson对象
    private static final ObjectMapper MAPPER = new ObjectMapper();
    //响应业务状态
    private Integer status;
    // 响应消息
    private String msg;
    // 响应数据
    private Object data;
    private String ok;

    public static HzdlJSONResult build(Integer status, String msg, Object data){
        return new HzdlJSONResult(status,msg,data);
    }

    public static HzdlJSONResult ok(Object data){
        return new HzdlJSONResult(data);
    }
    public static HzdlJSONResult ok(){
        return new HzdlJSONResult(null);
    }
    public static HzdlJSONResult errorMsg(String msg){
        return new HzdlJSONResult(500,msg,null);
    }
    public static HzdlJSONResult errorException(String msg){
        return new HzdlJSONResult(555,msg,null);
    }
    public HzdlJSONResult() {
    }

    public HzdlJSONResult(Object data) {
        this.status =200;
        this.msg ="OK";
        this.data = data;
    }

    public HzdlJSONResult(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public  Boolean isOk(){
        return this.status == 200;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getOk() {
        return ok;
    }

    public void setOk(String ok) {
        this.ok = ok;
    }
}
