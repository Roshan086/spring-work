package com.spring.jdbc.prepared.statement;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

public class EmployeeDAO {
	private JdbcTemplate jdbcTemplate;  
	  
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	}  
	  
	public Boolean saveEmployeeByPrepareStatement(Employee e){  
	    String query="insert into employee values(?,?,?)";  
	    return jdbcTemplate.execute(query,new PreparedStatementCallback<Boolean>() {
	    	@Override
	    	public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException {
	    		ps.setInt(1, e.getId());
	    		ps.setString(2, e.getName());
	    		ps.setFloat(3, e.getSalary());
				return ps.execute();
	    	}
		});
	}  	
}
