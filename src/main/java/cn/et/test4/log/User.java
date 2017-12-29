package cn.et.test4.log;

import org.springframework.stereotype.Component;

@Component
public class User {
	public void login(){
		System.out.println("login方法被调用");
		System.out.println("用户登录");
	}
	public void buy(){
		System.out.println("buy方法被调用");
		System.out.println("用户购物");
	}
}
