package ex01.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainEntry {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1.Driver load.. exception
//		Class.forName("oracle.jdbc.driver.OracleDriver");
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("driver load success!!");
	
		// 2. Connection & Open
			//driver: @IP:portNumber:SID (or 전역데이터베이스명)
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid = "tw";
		String pwd = "oracle";
		
		Connection conn = DriverManager.getConnection(url, uid, pwd);
		System.out.println("connection success!");
		
		// 3. 사용 (DML 명령어)
		// 4. 닫기 (자원 반환)
		
	}
	//SQL, Tag는 자바에서 문자열 취급 함.
}
