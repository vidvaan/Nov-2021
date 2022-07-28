package com.createiq.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.createiq.model.User;

public interface UserRepositry extends JpaRepository<User, Integer>{
     User findByUname(String uname);
}
