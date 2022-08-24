package com.tribble.tribblefast.service;

import com.tribble.tribblefast.component.ComponentA;
import com.tribble.tribblefast.component.ComponentB;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @author lifan
 * @since 2022/8/24 2:09 PM
 */
@Service
public class WomanService extends PersonService{

    private ComponentB componentB;

    @Autowired
    public WomanService(ComponentB componentB) {
        this.componentB = componentB;
    }

    @Override
    public void fun0() {
        ComponentA componentA = getComponentA();
        if(Objects.nonNull(componentA)) {
            componentA.say();
        }
        if(Objects.nonNull(componentB)) {
            componentB.say();
        }
    }
}
