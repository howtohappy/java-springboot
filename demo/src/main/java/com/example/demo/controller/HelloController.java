package com.example.demo.controller;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.resource.Resource;

@RestController("/")
public class HelloController {

	@Autowired
	private Resource resource;
	
	@RequestMapping("/hello")
	public Object hello() {
		return "hello springBoot~~";
	}
	
	@RequestMapping("/getResource")
	public Resource getResource() {
		Resource bean = new Resource();
		BeanUtils.copyProperties(resource, bean);
		return bean;
	}
}
