package com.joshua;


import com.mongodb.client.FindIterable;
import org.bson.BsonDocument;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootTest
class MailApplicationTests {

    @Autowired
    MongoTemplate mongoTemplate;
    @Test
    void contextLoads() {
        FindIterable<Document> goods = mongoTemplate.getCollection("goods").find();
        for (Document good:goods) {
            System.out.println(good);

        }
    }


}
