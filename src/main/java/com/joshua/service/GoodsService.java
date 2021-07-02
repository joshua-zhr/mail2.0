package com.joshua.service;

import com.joshua.entity.Goods;
import com.joshua.utils.GoodsRes;



public interface GoodsService {
    public GoodsRes findAll();
    public void add(Goods good);
    public void update(Goods good);
    public void delete(String id);
    public void out(String id);
}
