package com.joshua.dao;


import com.joshua.entity.Goods;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GoodsDao extends MongoRepository<Goods,String> {
            public Goods getById(String id);
}
