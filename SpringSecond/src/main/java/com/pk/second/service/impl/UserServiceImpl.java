package com.pk.second.service.impl;

import org.springframework.stereotype.Service;

import com.pk.second.service.UserService;
import com.pk.third.entity.User;

/**
 * @author Created by pangkunkun on 2018/10/31.
 */
@Service
public class UserServiceImpl implements UserService {


    @Override
    public User getUser(){
        User user = new User();
        user.setUserId(1);
        user.setUsername("pangkun");
        return user;
    }

}
