package com.pk.first.controller;

import com.pk.second.service.UserService;
import com.pk.third.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Created by pangkunkun on 2018/10/17.
 */
@RestController
public class FirstController {

    private static final Logger logger = LoggerFactory.getLogger(FirstController.class);

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public User getUser(){
        logger.info("This is getUser");
        User user = userService.getUser();
        logger.info("user = {}",user);
        return user;
    }

}
