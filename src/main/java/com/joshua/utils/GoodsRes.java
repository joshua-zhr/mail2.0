package com.joshua.utils;


import com.alibaba.fastjson.JSONArray;
import com.mongodb.client.FindIterable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.bson.Document;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@AllArgsConstructor
@NoArgsConstructor
public class GoodsRes {
    String code = "0";
    String msg="";
    Integer count;
    List data;



    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Object getData() {
        return data;
    }

    public void setData(List data) {
        this.data = data;
    }
}

