package com.metlushko.demo.spring.service;

import java.util.List;

import com.metlushko.demo.spring.model.User;

public interface UserService {
   void save(User user);

   List<User> list();
}
