package com.qyxy.dao;


import com.qyxy.entity.User;

import java.util.List;

/**
 * Created by Administrator on 2018/7/30 0030.
 */
public interface UserDao {
    public List userList();
    public void deleteUser(User user);
    public User findUserById(int id);
    public List<User> findUserListBySearch(String nickname ,String status, int currentPage,int pageSize);
    public void saveUser(User user);
}
