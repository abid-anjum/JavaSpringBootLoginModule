package com.springboot.login.service;

import com.springboot.login.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}