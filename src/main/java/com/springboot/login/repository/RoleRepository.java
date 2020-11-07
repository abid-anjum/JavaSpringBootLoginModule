package com.springboot.login.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.login.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}