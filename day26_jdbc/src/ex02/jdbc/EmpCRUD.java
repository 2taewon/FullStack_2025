//package ex02.jdbc;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.util.Scanner;
//
//public class EmpCRUD {
//	
//	Scanner sc = new Scanner(System.in);
//	Class.forName("oracle.jdbc.OracleDriver");
//	Connection conn = DriverManager.getConnection(
//			"jdbc:oracle:thin:@127.0.0.1:1521:xe","tw","oracle");
//	
////	selectAll()
//	ResultSet rs = stmt.executeQuery("SELECT * FROM emp");
//	System.out.println("사원번호\t사원이름\t직업\t매니저번호\t고용일자\t급여\t커미션\t부서번호");
//	while(rs.next()) {
//		int empno = rs.getInt(1);
//		String ename = rs.getString("ename");
//		String job = rs.getString("job");
//		int mgr = rs.getInt(4);
//		String hiredate = rs.getString("hiredate");
//		int sal = rs.getInt(6);
//		String comm = rs.getString("comm");
//		int deptno = rs.getInt(8);
//		
//		System.out.println(empno+"\t"+ename+"\t"+job+"\t"+mgr+"\t"+hiredate+"\t"+sal+"\t"+comm+"\t"+deptno+"\t");
//	}
//	
////	selectByNo()
//	ResultSet rs = stmt.executeQuery("SELECT * FROM GIFT");
//	while(rs.next()) {
//		int gno = rs.getInt(1);
//		String gname = rs.getString("gname");
//		int g_s = rs.getInt(3);
//		int g_e = rs.getInt("g_end");
//		
//		System.out.println(gno + "\t" + gname + "\t"+g_s+"\t"+g_e);
//	}
////	insert
//	System.out.println("GIFT TABLE DATA INPUT : 상품번호/상품명/최저가/최고가 = ");
//	String sql = "INSERT INTO GIFT VALUES(?,?,?,?)";
//	
//	PreparedStatement ps = conn.prepareStatement(sql);
//	ps.setInt(1, sc.nextInt());
//	ps.setString(2, sc.next());
//	ps.setInt(3, sc.nextInt());
//	ps.setInt(4, sc.nextInt());
////	update
//	
////	delete
//	
////	exit
//	
//	
//}
