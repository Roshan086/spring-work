package com.jdbc.parameter;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class EmployeeDAO {
	private NamedParameterJdbcTemplate  jdbcTemplate;  
	  
	public EmployeeDAO(NamedParameterJdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	}  
	
	public void saveEmployee(Employee emp) {
		String query="insert into employee values(:id,:name,:salary)";
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("id", emp.getId());
		map.put("name",emp.getName());
		map.put("salary",emp.getSalary());
		
		jdbcTemplate.execute(query,map,new PreparedStatementCallback() {  
		   @Override
			public Object doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				 return ps.executeUpdate();  
			}  
		}); 
	}
}
