package cn.et.test2.anno;
import java.sql.SQLException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/* FileSystemXmlApplicationContext 默认从绝对路径中查找xml文件  需要带盘符
 * ClassPathXmlApplicationContext  默认从相对路径中查找xml文件
 * GenericXmlApplicationContext  默认从相对路径中查找xml文件
 * WebApplicationContext   在web项目下可用
 * 字符串定义查找方式：
 * classpath:  从相对路径中查找xml文件
 * file:  从绝对路径中查找xml文件  需要带盘符
 */
public class Test {
	static ApplicationContext context;
	static{
		//容器对象
		context = new 
				ClassPathXmlApplicationContext("classpath:cn/et/test2/anno/spring.xml");
	}
	public static void main(String[] args) throws SQLException {
		A a = (A)context.getBean("a");
		System.out.println(a);
	}
}