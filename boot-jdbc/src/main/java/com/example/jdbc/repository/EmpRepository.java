package com.example.jdbc.repository;

import java.util.List;

import com.example.jdbc.domain.Emp;

public interface EmpRepository {
	
	// 전체사원 조회
	List<Emp> findAll();
	
	//특정 사원 번호로 사원 정보 조회
	Emp findOne(Long empno); // insert or update
	
	//사원정보저장
	Emp save(Emp emp);
	
	//사원 번호로 사원 삭제
	void delete(Long empno);
	
	//여러사원 정보 일괄 추가 
	int[] batchInsert(List<Object[]> params);
}
