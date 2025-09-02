package ex02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class GiftInsert {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@127.0.0.1:1521:xe","tw","oracle");
			
		// 3. 사용(DML 명령어 - Insert) - Statement / Prepare 
		Statement stmt = conn.createStatement();
//		insert into gift values(11, '사탕세트', 100, 9000);
//		1)고정값 레코드 입력 
//		String sql = "insert into gift values(12,'사탕세트2', 1002, 9002)";
		
//		2)레코드 값을 입력 받아서 처리 - Scanner, IO, main args
		String sql = "insert into gift values("+args[0]+",'"+args[1]+"',"+args[2]+","+args[3]+")";

		int result = stmt.executeUpdate(sql);
		System.out.println(result + " 개 데이터 추가 성공");
		
		// 4. 닫기 
		stmt.close(); conn.close();
	}
}
