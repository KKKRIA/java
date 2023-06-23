package xyz.itwill.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

//JDBC 기능을 제공하는 DAO 클래스가 상속받아 사용하기 위해 작성된 부모클래스 - 추상클래스
// => WAS 프로그램에 의해 관리되는 DataSource 객체를 제공받아 필드에 저장 - 정적영역에 작성하여 한번만 실행
// => DataSource 객체로부터 Connection 객체를 제공받아 반환하는 메소드
// => 매개변수로 전달받은 JDBC 관련 객체를 제거하는 메소드
public abstract class JdbcDAO {//상속만을 목적으로 작성된 클래스
	private static DataSource dataSource;
	
	static {
		try {
			dataSource=(DataSource)new InitialContext().lookup("java:comp/env/jdbc/oracle");
		} catch (NamingException e) {
			e.printStackTrace();
		}	
	}
		
	public Connection getConnection() throws SQLException {
		return dataSource.getConnection();
	}
	
	
	/*
	 close(Connection con): 
	 이 메서드는 주어진 Connection 객체 con을 닫습니다. 
	 이는 데이터베이스와의 연결을 종료하고 관련된 리소스를 
	 해제하는 역할을 합니다.
	 */
	public void close(Connection con) {
		try {
			if(con!=null) con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	
	
	/*
	 close(Connection con, PreparedStatement pstmt): 
	 이 메서드는 주어진 Connection 객체 con과 PreparedStatement 객체 pstmt를 닫습니다. 
	 데이터베이스 연결을 종료하고 관련된 리소스를 해제하는 동시에, 미리 컴파일된 
	 SQL 문장을 나타내는 PreparedStatement 객체도 해제합니다.
	 */
	public void close(Connection con, PreparedStatement pstmt) {
		try {
			if(pstmt!=null) pstmt.close();
			if(con!=null) con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	
	/*
	 close(Connection con, PreparedStatement pstmt, ResultSet rs): 
	 이 메서드는 주어진 Connection 객체 con, PreparedStatement 객체 pstmt, 
	 그리고 ResultSet 객체 rs를 닫습니다. 데이터베이스 연결을 종료하고 관련된 리소스를 
	 해제하는 동시에, 결과 집합을 처리하기 위해 사용된 ResultSet 객체도 해제합니다.
	 */
	
	public void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		try {
			if(rs!=null) rs.close();
			if(pstmt!=null) pstmt.close();
			if(con!=null) con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
}





/****
 각각의 close() 메서드는 다른 종류의 리소스를 닫기 위해 오버로딩된 형태로 제공됩니다. 
 이렇게 함으로써 개발자는 필요한 리소스만을 선택적으로 해제할 수 있습니다. 
 예를 들어, ResultSet을 사용하지 않는 경우에는 첫 번째 또는 두 번째 close() 메서드를 
 사용하여 ResultSet 객체를 해제하지 않을 수 있습니다.

데이터베이스 연결 및 리소스 관리는 메모리 누수와 같은 문제를 방지하고 데이터베이스 리소스를 
효율적으로 사용하기 위해 중요합니다. 위의 코드는 일반적인 관행을 따르며, 데이터베이스 연결을 
닫고 리소스를 해제하기 위해 Connection con을 세 가지 다른 메서드에 전달합니다.
 ****/







/*
 위의 코드는 `xyz.itwill.dao` 패키지 내에 있는 `JdbcDAO`라는 추상 클래스를 
 정의하고 있습니다. 이 클래스는 JDBC(Java Database Connectivity)를 사용하여 
 데이터베이스와 상호 작용하는 기능을 제공합니다.

주요 내용을 살펴보면 다음과 같습니다:

1. `JdbcDAO` 클래스는 `java.sql` 및 `javax.sql` 패키지에서 가져온 클래스들을 사용합니다.

2. `JdbcDAO` 클래스는 `DataSource` 객체를 사용하여 데이터베이스 연결을 관리합니다. 
`dataSource` 변수는 `javax.naming.InitialContext` 클래스를 사용하여 
`java:comp/env/jdbc/oracle` 위치에서 찾은 `DataSource` 객체로 초기화됩니다.

3. `getConnection()` 메서드는 `SQLException`을 발생시킬 수 있는 데이터베이스 연결을 
반환합니다.
4. `close()` 메서드는 `SQLException`을 발생시킬 수 있는 데이터베이스 연결, 
준비된 문장(PreparedStatement), 결과 집합(ResultSet) 등을 닫습니다. 
이 메서드들은 각각 매개변수로 받은 객체가 `null`이 아닐 경우에만 해당 객체를 닫습니다.

5. `JdbcDAO` 클래스는 추상 클래스이므로 이 클래스를 직접 인스턴스화할 수는 없습니다. 
대신 이 클래스를 상속하여 구체적인 DAO(Data Access Object) 클래스를 만들어야 합니다.

이 코드는 데이터베이스와의 연결 관리와 리소스 해제를 처리하는 일반적인 패턴을 보여줍니다. 
이를 통해 데이터베이스 연동 코드를 보다 간결하고 안전하게 작성할 수 있습니다.
*/