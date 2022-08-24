package com.tribble.tribblemongodb.dao;

import com.tribble.tribblemongodb.po.HaDog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author lifan
 * @since 2022/8/18 5:06 PM
 */
@Repository
public class HaDogDao {
    private static final String COLLECTION_NAME = "ha_dog";

    private MongoTemplate mongoTemplate;

    @Autowired
    public HaDogDao(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }


    public HaDog insertHaDog(HaDog haDog) {
        return mongoTemplate.insert(haDog, COLLECTION_NAME);
    }

    public HaDog saveHaDog(HaDog haDog) {
        return mongoTemplate.save(haDog, COLLECTION_NAME);
    }
}
