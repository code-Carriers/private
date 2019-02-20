package com.test.mapper;

import java.util.List;

import com.test.entity.User;

public interface UserMapper {
	public void register(User user); 
    
    public User login(User user);
    
    public List<User> infor();
}
