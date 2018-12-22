package com.example.demo.controller;


import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.entity.User;

@Controller
@RequestMapping("/user")
public class UserController {

	@ResponseBody//设置返回json格式数据
	@RequestMapping("/getUser")
	public User getUser() {
		User user = new User();
		user.setName("imooc");
		user.setPassword("123456");
		user.setAge(20);
		user.setBirthday(new Date());
		user.setDesc("test sptiong ddddddddddddddddddd");
		return user;
	}
}
