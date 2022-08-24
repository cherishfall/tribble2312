package com.tribble.tribblefast.service;

import com.tribble.tribblefast.component.ComponentA;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author lifan
 * @since 2022/8/24 10:04 AM
 */
public abstract class PersonService {
    private static final Logger log = LoggerFactory.getLogger(PersonService.class);

    private ComponentA componentA;

    public PersonService() {
    }

    public PersonService(ComponentA componentA) {
        this.componentA = componentA;
    }

    public abstract void fun0();

    public void fun1() {
        log.info("PersonService");
    }

    public ComponentA getComponentA() {
        return componentA;
    }

}
