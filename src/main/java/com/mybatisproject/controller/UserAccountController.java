package com.mybatisproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserAccountController {

    @GetMapping("/sing-up")
    public String singup() {
        return "UserAccount/Sing-up";
    }

}
