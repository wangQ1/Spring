package cn.et.test4.log;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
/* ConfigurableApplicationContext  初始化容器
 * FileSystemXmlApplicationContext 默认从绝对路径中查找xml文件  并实例化(需要带盘符) 
 * ClassPathXmlApplicationContext  默认从相对路径中查找xml文件
 * GenericXmlApplicationContext  默认从相对路径中查找xml文件
 * WebApplicationContext     web.xml中实例化
 * 字符串定义查找方式：
 * classpath:  从相对路径中查找xml文件
 * file:  从绝对路径中查找xml文件  需要带盘符
 */

/**
 *spring实现aop  可以使用两种技术 
 *1.java中的动态代理(面向接口)
 *2.cglib实现的动态代理
 */
public class Test {
	static ConfigurableApplicationContext context;
	static{
		//容器对象
		context = new 
				GenericXmlApplicationContext("classpath:/cn/et/test4/log/spring.xml");
		//DataSource dataSource = (DataSource) context.getBean("dataSource");
		//System.out.println(dataSource.getConnection());   测试是否获取连接
	}
	public static void main(String[] args) {
		User user = (User)context.getBean("user");
		for (int i = 0; i < 10; i++) {
			user.login();
		}
		user.buy();
		user.buy();
		user.buy();
		Admin admin = (Admin)context.getBean("admin");
		admin.addCommodity();
		admin.addCommodity();
		context.close();
	}

}
