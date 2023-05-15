package xyz.itwill.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetMetaDataApp {
	public static void main(String[] args) throws SQLException {
		Connection con=ConnectionFactory.getConnection();
		Statement stmt=con.createStatement();
		
		String sql="select * from student order by no";
		ResultSet rs=stmt.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println("학번 = "+rs.getInt("no")+", 이름 = "+rs.getString("name"));
		}
		System.out.println("=====================================================================");
		//ResultSet.getMetaData() : 검색행(ResultSet 객체)에 대한 부가적인 정보가 저장된 ResultSetMetaData 객체를 반환하는 메소드
		ResultSetMetaData rsmd=rs.getMetaData();
		
		//
		
		
		
		
		System.out.println("=====================================================================");
		ConnectionFactory.close(con, stmt, rs);
	}
}
