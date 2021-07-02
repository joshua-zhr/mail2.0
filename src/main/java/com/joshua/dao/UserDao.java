package com.joshua.dao;

import com.mongodb.client.FindIterable;

import org.bson.Document;



public interface UserDao {

    FindIterable<Document> findAll();

    Document findByName(String username);


}
