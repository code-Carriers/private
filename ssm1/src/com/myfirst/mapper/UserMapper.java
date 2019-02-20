package com.myfirst.mapper;

import com.myfirst.pojo.User;

public interface UserMapper {
	public void register(User user); 
      
    public User login(User user);
}
