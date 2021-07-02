package com.joshua.service.impl;


import com.joshua.dao.GoodsDao;
import com.joshua.entity.Goods;
import com.joshua.service.GoodsService;
import com.joshua.utils.GoodsRes;

import com.mongodb.client.FindIterable;
import org.bson.Document;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsRes goodsRes;

    @Autowired
    private GoodsDao goodsDao;
   @Override
    public GoodsRes findAll() {

       List<Goods> goods = goodsDao.findAll();

       goodsRes.setData(goods);
       goodsRes.setCount(goods.size());

       return goodsRes;
    }

    @Override
    public void add(Goods good) {
    goodsDao.save(good);
    }

    @Override
    public void update(Goods good) {
    goodsDao.save(good);
    }

    @Override
    public void delete(String id) {
        goodsDao.deleteById(id);
    }

    @Override
    public void out(String id) {
        Goods good = goodsDao.getById(id);
        good.setStatus("下架");
        goodsDao.save(good);

    }
}
