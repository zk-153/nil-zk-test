/*
 * 广州丰石科技有限公司拥有本软件版权2019并保留所有权利。
 * Copyright 2019, Guangzhou Rich Stone Data Technologies Company Limited,
 * All rights reserved.
 */

package com.ebook.user.controller;

import com.ebook.user.model.User;
import com.ebook.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <b><code>UserController</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2019/3/3 22:34.
 *
 * @author 谢德奇
 * @since SpringBootDemo ${PROJECT_VERSION}
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value="getUser")
    public User getUser(String name,String password){
        return userService.getUser(name,password);
    }

    @GetMapping("listUser")
    public List<User> listUser(){
        return userService.listUser();
    }

    @GetMapping(value="addUser")
    public void addUser(User user){
        userService.addUser(user);
    }

    @GetMapping(value="updateUser")
    public void updateUser(User user){
        userService.updateUser(user);
    }

    @GetMapping(value="delUser")
    public void delUser(Integer id){
        userService.delUser(id);
    }

}
