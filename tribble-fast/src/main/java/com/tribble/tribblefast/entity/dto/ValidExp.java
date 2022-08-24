package com.tribble.tribblefast.entity.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;

/**
 * @author lifan
 * @since 2022/8/5 2:31 PM
 */
@Data
@NoArgsConstructor
public class ValidExp {

    @NotBlank(message = "姓名不能为blank")
    String name;

    @Range(min = 0, max = 120, message = "年龄必须在0-120之间")
    Integer age;

}
