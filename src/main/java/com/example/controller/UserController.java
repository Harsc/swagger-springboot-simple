package com.example.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String handle() {
        return "user-handle";
    }


    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public String handle1() {
        return "user-handle-page";
    }


    @RequestMapping(value = "/disk", method = RequestMethod.GET)
    public String handle2() {
        return "user-handle-disk";
    }

    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public String handle3() {
        return "user-handle-view";
    }


    @RequestMapping(value = "/view/button", method = RequestMethod.GET)
    public String handle4() {
        return "user-handle-view/button";
    }
}
