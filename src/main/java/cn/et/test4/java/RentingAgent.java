package cn.et.test4.java;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class RentingAgent implements InvocationHandler{
	Landlord land;// 被代理的对象
	public RentingAgent(Landlord land) {
		this.land = land;
	}
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("找租客");   //前置通知
		System.out.println("收钱");
		//拦截目标对象
		Object obj = null;
		try {
			obj = method.invoke(land, args);
			//环绕通知
		} catch (Exception e) {
			//异常通知
			e.printStackTrace();
		}
		System.out.println("搬家");    //后置通知
		return obj;
	}

}
