package cn.et.test4.log;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Component
public class MyMessage {
	Logger log = Logger.getLogger(MyMessage.class);
	public void beforeInform(JoinPoint jp){
		String method = jp.getSignature().getName();
		log.debug(method + "方法被调用");
	}
}
