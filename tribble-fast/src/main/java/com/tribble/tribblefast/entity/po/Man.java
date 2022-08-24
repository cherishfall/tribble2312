package com.tribble.tribblefast.entity.po;

import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author cherishfall
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@SuperBuilder
public class Man extends Person{
    String sex;

    protected Person say(Person man) {
        return new Person();
    }
}
