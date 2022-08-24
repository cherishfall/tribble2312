package com.tribble.tribblefast;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.tribble.tribblefast.entity.dto.ValidExp;
import org.junit.jupiter.api.Test;

import javax.validation.Valid;
import java.util.Optional;

/**
 * @author lifan
 * @since 2022/8/5 4:24 PM
 */
public class FastTest {
    @Test
    void test1() {
        ValidExp evidenceChainPO1 = new ValidExp();
        System.out.println(!Optional.ofNullable(evidenceChainPO1).isPresent()); // false

        ValidExp evidenceChainPO2 = null;
        System.out.println(!Optional.ofNullable(evidenceChainPO2).isPresent()); // true
        //ObjectNode
        //JsonNode

    }

    @Test
    void test2() {
        String str2 = null;
        System.out.println("haha");
        System.out.println("lili");
        System.out.println(str2.toString());
        System.out.println("ooo");
    }


}
