package cn.et.test2.mvc;
import java.util.Scanner;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.et.test2.mvc.controller.MyController;
/* FileSystemXmlApplicationContext 默认从绝对路径中查找xml文件  并实例化(需要带盘符) 
 * ClassPathXmlApplicationContext  默认从相对路径中查找xml文件
 * GenericXmlApplicationContext  默认从相对路径中查找xml文件
 * WebApplicationContext     web.xml中实例化
 * 字符串定义查找方式：
 * classpath:  从相对路径中查找xml文件
 * file:  从绝对路径中查找xml文件  需要带盘符
 */
public class MyView {
	static ConfigurableApplicationContext context;
	static{
		//容器对象
		context = new 
				ClassPathXmlApplicationContext("classpath:cn/et/test2/mvc/spring.xml");
		//DataSource dataSource = (DataSource) context.getBean("dataSource");
		//System.out.println(dataSource.getConnection());   测试是否获取连接
	}
	private static MyController mc;
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		try {
			while(true){
				System.out.println("请输入sql语句");
				String sql = in.nextLine();
				mc = (MyController) context.getBean("myController");
				mc.service(sql);
			}
		} catch (Exception e) {
		}finally{
			context.close();
		}
	}
}

