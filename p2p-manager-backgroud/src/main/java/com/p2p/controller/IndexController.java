package com.p2p.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lenovo on 2018/1/17.
 */
@RestController
public class IndexController {
    @RequestMapping("/")
    public String showIndex(){
        return "Hello SpringBoot World!!!";
    }
}
