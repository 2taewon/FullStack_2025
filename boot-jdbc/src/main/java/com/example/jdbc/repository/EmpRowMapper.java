package com.example.jdbc.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.example.jdbc.domain.Emp;

@Component
public class EmpRowMapper implements RowMapper {

	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		Long empno = rs.getLong("empno");
		String ename = rs.getString("ename");
		int sal = rs.getInt("sal");
		
		return new Emp(empno, ename, sal);
	}
	
}
