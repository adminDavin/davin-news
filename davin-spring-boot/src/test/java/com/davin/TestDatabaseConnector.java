package com.davin;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.junit4.SpringRunner;

import com.davin.project.user.model.User;
import com.davin.starter.Application;


@RunWith(SpringRunner.class)
@SpringBootTest(classes={Application.class})// 指定启动类
public class TestDatabaseConnector {
	private static final Logger logger = LoggerFactory.getLogger(TestDatabaseConnector.class);
	
	
	@Resource
	private JdbcTemplate jdbcTemplate;

	@Test
	public void mysqlTest() {
		String sql = "select id, name, login_name from users";
		List<User> users = jdbcTemplate.query(sql, new RowMapper<User>() {
			@Override
			public User mapRow(ResultSet rs, int arg1) throws SQLException {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setLoginName("login_name");
				return user;
			}
		});
		logger.info("auto test connect database:" + users);
	}
}
