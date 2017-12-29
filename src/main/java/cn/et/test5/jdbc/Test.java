package cn.et.test5.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *spring实现aop  可以使用两种技术 
 *1.java中的动态代理(面向接口)
 *2.cglib实现的动态代理
 *实现事务的两种方式
 *   编程式事务
 *   声明式事务
 *     xml声明
 *     注解声明
 */
public class Test {
	static DataSource ds;
	static Connection conn;
	static{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("classpath:/cn/et/test5/jdbc/spring.xml");
		ds = (DataSource) context.getBean("dataSource");
	}
	public static void main(String[] args) throws SQLException {
		try {
			//前置通知
			conn = ds.getConnection();
			conn.setAutoCommit(false);
			
			//业务逻辑
			int money = 10;
			aminus(money);
			@SuppressWarnings("unused")
			int i = 5/0;
			badd(money);
			
			//后置通知
			conn.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			conn.close();
		}
	}
	public static void aminus(int money) throws SQLException{
		String sql = "update bank set balance = balance - "+money+" where id = 1";
		conn.prepareStatement(sql).execute();
	}
	public static void badd(int money) throws SQLException{
		String sql = "update bank set balance = balance + "+money+" where id = 2";
		conn.prepareStatement(sql).execute();
	}
}
