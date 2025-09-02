package dbConn.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * ConnectionHelper 클래스의 문제.
 * 매번 드라이버 로드
 * Connection 생성
 * 
 * 어차피 하나의 프로세스에서 하나만 만들어서 재사용 하면 됨.
 * 해결방법은 >> 공유자원(싱글톤)
 * 
 */
public class ConnectionSingletonHelper {
	// 하나의 프로세스에서 공통으로 사용할 수 있는 공용자원(static)
	private static Connection conn;
	private ConnectionSingletonHelper() { } // 생성자 조차 private
	
	public static Connection getConnection(String dsn) {
		Connection conn = null;
		try {
			if(dsn.equals("mysql")) {
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection(
						"jdbc:oracle:thin:@127.0.0.1:1521:xe","tw","oracle");
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
	
	public static void close() throws SQLException {
		if(conn != null) {
			if(!conn.isClosed()) {
				conn.close();
			}
		}
	}
}
