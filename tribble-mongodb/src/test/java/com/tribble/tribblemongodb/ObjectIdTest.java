package com.tribble.tribblemongodb;

import lombok.extern.slf4j.Slf4j;
import org.bson.types.ObjectId;
import org.junit.Test;

/**
 * @author lifan
 * @since 2022/8/18 1:22 PM
 */
@Slf4j
public class ObjectIdTest {

    @Test
    public void test1() {
        ObjectId objectId = new ObjectId("61123513de29d4238cd25f91");
        log.info("{}, {}, {}", objectId,objectId.getDate(), objectId.getTimestamp());
        // 61123513de29d4238cd25f91, Tue Aug 10 16:13:07 CST 2021, 1628583187
    }


}
