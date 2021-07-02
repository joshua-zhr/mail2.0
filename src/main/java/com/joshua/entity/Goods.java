package com.joshua.entity;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Data
@Document
public class Goods {
    @Id
    private String id;
    @Field
    private String goodName;
    @Field
    private double price;
    @Field
    private Integer inventory;
    @Field
    private Integer pv;
    @Field
    private String status;
    @Field
    private String launchTime;
    @Field
    private String putTime;
    @Field
    private String describe;
}
