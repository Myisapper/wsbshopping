package com.wsb.consumer.common;

import lombok.Data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
@Data
public class R implements Serializable {
    private static final long serialVersionUID = 3658550587265037346L;
    private Boolean success;//是否成功

    private Integer code;//状态码

    private String message;//返回的信息

    private Map<String,Object> data = new HashMap<String, Object>();//返回的数据

    private R(){}

    public static R ok(){
        R r = new R();
        r.setSuccess(true);
        r.setCode(ResultCode.SUCCESS);
        r.setMessage("成功");
        return r;
    }

    public static R error(){
        R r = new R();
        r.setSuccess(false);
        r.setCode(ResultCode.ERROR);
        r.setMessage("失败");
        return r;
    }
    public R success(Boolean success){
        this.setSuccess(success);
        return this;
    }
    public R message(String message){
        this.setMessage(message);
        return this;
    }
    public R code(Integer code){
        this.setCode(code);
        return this;
    }
    public R data(String key, Object value){
        this.data.put(key, value);
        return this;
    }

    public R data(Map<String, Object> map){
        this.setData(map);
        return this;
    }
}
