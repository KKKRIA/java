package xyz.itwill.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

//STYDENT 테이블에 저장된 학생정보 중 학번이 [3000]인 학생정보를 삭제하는 JDBC프로그램 작성
public class DeleteStudentApp {
	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url="jdbc.oracle.thin:@localhost:1521:xe";
			String user="scott";
			String password="tiger";
			con=DriverManager.getConnection(url, user, password);
			
			stmt=con.createStatement(); //전달하기 위한 기능 제공
			
			String sql="delete student from where no=3000";
			
			int rows=stmt.executeUpdate(sql);//SELECT 명령을 전달하여 실행
			
			System.out.println("[메세지]"+rows +"명의 학생정보를 변경하였습니다.");
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
}
