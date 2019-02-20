package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.test.entity.User;
import com.test.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService userService;

	
	  @RequestMapping("login.action") 
	  public ModelAndView login(User user) {
	  System.out.println(user.getName()+" "+user.getPassword());
	  ModelAndView mav =  new ModelAndView();
	  User newuser = userService.login(user); 
	  if (newuser !=  null) { 
		  // 放入转发参数
		  mav.addObject("newuser", newuser);
		 // 放入jsp路径
	  mav.setViewName("index");
	  
	  }
	  else mav.setViewName("login");
	  return mav;
	  }
	 
	@RequestMapping("register.action")
	public ModelAndView register(User user) {
		System.out.println(user.getAge());
		ModelAndView mav = new ModelAndView();
		if(user.getName().equals("")||user.getPassword().equals(""))
			mav.setViewName("register");
			
		else {
			userService.register(user);
			// 放入jsp路径
			mav.setViewName("login");
		 } 
		return mav;
	}
	@RequestMapping("infor")
	public ModelAndView infor() {
		ModelAndView mav=new ModelAndView();
		List users=userService.infor();
		mav.addObject(users);
		mav.setViewName("infor");
		return mav;
	}
}
