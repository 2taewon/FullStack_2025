package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

import dbConn.util.CloseHelper;
import dbConn.util.ConnectionHelper;
import model.GiftVO;

public class GiftController {
	//연결, 삽입, 삭제, 수정, 검색,....
	static Scanner sc = new Scanner(System.in);
	static Statement stmt = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;
	static Connection conn = null;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	// connect 
	public static void connect() {
		try {
			conn = ConnectionHelper.getConnection("mysql");
			stmt = conn.createStatement();
			conn.setAutoCommit(false); // 자동커밋 끄기
		}catch(Exception e) { e.printStackTrace();}
	}
	
	
	// close
	public static void close() {
		try {
			
			CloseHelper.close(rs);
			CloseHelper.close(stmt);
			CloseHelper.close(pstmt);
			CloseHelper.close(conn);
			
		}catch(Exception e) { e.printStackTrace(); }
	}
	
	// menu
	public static void menu() throws SQLException, IOException {
		GiftVO vo = new GiftVO();
				
		while( true ) {
			System.out.println();
			ConnectionHelper.menu();
			
			switch(sc.nextInt()) {
			case 0: System.out.println("Commit 하시겠습니까? (Y/N)");
					System.out.println("안하시려면 Rollback 됩니다.");
					if(sc.next().equalsIgnoreCase("Y")) {
						conn.commit(); // 예외 발생
						selectAll(vo.getClassName());
					}else {
						conn.rollback();
						selectAll(vo.getClassName());
					}
					break;
			case 1: selectAll(vo.getClassName()); break;
			case 2: insert(); selectAll(vo.getClassName()); break;
			case 3: update(vo.getClassName()); break;
			case 4: delete(vo.getClassName()); break;
			case 5: selectByGno(vo.getClassName()); break;
			case 6: close();
				System.out.println("프로그램 종료합니다.");
				System.exit(0);
				break;
			case 7: conn.commit();
					System.out.println("성공적으로 완료 되었습니다.");
					break;
			}
		}
	}

	


	// select all 
	private static void selectAll(String className) throws SQLException {
		rs = stmt.executeQuery("SELECT * FROM " + className);
		
		ResultSetMetaData rsmd = rs.getMetaData(); //해당 테이블에 대한 정보 
		int count = rsmd.getColumnCount(); 
		
		while(rs.next()) {
			for(int i = 1; i <= count; i++) { // 각 타입별로 출력
				
				switch(rsmd.getColumnType(i)) {
				case Types.NUMERIC:
				case Types.INTEGER:
					System.out.println(rsmd.getColumnName(i) +" : " + rs.getInt(i) + " ");
					break;
				case Types.FLOAT:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getFloat(i)+ " ");
				case Types.DOUBLE:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getDouble(i)+ " ");
				case Types.CHAR:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getString(i)+ " ");
				case Types.DATE:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getDate(i)+ " ");
							
				default:
					System.out.println(rsmd.getColumnName(i)+" : " + rs.getString(i)+ " ");
						break;
				}
				
			} // end for 
		} // end while
	}
	
	// insert
	private static void insert() throws SQLException {
	pstmt = conn.prepareStatement("INSERT INTO GIFT VALUES(?, ?, ?, ?)");
	
	System.out.print("GNO : \n"); pstmt.setInt(1, sc.nextInt());
	System.out.print("GNAME : \n"); pstmt.setString(2, sc.next());
	System.out.print("G_START : \n");pstmt.setInt(3, sc.nextInt());
	System.out.print("G_END : \n");pstmt.setInt(4, sc.nextInt());
	
	int result = pstmt.executeUpdate();   
	System.out.println(result + "개 데이터가 추가 되었습니다.");
	}
	
	// delete 
	private static void delete(String className) throws SQLException, IOException {
		selectAll(className);
		String gno = br.readLine();
		
		try {
			
			pstmt = conn.prepareStatement("delete " + className + " where gno = ? ");
			pstmt.setString(1, gno);
			
			pstmt.executeUpdate();
			
			System.out.println(gno + " 번 상품이 제거되었습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// update
	private static void update(String className) throws SQLException, IOException {
	String gno;
		try {
			pstmt = conn.prepareStatement("update " + className + " set gname = ?, g_start = ?, g_end = ? where gno = ?");
			selectAll(className);
			System.out.println("수정하실 번호를 입력해주세요."); 
			gno = br.readLine();
			pstmt.setString(4, gno);
			System.out.println("변경하실 항목을 번호로 입력해주세요.");
			System.out.println("1. gname, 2. g_start, 3. g_end");
			
			switch(Integer.parseInt(br.readLine())) {
			case 1: System.out.print("GNAME : \n");pstmt.setString(1, br.readLine()); break;
			case 2: System.out.print("G_START : \n");pstmt.setString(2, br.readLine()); break;
			case 3:	System.out.print("G_END : \n");pstmt.setInt(3, Integer.parseInt(br.readLine())); break;
			default : System.out.println("다시 시도해주세요.");
			}
			
			pstmt.executeUpdate();
			System.out.println(gno + " 번 상품이 수정되었습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	// rollback 
	public static void rollback() throws SQLException {
		conn.rollback();
		System.out.println("rollback success!");
	}
	// commit 
	
	// select ~ where 
	private static void selectByGno(String className) throws SQLException {
	
		pstmt = conn.prepareStatement("SELECT * FROM " + className);
		System.out.println("보고싶은 gno 번호를 입력하세요. ");
		int N = sc.nextInt();
		System.out.println("상품번호\t상품명\t최저가\t최고가");
		while(rs.next()) {
			int gno = rs.getInt(1);
			String gname = rs.getString("gname");
			int g_s = rs.getInt(3);
			int g_e = rs.getInt(4);
			if(gno == N) {
				System.out.println("GNO : " + gno);
				System.out.println("GNAME : " + gname);
				System.out.println("G_START : " + g_s);
				System.out.println("G_END : " + g_e);
			}
		}
	
	}
}
