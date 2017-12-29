package cn.et.test5.bank.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import cn.et.test5.bank.dao.MyAccountDao;

@Repository
public class MyAccountDaoImpl implements MyAccountDao {
	@Autowired
	private JdbcTemplate jt;
	public void updateAminus(int money){
		String sql = "update bank set balance = balance - "+money+" where id = 1";
		jt.execute(sql);
		saveBbadd(money);
	}
	public void saveBbadd(int money){
		String sql = "update bank set balance = balance + "+money+" where id = 2";
		jt.execute(sql);
	}
}
