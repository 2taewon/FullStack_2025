package ex02.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class GiftSelect {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		Class.forName("oracle.jdbc.OracleDriver");
		Connection conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe","tw","oracle");
		Statement stmt = conn.createStatement();
		System.out.println("보고싶은 사원번호를 입력하세요.");
		int N = sc.nextInt();
		ResultSet rs = stmt.executeQuery("SELECT * FROM emp");
		System.out.println("사원번호\t사원이름\t직업\t매니저번호\t고용일자\t급여\t커미션\t부서번호");
		while(rs.next()) {
			int empno = rs.getInt(1);
			String ename = rs.getString("ename");
			String job = rs.getString("job");
			int mgr = rs.getInt(4);
			String hiredate = rs.getString("hiredate");
			int sal = rs.getInt(6);
			String comm = rs.getString("comm");
			int deptno = rs.getInt(8);
			
			if(empno == N) {
				System.out.println(empno+"\t"+ename+"\t"+job+"\t"+mgr+"\t"+hiredate+"\t"+sal+"\t"+comm+"\t"+deptno+"\t");
			}
		}
		// 4. 닫기 (자원 반환)
		rs.close(); stmt.close(); conn.close();
	}
}

//System.out.println("상품번호\t상품명\t최저가\t최고가");
//while(rs.next()) {
//	
//	int gno = rs.getInt(1);
//	String gname = rs.getString("gname");
//	int g_s = rs.getInt(3);
//	int g_e = rs.getInt("g_end");
//	if(gno == N) {
//		System.out.println(gno + "\t" + gname + "\t"+g_s+"\t"+g_e);
//	}
//}