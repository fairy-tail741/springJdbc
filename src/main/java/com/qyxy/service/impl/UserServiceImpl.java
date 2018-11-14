package com.qyxy.service.impl;

import com.qyxy.dao.UserDao;
import com.qyxy.entity.User;
import com.qyxy.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/7/30 0030.
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
    @Override
    public List userList() {
        return userDao.userList();
    }

    @Override
    public void deleteUser(User user) {
       userDao.deleteUser(user);
    }

    @Override
    public User findUserById(int id) {
        return userDao.findUserById(id);
    }

    @Override
    public List<User> findUserListBySearch(String nickname, String status, int currentPage, int pageSize) {
        return userDao.findUserListBySearch(nickname, status, currentPage, pageSize);
    }

    @Override
    public void saveUser(User user) {
      userDao.saveUser(user);
    }
}
