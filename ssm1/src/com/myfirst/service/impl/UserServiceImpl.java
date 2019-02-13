package com.myfirst.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myfirst.mapper.UserMapper;
import com.myfirst.pojo.User;
import com.myfirst.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserMapper userMapper;
	

	@Override
	public void register(User user) {
		// TODO Auto-generated method stub
		 userMapper.register(user);
	}

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		return userMapper.login(user);
	}

}
