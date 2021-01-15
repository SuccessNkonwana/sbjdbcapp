package com.zen.sbjdbcapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Customer> findAll(){
		String sql = "select * from customers";
		return jdbcTemplate.query(sql,new BeanPropertyRowMapper<Customer>(Customer.class));
		
		
	}
}
