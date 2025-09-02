package dbConn.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

/*
 * DB 연결 정보 반복적인 코딩 해결
 * 다른 클래스에서 아래 코드를 구현하지 않도록 설계함.
 * 
 *
	Class.forName("oracle.jdbc.OracleDriver");
	Connection conn = DriverManager.getConnection(
			"jdbc:oracle:thin:@127.0.0.1:1521:xe","tw","oracle");
 	ConnectionHelper.getConnection("mysql")or("oracle"),...
 	dsn ==> data source name 
 *
 */
public class ConnectionHelper {
	//method(접근자 : public, static)
	public static Connection getConnection(String dsn) {
		Connection conn = null;
		try {
			if(dsn.equals("mysql")) {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection(
						"jdbc:mysql://localhost/bankdb?serverTimezone=UTC", 
						"root","1234");
				System.out.println("connection success!");
			
			}else if(dsn.equals("oracle")) {
				Class.forName("oracle.jdbc.OracleDriver");
				conn = DriverManager.getConnection(
						"jdbc:oracle:thin:@127.0.0.1:1521:xe","tw","oracle");
				System.out.println("oracle connection success!");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			return conn;
		}
	}
	
	public static void menu() {
		System.out.println("\n====== JDBC Query ======");
		System.out.println("\t 0. rollback ");
		System.out.println("\t 1. 전체보기 ");
		System.out.println("\t 2. 레코드 삽입(추가) ");
		System.out.println("\t 3. 레코드 수정 ");
		System.out.println("\t 4. 레코드 삭제 ");
		System.out.println("\t 5. 조건에 의한 검색(ex > gno) ");
		System.out.println("\t 6. 프로그램 종료");
		System.out.println("\t 7. commit ");
		System.out.println("\t >> 원하는 메뉴 선택");
	}
}
