package com.tribble.tribblefast.controller;

import com.alibaba.fastjson.JSON;
import com.tribble.tribblefast.entity.dto.ValidExp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * @author lifan
 * @since 2022/8/5 2:25 PM
 * @version 0.0.1
 */
@RestController
@RequestMapping("/valid")
@Slf4j
public class ValidController {

    @PostMapping("/exp1")
    public String exp1(@RequestBody ValidExp validExp) {
        log.info("ValidExp1: {}", JSON.toJSONString(validExp));
        return "valid success " + JSON.toJSONString(validExp);
    }

    @PostMapping("/exp2")
    public String exp2(@Valid @RequestBody ValidExp validExp) {
        //MethodArgumentNotValidException
        log.info("ValidExp2: {}", JSON.toJSONString(validExp));
        return "valid success " + JSON.toJSONString(validExp);
    }

    @PostMapping("/exp3")
    public String exp3(@Valid @RequestBody ValidExp validExp, BindingResult bindingResult) {
        log.info("ValidExp3: {}", JSON.toJSONString(validExp));
        if(bindingResult.hasErrors()) {
            List<ObjectError> objectErrorList = bindingResult.getAllErrors();
            StringBuilder stringBuilder = new StringBuilder("valid fail\n");
            objectErrorList.forEach(error -> {
                stringBuilder.append(error.getDefaultMessage()+"\n");
            });
            return stringBuilder.toString();
        }

        return "valid success " + JSON.toJSONString(validExp);
    }







}
