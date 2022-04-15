package com.minicrof.service.impl;

import com.minicrof.mapper.UserMapper;
import com.minicrof.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    UserMapper userMapper;


    @Override
    public Boolean ifFindUser(String username, String password) {
        return userMapper.findByUsernamePwd(username,password)!=null;
    };
}
