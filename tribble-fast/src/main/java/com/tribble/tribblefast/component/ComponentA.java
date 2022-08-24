package com.tribble.tribblefast.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author lifan
 * @since 2022/8/24 11:30 AM
 */
@Component
public class ComponentA {
    @Value("varA")
    private String varA;

    public void say() {
        System.out.println("Component A #say: " + varA);
    }
}
