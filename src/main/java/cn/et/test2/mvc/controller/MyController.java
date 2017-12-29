package cn.et.test2.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import cn.et.test2.mvc.service.MyService;

@Controller
public class MyController {
	@Autowired   //根据类型自动装配
	//不带参数@Resource默认根据类型装配  @Resource(name="myService")根据bean的id进行装配
	private MyService ms; 
	public void service(String sql){
		System.out.println(ms.query(sql));
	}
}
