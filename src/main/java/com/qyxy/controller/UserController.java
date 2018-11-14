package com.qyxy.controller;

import com.alibaba.fastjson.JSON;
import com.qyxy.entity.User;
import com.qyxy.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/7/30 0030.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping("/userList")
    @ResponseBody
    public String userList(){
        List list = userService.userList();
        return JSON.toJSONString(list);
    }
    @RequestMapping("/deleteUser")
    @ResponseBody
    public String deleteUser(User user){
        userService.deleteUser(user);
        return JSON.toJSONString("true");
    }
    @RequestMapping("/findUserById")
    @ResponseBody
    public String findUserById(int id){
       User user = userService.findUserById(id);
        return JSON.toJSONString(JSON.toJSONString(user));
    }
    @RequestMapping("/findUserBySearch")
    @ResponseBody
    public String findUserBySearch(String nickname,String status,int currentPage,int pageSize){
        List<User> userList = (List<User>) userService.findUserListBySearch(nickname, status, currentPage, pageSize);
        return JSON.toJSONString(JSON.toJSONString(userList));
    }
    @RequestMapping("/saveUser")
    @ResponseBody
    public String saveUser(User user){
        user.setUsername("username");
        user.setPassword("password");
        user.setStatus("status");


       userService.saveUser(user);
        return JSON.toJSONString("true");
    }
}
