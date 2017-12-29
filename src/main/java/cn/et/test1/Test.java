package cn.et.test1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*FileSystemXmlApplicationContext 默认从绝对路径中查找xml文件  需要带盘符
 * ClassPathXmlApplicationContext  默认从相对路径中查找xml文件
 * GenericXmlApplicationContext  默认从相对路径中查找xml文件
 * WebApplicationContext   在web项目下可用
 * 字符串定义查找方式：
 * classpath:  从相对路径中查找xml文件
 * file:  从绝对路径中查找xml文件  需要带盘符
 */
public class Test {
	public static void main(String[] args) {
		//容器对象
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("classpath:/cn/et/test1/spring.xml");
		A a =(A)context.getBean("a");
		System.out.println(a.getName());
		B b = (B)context.getBean(B.class);
		System.out.println(b.getA().getName());
		C c = (C)context.getBean("c");
		System.out.println(c.getName() + " " + c.getId());
	}
}