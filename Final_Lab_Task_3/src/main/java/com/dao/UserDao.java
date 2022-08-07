package com.dao;

public interface UserDao {
    boolean authenticateUser(String username, String password);
}
