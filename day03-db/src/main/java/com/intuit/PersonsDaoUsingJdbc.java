package com.intuit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class PersonsDaoUsingJdbc {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void insertPerson(String name, int age) {
		String sql = "insert into persons(name, age) values(?, ?)";
		jdbcTemplate.update(sql, name, age);
	}
	
	public List<String> getNames() {
		String sql = "select name from persons";
		return jdbcTemplate.queryForList(sql, String.class);
	}
	
	public void updateAge(int id, int newAge) {
		String sql = "update persons set age = ? where id = ?";
		jdbcTemplate.update(sql, newAge, id);
	}
	
	public void deletePerson(int id) {
		String sql = "delete from persons where id = ?";
		jdbcTemplate.update(sql, id);
	}
}
