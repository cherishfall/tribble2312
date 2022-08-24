package com.tribble.tribblefast.service;

import com.tribble.tribblefast.component.ComponentA;
import com.tribble.tribblefast.component.ComponentB;
import org.checkerframework.checker.units.qual.A;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @author lifan
 * @since 2022/8/24 10:04 AM
 */
@Service
public class ManService extends PersonService{
    private static final Logger log = LoggerFactory.getLogger(ManService.class);

    private ComponentB componentB;

    @Autowired
    public ManService(ComponentA componentA, ComponentB componentB) {
        super(componentA);
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

    @Override
    public void fun1() {
        super.fun1();
        log.info("ManService");
    }

}
