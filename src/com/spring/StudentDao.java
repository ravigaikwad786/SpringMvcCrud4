package com.spring;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDao {

		JdbcTemplate jdbcTemplate;

		public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
			this.jdbcTemplate = jdbcTemplate;
		}

	
		
	
}
