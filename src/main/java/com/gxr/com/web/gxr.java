package com.gxr.com.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gxr.com.entity.User;
import com.gxr.com.service.UserService;

@Controller
@RequestMapping("gxr")
public class gxr {
 public static Logger logger=LoggerFactory.getLogger(gxr.class);
 
 @Autowired
 private UserService userService;
 
	@RequestMapping("hello")
	public void hello(){
		System.out.println("hello");
//		return "";
	}
	
	@RequestMapping("save")
	public void save(){
		User u=new User();
		u.setEmail("gxr107@qq.com");
		u.setPassword("111111");
		 userService.save(u);
		 System.out.println("save-------return");
//		System.out.println("------count:"+count);
	}
	
/*	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext");
		UserService service = (UserService) context.getBean("userService");
		User user=new User();
		user.setZoneId(83);
		user.setEmail("12082@qq.com");
		user.setNickname("gxr414");
		user.setPassword("222222");
		service.save(user);
		
		
		
	}*/
}
