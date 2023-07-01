package com.inspur.service;

import com.github.pagehelper.PageInfo;
import com.inspur.pojo.User;

import java.util.List;


public interface UserService {
    public User selectByName(String account);
    public User findById(Integer id);
    public PageInfo<User> selectAll(int pageNum,User user);
    public void insert(User user);
    public void update(User user);
    public void delUser(List<Integer> ids);
}
