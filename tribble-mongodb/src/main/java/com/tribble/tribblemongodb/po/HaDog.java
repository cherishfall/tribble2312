package com.tribble.tribblemongodb.po;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDateTime;

/**
 * @author lifan
 * @since 2022/8/18 5:00 PM
 */
@Document("ha_dog")
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class HaDog {

    @MongoId
    ObjectId id;

    @Field("name")
    String name;

    @Field("age")
    Integer age;

    @Field("hair_color")
    String hairColor;

    @Field("birth")
    LocalDateTime birth;

}
