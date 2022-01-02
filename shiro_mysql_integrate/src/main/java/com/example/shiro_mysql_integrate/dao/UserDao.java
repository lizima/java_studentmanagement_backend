package com.example.shiro_mysql_integrate.dao;

import com.example.shiro_mysql_integrate.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User, Long> {
    //不用自己实现
    public User findUserByUsername(String username);
}
