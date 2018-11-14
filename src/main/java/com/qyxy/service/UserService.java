package com.qyxy.service;

import com.qyxy.entity.User;

import java.util.List;

/**
 * Created by Administrator on 2018/7/30 0030.
 */
public interface UserService {
    public List userList();

    public void deleteUser(User user);

    //查询一个用户
    public User findUserById(int id);
    //通过条件搜索多个用户对象
    public List<User> findUserListBySearch(String nickname,String status,int currentPage,int pageSize);

    public void saveUser(User user);

}
