package com.joshua.controller;


import com.google.gson.Gson;
import com.joshua.entity.Goods;
import com.joshua.service.GoodsService;
import com.joshua.utils.GoodsRes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/goods")
public class GoodsController {


    @Autowired
    private GoodsService goodsService;



    @GetMapping("/findAll")
    public String findAll(){
        GoodsRes goods = goodsService.findAll();
        String goodsGson = new Gson().toJson(goods);
        return goodsGson;
    }


    @PostMapping("/add")
    public void add(Goods good){
        
        goodsService.add(good);

    }

    @PutMapping("update")
    public  void update(Goods good){
        goodsService.update(good);

    }

    @DeleteMapping("/delete")
    public void delete(String id){
        goodsService.delete(id);
    }

    @PutMapping("/out")
    public void out(String id){
        goodsService.out(id);
    }
}
