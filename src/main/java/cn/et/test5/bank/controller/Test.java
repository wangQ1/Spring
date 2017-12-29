package cn.et.test5.bank.controller;

import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.et.test5.bank.dao.MyAccountDao;

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
	static MyAccountDao mad;
	static Connection conn;
	static{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("classpath:/cn/et/test5/bank/spring.xml");
		mad = (MyAccountDao) context.getBean("myAccountDaoImpl");
	}
	public static void main(String[] args) throws SQLException {
		mad.updateAminus(10);
	}
}
