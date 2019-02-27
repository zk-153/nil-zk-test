package com.example.service;

import com.example.dao.UserDAO;
import com.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <b><code>UserService</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2019/2/27 14:52.
 *
 * @author xiedeqi
 * @since zk-springboot-demo 0.1.0
 */
@Service
public class UserService {
    @Autowired
    private UserDAO userDAO;

    public User find(String name,String password){
        return userDAO.find(name,password);
    }

}
