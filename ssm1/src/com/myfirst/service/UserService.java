package com.myfirst.service;

import com.myfirst.pojo.User;

public interface UserService {
	public void register(User user); 
    
    public User login(User user);
}
