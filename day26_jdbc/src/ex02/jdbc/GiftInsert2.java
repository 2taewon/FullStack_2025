package ex02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class GiftInsert2 {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@127.0.0.1:1521:xe","tw","oracle");
			
		// 3. 사용(DML 명령어 - Insert) - PreparedStatement
		String sql = "INSERT INTO GIFT VALUES(?,?,?,?)";
		
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, 20);
		ps.setString(2, "과자종합세트");
		ps.setInt(3, 3330);
		ps.setInt(4, 9999);
		
		int result = ps.executeUpdate(); // 반환값이 없는 경우 - insert,update,delete
		
		System.out.println(result + " 개 데이터 추가");
		
		// 4. 닫기 
		ps.close(); conn.close();
	}
}
