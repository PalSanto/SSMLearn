package com.example.dao;

import com.example.domain.User;

import java.io.IOException;
import java.util.List;


public interface UserDao {
    public List<User> findAll();

    public User findById(int id);

}
