package com.tribble.tribblefast.entity.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lifan
 * @since 2022/8/5 10:19 AM
 */
@Data
@NoArgsConstructor
public class Shape {

    private Integer var1;

    private String var2;

    private Double var3;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer var11;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String var22;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double var33;
}
