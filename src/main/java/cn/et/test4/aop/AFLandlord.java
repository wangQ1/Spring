package cn.et.test4.aop;

import org.springframework.stereotype.Component;

@Component    //泛指组件 
public class AFLandlord{

	public void rentHouse() {
		System.out.println("安放学院房东房屋出租");
		//int i = 8/0;
	}

}
