package cn.et.test2.mvc;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
@Configuration     //表示该类为配置类
public class MyConfig {
	@Value("${url}")  //从properties资源文件中获取值
	private String url;
	@Value("${driverClassName}")
	private String driverClassName;
	@Value("${username1}")
	private String username;
	@Value("${password}")
	private String password;
	@Bean     //表示调用该方法产生一个实例(bean), 方法名为bean的id
	public JdbcTemplate jdbcTemplate(DataSource dataSource){
		return new JdbcTemplate(dataSource);
	}
	@Bean
	public DataSource dataSource(){
		DriverManagerDataSource dmds = new DriverManagerDataSource();
		dmds.setUrl(url);
		dmds.setDriverClassName(driverClassName);
		dmds.setUsername(username);
		dmds.setPassword(password);
		return dmds;
	}
}
