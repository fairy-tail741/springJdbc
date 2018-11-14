package com.qyxy.test;


import com.qyxy.dao.UserDao;
import com.qyxy.entity.User;
import com.qyxy.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by Administrator on 2018/7/30 0030.
 */
public class jdbcTest {
    @Test
    public void t1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        List list = userDao.userList();
        System.out.print(list.size());
    }
    @Test
    public void t2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        List list = userService.userList();
        User user = (User) list.get(list.size()-1);
        userService.deleteUser(user);
        System.out.print(list.size());
    }

}
