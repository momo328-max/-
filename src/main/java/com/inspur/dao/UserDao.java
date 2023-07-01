package com.inspur.dao;

import com.inspur.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface UserDao {
    public User selectByName(@Param("account") String account);
    public List<User> selectAll(User user);
    public void insert(User user);
    public void update(User user);
    public void deleteUser(Integer id);

    public User findById(Integer id);


}
