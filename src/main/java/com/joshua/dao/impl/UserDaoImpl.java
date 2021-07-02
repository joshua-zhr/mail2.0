package com.joshua.dao.impl;

import com.joshua.dao.UserDao;
import com.mongodb.client.FindIterable;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
     @Autowired
    private MongoTemplate mongoTemplate;


    @Override
    public FindIterable<Document> findAll() {
        return mongoTemplate.getCollection("users").find();
    }

    @Override
    public Document findByName(String username) {
        Document documentRes = null;
        FindIterable<Document> documents = mongoTemplate.getCollection("users").find(Filters.eq("username", username));
        for (Document document:documents) {
            documentRes = document;
        }
        return documentRes;
    }



}
