package com.example.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.example.jdbc.domain.Emp;
import com.example.jdbc.repository.EmpRepository;

@SpringBootApplication
public class BootJdbcApplication implements CommandLineRunner {
	@Autowired
    EmpRepository empRepository;  // 사원 정보를 처리하는 Repository를 주입받음
	
	public static void main(String[] args) {
		SpringApplication.run(BootJdbcApplication.class, args);
	}

	 

    @Override
    public void run(String... args) throws Exception {
        // selectAll
        System.out.println("전체 사원 출력-----------");
        List<Emp> emps = empRepository.findAll();  // DB에서 모든 사원 정보 가져오기

        for(Emp e:emps) {
            System.out.println(e);  // 각각의 사원 정보 출력
        }

        // selectOne
        System.out.println("특정 사원 출력-----------");
        Emp e = empRepository.findOne(1L);    // ID가 1인 사원 정보 조회
        System.out.println(e);  // 조회 결과 출력 (결과가 없으면 예외 발생할 수 있음)

        // deleteByEmpno
        System.out.println("특정 사원 삭제-----------");
        empRepository.delete(1L);   // ID가 1인 사원 삭제
        emps = empRepository.findAll();   // 다시 전체 조회

        for(Emp ee:emps) {
            System.out.println(ee);   // 삭제된 이후의 리스트 출력
        }

        // 1명 추가 insert
        System.out.println("사원 한명 추가-----------");
        e = empRepository.save(new Emp(4L,"손연재",400));   // 새로운 사원 저장 (id, 이름, 급여)
        emps = empRepository.findAll();   // 전체 사원 재조회

        for(Emp ee:emps) {
            System.out.println(ee);   // 추가된 사원 포함 전체 출력
        } 

        // 여러 레코드 추가하기
        System.out.println("사원 여러명 추가---------");
        List<Object[]> params = new ArrayList<Object[]>();  // 배치 인서트용 파라미터 리스트 생성
        params.add(new Object[] {5L, "kbs",50});    // ID 5, 이름 kbs, 급여 50
        params.add(new Object[] {6L, "mbc",55});  // ID 6, 이름 mbc, 급여 55

        int[] result = empRepository.batchInsert(params);   // 여러 사원 한꺼번에 저장
        System.out.println(IntStream.of(result).sum() + " 건 입력 완료.");   // 저장된 행 수 합산 출력

        emps = empRepository.findAll();   // 전체 사원 다시 조회

        for(Emp ee:emps) {
            System.out.println(ee);   // 최종 전체 사원 목록 출력
        }
    }
	
	
}
