package com.tribble.tribblemongodb.dao;

import com.tribble.tribblemongodb.po.HaDog;
import lombok.extern.slf4j.Slf4j;
import org.bson.types.ObjectId;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author lifan
 * @since 2022/8/18 5:25 PM
 */
@SpringBootTest
@Slf4j
class HaDogDaoTest {

    private HaDogDao haDogDao;

    /**
     * insert 行为，会自动填充id
     * */
    @Test
    void insertHaDog1() {
        HaDog haDog = HaDog.builder()
                .name("wangwang")
                .age(1)
                .hairColor("蓝色")
                .birth(LocalDateTime.now().minusYears(1))
                .build();
        // 会自动填充id：62fe17377fb1b10e525d63fc
        HaDog savedHaDog = haDogDao.insertHaDog(haDog);
        // 就是同一个对象
        log.info("savedHaDog == haDog: {}", savedHaDog == haDog);
    }

    /**
     * insert 行为，设置同一个id后，插入会报错
     * */
    @Test
    void insertHaDog2() {
        HaDog haDog = HaDog.builder()
                .id(new ObjectId("62fe17377fb1b10e525d63fc"))
                .name("aiai")
                .age(2)
                .hairColor("蓝色")
                .birth(LocalDateTime.now().minusYears(1))
                .build();
        // E11000 duplicate key error collection: tribble-mongo.ha_dog index: _id_ dup key
        HaDog savedHaDog = haDogDao.insertHaDog(haDog);

        log.info("savedHaDog == haDog: {}", savedHaDog == haDog);
    }

    /**
     * insert 行为，设置同一个id后，插入会报错
     * */
    @Test
    void insertHaDog3() {
        // 提前设置id ： 62fe191c7ae0e950c08198b7
        HaDog haDog = HaDog.builder()
                .id(new ObjectId())
                .name("aiai")
                .age(2)
                .hairColor("蓝色")
                .birth(LocalDateTime.now().minusYears(1))
                .build();
        // 使用的是设置的id，没填充
        HaDog savedHaDog = haDogDao.insertHaDog(haDog);
        // 还是同一个对象
        log.info("savedHaDog == haDog: {}", savedHaDog == haDog);
    }

    /**
     * save 会把相同id的给替换掉，不会报错，注意，行为不是更新存在的，而是整个文档都替换掉
     * 所以适用于把原来的给查询出来，更新某几个字段，再插入整个替换掉是可以的。
     * 和单独更新几个字段是不一样的。感觉后台的操作更像先删除再插入的逻辑。
     * update是更新原有的那个字段
     * */
    @Test
    public void saveHaDog1() {
        HaDog haDog = HaDog.builder()
                .id(new ObjectId("62fe17377fb1b10e525d63fc"))
                .hairColor("红色")
                .build();
        HaDog savedHaDog = haDogDao.saveHaDog(haDog);
        log.info("savedHaDog == haDog: {}", savedHaDog == haDog);

    }

    @Autowired
    public void setHaDogDao(HaDogDao haDogDao) {
        this.haDogDao = haDogDao;
    }

}