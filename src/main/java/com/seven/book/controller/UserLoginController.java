package com.seven.book.controller;

import com.seven.book.entity.User;
import com.seven.book.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserLoginController {
    @Autowired
    UserLoginService userLoginService;
    @PostMapping("/login")
    public int login(User user) {
        return userLoginService.login(user);
    }
}
