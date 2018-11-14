package com.qyxy.dao.daoImpl;

import com.qyxy.dao.UserDao;
import com.qyxy.entity.User;
import org.hibernate.Session;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;


import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/7/30 0030.
 */
@Repository(value ="userDao")
public class UserDaoImpl implements UserDao {
    @Resource
    private JdbcTemplate jdbcTemplate;
    @Resource
    private HibernateTemplate hibernateTemplate;
    @Override
    public List userList() {
        List<User> userList = (List<User>) hibernateTemplate.find("from User");

        return userList;
    }

    @Override
    public void deleteUser(User user) {
            hibernateTemplate.delete(user);
    }

    @Override
    public User findUserById(int id) {
        User user = hibernateTemplate.get(User.class,id);
        return user;
    }

    @Override
    public List<User> findUserListBySearch(String nickname, String status, int currentPage, int pageSize) {
        Session session = hibernateTemplate.getSessionFactory().getCurrentSession();
        List<User> userList =  session.createQuery("from User where status = ? and nickname like ?")
                .setParameter(0,status)
                .setParameter(1,"%"+nickname+"%")
                .setFirstResult((currentPage-1)*pageSize)
                .setMaxResults(pageSize)
                .list();
        return userList;
    }

    @Override
    public void saveUser(User user) {
      hibernateTemplate.save(user);
    }


}
