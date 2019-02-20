package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.mapper.UserMapper;
import com.test.entity.User;
import com.test.service.UserService;
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

	@Override
	public List<User> infor() {
		// TODO Auto-generated method stub
		return userMapper.infor();
	}

}
