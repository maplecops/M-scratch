package com.maple.springtest.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname LoginController
 * @Description TODO
 * @Date 2021/2/14 11:27 下午
 * @Created by chenzhongzhi
 * @Version 1.0
 */
@RestController
@RequestMapping("/login")
public class LoginController {

    @GetMapping
    public String login() {
        return "Success";
    }

}
