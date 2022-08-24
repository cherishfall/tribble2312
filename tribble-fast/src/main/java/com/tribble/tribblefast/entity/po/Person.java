package com.tribble.tribblefast.entity.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 *
 *
 * @author lifan
 * @since 2022-06-21 15:32
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Person {
    String name;
    Integer age;

    protected Person say(Man man) {
        return new Person();
    }
}
