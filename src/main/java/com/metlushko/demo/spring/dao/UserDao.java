package com.metlushko.demo.spring.dao;

import java.util.List;

import com.metlushko.demo.spring.model.User;

public interface UserDao {
   void save(User user);
   List<User> list();
}
