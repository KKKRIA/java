package xyz.itwill.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//STUDENT 테이블에 저장된 학생정보 중 학번이 [3000]인 학생정보를 삭제하는 JDBC 프로그램 작성
public class DeleteStudentApp {
	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="scott";
			String password="tiger";
			con=DriverManager.getConnection(url, user, password);
			
			stmt=con.createStatement(); //전달하기 위한 기능 제공
			
			String sql="delete from student where no=3000";
			int rows=stmt.executeUpdate(sql);//delete 명령을 전달하여 실행
			
			if(rows > 0) {
				System.out.println("[메세지]"+rows+"명의 학생정보를 삭제 하였습니다.");
			} else {
				System.out.println("[메세지]삭제할 학번의 학생정보를 찾을 수 없습니다.");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("[에러]OracleDriver 클래스를 찾을 수 없습니다.");
		} catch (SQLException e) {
			System.out.println("[에러]JDBC 관련 오류 = "+e.getMessage());
		} finally {
			try {
				if(stmt != null) stmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {}
		}
	}
}