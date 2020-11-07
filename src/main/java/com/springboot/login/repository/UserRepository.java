package com.springboot.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.login.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}