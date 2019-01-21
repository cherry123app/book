package com.seven.book.service.impl;

import com.seven.book.entity.User;
import com.seven.book.mapper.UserMapper;
import com.seven.book.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLoginServiceImpl implements UserLoginService {
    @Autowired
    UserMapper userMapper;
    @Override
    public int login(User user) {
        return userMapper.insert(user);
    }
}
