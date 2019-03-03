/*
 * 广州丰石科技有限公司拥有本软件版权2019并保留所有权利。
 * Copyright 2019, Guangzhou Rich Stone Data Technologies Company Limited,
 * All rights reserved.
 */

package com.ebook.user.service;

import com.ebook.user.dao.UserDao;
import com.ebook.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * <b><code>UserService</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2019/3/3 22:31.
 *
 * @author 谢德奇
 * @since SpringBootDemo ${PROJECT_VERSION}
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User getUser(String name,String password){
        return userDao.getUser(name,password);
    }

}
