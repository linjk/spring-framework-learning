package cn.linjk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Copyright 1990-2020 LinJK
 *
 * @fileName: Main
 * @author: linjk
 * @date: 2021/8/10 上午12:31
 * @description:
 */
public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-test.xml");
		UserService userService = (UserService)context.getBean("userService");
		User user = userService.getUserById(1);
		System.out.println(user);
	}
}
