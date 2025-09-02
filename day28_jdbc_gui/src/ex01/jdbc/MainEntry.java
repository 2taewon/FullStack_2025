package ex01.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import dbConn.util.CloseHelper;
import dbConn.util.ConnectionHelper;

public class MainEntry {
	public static void main(String[] args) {
		Connection conn = ConnectionHelper.getConnection("oracle");
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
//			conn.setAutoCommit(false);
			stmt = conn.createStatement();
			// SQL 구문, HTML Tag는 Java / Jsp / Servlet에서 문자열 취급.
//			String sql = "create table kosadb (name varchar2(20), age number)"; //String은 메모리 낭비할 수 있어, Stringbuffer나 builder를 씀.
			StringBuffer sb = new StringBuffer();
//			sb.append("if exists table drop table kosaDB");
			sb.append("create table kosadb (name varchar2(20), age number)");
			
			System.out.println(sb.toString());
			stmt.executeUpdate(sb.toString());
			
			String sql = "INSERT INTO kosadb VALUES('YUNA', 33)";
			int result = stmt.executeUpdate(sql);
			
			sql = "selete * from kosadb";
			rs = stmt.executeQuery(sql);
			
			System.out.println(result + " 개 추가 완료");
			
			while(rs.next()) {
				System.out.println("name : " + rs.getString(1) + "\t"); // INDEX가 들어가도 되고 필드명이 들어가도 됨.
				System.out.println("age : " +rs.getInt("age"));
			}
			
			sql = "drop table kosadb";
			result = stmt.executeUpdate(sql);
			System.out.println("drop table : " + "");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			CloseHelper.close(rs); CloseHelper.close(stmt); CloseHelper.close(conn);
		}
	}
}
