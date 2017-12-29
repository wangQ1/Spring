package cn.et.test2.jdbc;
import java.sql.SQLException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
/* FileSystemXmlApplicationContext 默认从绝对路径中查找xml文件  需要带盘符
 * ClassPathXmlApplicationContext  默认从相对路径中查找xml文件
 * GenericXmlApplicationContext  默认从相对路径中查找xml文件
 * WebApplicationContext    在web项目下可用
 * 字符串定义查找方式：
 * classpath:  从相对路径中查找xml文件
 * file:  从绝对路径中查找xml文件  需要带盘符
 */
public class Test {
	static JdbcTemplate jt;
	static ApplicationContext context;
	static{
		//容器对象
		context = new 
				ClassPathXmlApplicationContext("classpath:cn/et/test2/jdbc/spring.xml");
		//DataSource dataSource = (DataSource) context.getBean("dataSource");
		//System.out.println(dataSource.getConnection());   测试是否获取连接
		jt = (JdbcTemplate) context.getBean("jdbcTemplate");
	}
	public static void main(String[] args) throws SQLException {
		query("select * from article");
	}
	public static void query(String sql){
		System.out.println(jt.queryForList(sql));
	}
	public static void update(){
		String sql = "delete from article where a_id = 12";
		jt.execute(sql);
	}
}