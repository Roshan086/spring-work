package com.spring.jdbc.prepared.statement;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;

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
	public List<Employee> getAllEmployees(){
		String query = "select * from employee";
		return jdbcTemplate.query(query,new ResultSetExtractor<List<Employee>>(){
			@Override
			public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				List<Employee> list=new ArrayList<Employee>();
				while(rs.next()) {
					Employee e=new Employee();
					e.setId(rs.getInt(1));
					e.setName(rs.getString(2));
					e.setSalary(rs.getFloat(3));
					list.add(e);
				}
				return list;
			}
		});
	}
}
