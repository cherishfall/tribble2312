package com.tribble.tribblefast.safe;

import cn.hutool.crypto.Mode;
import cn.hutool.crypto.Padding;
import cn.hutool.crypto.symmetric.AES;
import org.springframework.boot.test.context.SpringBootTest;

import java.nio.charset.StandardCharsets;
import java.util.Map;

@SpringBootTest
public class DecodeTest {

    public void test1() {
        AES aes = new AES(Mode.CTR, Padding.PKCS5Padding,
                "153A306B395F2730F31346EDD04EDD82".getBytes(StandardCharsets.UTF_8),
                "RF_86_00000001".getBytes(StandardCharsets.UTF_8));
        //Map<String, Object>
    }

}
