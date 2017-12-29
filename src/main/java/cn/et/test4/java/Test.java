package cn.et.test4.java;

import java.lang.reflect.Proxy;

public class Test {

	public static void main(String[] args) {
		//被拦截的类
		Landlord land = new AFLandlord();
		//实现拦截类
		RentingAgent ra = new RentingAgent(land);
		//中介代理对象
		Landlord lproxy = (Landlord) Proxy.newProxyInstance(Test.class.getClassLoader(), land.getClass().getInterfaces(), ra);
		lproxy.rentHouse();
	}

}
