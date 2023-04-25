package com.zcx.myblogs.service.serviceImpl;

import com.zcx.myblogs.mapper.UserMapper;
import com.zcx.myblogs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public int addUser(String username, String password) {
        return userMapper.addUser(username,password);
    }
}
