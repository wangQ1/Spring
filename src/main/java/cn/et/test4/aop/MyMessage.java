package cn.et.test4.aop;

import org.springframework.stereotype.Component;

@Component
public class MyMessage {
	public void beforeInform(){
		System.out.println("打扫卫生");
	}
	public void afterInform(){
		System.out.println("嘿嘿嘿");
	}
	public void throwing(){
		System.out.println("完蛋，出现异常了");
	}
}
