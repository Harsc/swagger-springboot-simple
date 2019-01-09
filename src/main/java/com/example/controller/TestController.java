package com.example.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = {"学生"})
@RestController
public class TestController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String handle() {
        return "handle";
    }
}
