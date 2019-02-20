package com.test.service;

import java.util.List;

import com.test.entity.User;

public interface UserService {
	public void register(User user); 
    
    public User login(User user);
    public List<User> infor();
}
