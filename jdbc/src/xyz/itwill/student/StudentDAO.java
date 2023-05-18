package xyz.itwill.student;
//★★중요★★ 자주사용됨
//DTO가 있어야 DAO제작가능
//전달하거나 반환받을 수 있는 DTO
//DAO 각자해보기

//테이블 > DTO만들고 > 



import java.util.List;

//DAO 클래스가 상속받기 위한 인터페이스
// => 추상메소드를 이용하여 인터페이스를 상속받은 모든 자식클래스(DAO클래스)가 동일한 메소드가 선언되도록 메소드의 작성 규칙 제공
// => 프로그램에서 사용하는 DAO 클래스가 변경되어도 프로그램에 영향을 최소화하기위해 인터페이스 선언

public interface StudentDAO {
	//학생정보를 전달받아 STUDENT 테이블에 삽입하고 삽입행의 갯수를 반환하는 메소드
	
	//int insertStudent(int no, String name, String phone, String address, String birthday);
	// => StudentDTO 파일을 만들었으므로 StudentDTO (학생정보)로 연결
	int insertStudent(StudentDTO student);
	
	//학생정보를 전달받아 STUDENT 테이블에 저장된 학생정보를 변경하고 변경행의 갯수를 반환하는 메소드
	int updateStudent(StudentDTO student);
	
	//학번을 전달받아 STUDENT 테이블에 저장된 학생정보를 삭제하고 삭제행의 갯수를 반환하는 메소드
	int deleteStudent(int no);
	
	//학번을 전달받아 STUDENT 테이블에 저장된 해당 학번의 학생정보를 검색하여 반환하는 메소드
	// => 단일행은 값 또는 DTO 객체 반환
	StudentDTO selectStudent(int no);
	
	//이름을 전달받아 STUDENT 테이블에 저장된 해당 이름의 학생정보를 검색하여 반환하는 메소드
	// => 다중행은 List 객체 반환
	List<StudentDTO> selectNameStudentList(String name);
		
	//STUDENT 테이블에 저장된 모든 학생정보를 검색하여 반환하는 메소드
	List<StudentDTO> selectAllStudentList();
}