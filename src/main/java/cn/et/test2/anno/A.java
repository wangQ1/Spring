package cn.et.test2.anno;

import org.springframework.stereotype.Component;
/**
 * 注解@component 让spring容器自动实例化当前类 
 * 等同于在容器中实例化对象
 * <bean id="a" class="cn.et.test2.jdbc.A" init-method="ini" destroy-method="des"></bean>
 * 自动实例化对象 的id默认为当前类名首字母小写  也可自定义id如：@Component("aa")
 * @author Administrator
 *
 */
@Component
public class A {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//容器创建bean之后调用
	public void ini(){
		System.out.println("ini");
	}
	//容器销毁bean时调用
	public void des(){
		System.out.println("des");
	}
}
