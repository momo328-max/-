package com.inspur.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.inspur.dao.UserDao;
import com.inspur.pojo.User;
import com.inspur.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    public User selectByName(String account) {
        return userDao.selectByName(account);
    }

    public PageInfo<User> selectAll(int pageNum,User user) {
        PageHelper.startPage(pageNum,3);
        List<User> users = userDao.selectAll(user);
        PageInfo<User> pageInfo = new PageInfo<>(users,3);
        return pageInfo;
    }

    public User findById(Integer id) {
        return userDao.findById(id);
    }

    public void insert(User user){
        userDao.insert(user);
    }

    public void update(User user) {
        userDao.update(user);
    }

    public void delUser(List<Integer> ids){
        for (Integer id:ids
             ) {
            userDao.deleteUser(id);
        }
    }


}
