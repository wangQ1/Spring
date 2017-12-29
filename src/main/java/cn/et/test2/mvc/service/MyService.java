package cn.et.test2.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.et.test2.mvc.dao.MyDao;
@Service
public class MyService {
	@Autowired
	private MyDao md;
	public String query(String sql){
		return md.query(sql).toString();
	}
}
