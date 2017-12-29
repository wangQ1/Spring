package cn.et.test2.mvc.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MyDao {
	@Autowired
	private JdbcTemplate tj;
	public List<Map<String, Object>> query(String sql){
		List<Map<String, Object>> list = tj.queryForList(sql);
		return list;
	}
}
