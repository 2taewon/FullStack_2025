package com.example.jdbc.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.jdbc.domain.Emp;

@Repository // 스프링이 이 클래스를 bean으로 자동 등록 
@Transactional(readOnly = true) // 읽기 전용 트랜젝션 작성
public class EmpRepositoryImpl implements EmpRepository{
	
	@Autowired
	private JdbcTemplate jdbcTemplate; // dml명령처리 
	
	@Autowired
	private RowMapper<Emp> empRowMapper;
	
	@Override
	public List<Emp> findAll() { // EMP 객체로 결과를 매핑한 RowMapper Bean 주입 
		String sql = "select * from emp";
		List<Emp> emps = jdbcTemplate.query(sql, empRowMapper);
		return emps;
	}

	@Override
	public Emp findOne(Long empno) { //
		try {
		String sql = "select * from emp where empno = ?";
		return jdbcTemplate.queryForObject(sql, empRowMapper, empno);
		}catch(Exception e) {
			return null; //Optional.empty()
		}
	}

	@Override
	@Transactional(readOnly = false) // 쓰기 작업이라 readOnly true 필요
	public Emp save(Emp emp) {
		String sql = "insert into emp(empno, ename, sal) values(?, ?, ?)";
		
		jdbcTemplate.update(sql, emp.getEmpno(), emp.getEname(), emp.getSal());
		return emp;
	}

	@Override
	@Transactional(readOnly = false)
	public void delete(Long empno) {
		String sql = "delete from emp where empno = ?";
		this.jdbcTemplate.update(sql, empno);
	}

	@Override
	@Transactional(readOnly = false)
	public int[] batchInsert(List<Object[]> params) {
		String sql = "insert into emp(empno, ename, sal) values(?, ?, ?)";
		return this.jdbcTemplate.batchUpdate(sql, params);
		//jdbcTemplate.execute(sql);
	}
	
}

//public int update(String query) : 레코드 insert, update, delete 처리 
//public int update(String query, Object...args) : PreparedStatement 를 이용해서 주어진 파라미터로 레코드


