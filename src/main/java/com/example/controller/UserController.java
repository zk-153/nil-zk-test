package com.example.controller;

import com.example.model.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * <b><code>UserController</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2019/2/27 15:33.
 *
 * @author xiedeqi
 * @since zk-springboot-demo 0.1.0
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value="index.do")
    public ModelAndView index(){
        return new ModelAndView("login.html");
    }

    @GetMapping(value="login.do")
    public ModelAndView login(String name,String password){
        System.out.println("传入参数：name=" + name + ", password=" + password);
        ModelAndView model = new ModelAndView();
        if (StringUtils.isEmpty(name)) {
            model.addObject("message","name不能为空");
            model.setViewName("login");
            return model;
        } else if (StringUtils.isEmpty(password)) {
            model.addObject("message","password不能为空");
            model.setViewName("login");
            return model;
        }
        User user = userService.find(name, password);
        if (user != null) {
            model.addObject("user",user);
            model.setViewName("index");
            return model;
        } else {
            model.addObject("message","用户或密码错误！");
            model.setViewName("login");
            return model;
        }
    }



}
