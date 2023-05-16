package xyz.itwill.student;

//1  StudentDTO 클래스파일 만들고 > 2 StudentDAO 인터페이스파일 제작


//DTTO (Data Transfer Object)클래스 : DAO 클래스의 메소드에 필요한 정보를 매개변수로 전달하거나 
//메소드의 실행결과를 저장하여 반환하기 위한 클래스 - VO(Value Object)클래스

// => 테이블의 컬럼과 1:1로 매핑되는 필드 선언 - Getter & Setter
// => 필드의 이름은 컬럼의 이름과 동일하게 작성하는 것을 권장

/*
이름       널?       유형            
-------- -------- ------------- 
NO       NOT NULL NUMBER(4)     
NAME              VARCHAR2(50)  
PHONE             VARCHAR2(20)  
ADDRESS           VARCHAR2(100) 
BIRTHDAY          DATE     
*/

//STUDENT 테이블에 저장된 하나의 행(학생정보)을 저장하여 전달하기 위한 클래스
public class StudentDTO { //필드선언
	private int no;
	private String name;
	private String phone;
	private String adress;
	private String birthday;
	
	
	//생성자 : ctrl + space >> Constructor 선택
	public StudentDTO() {
		// TODO Auto-generated constructor stub
	}
	
	//Setter
	public StudentDTO(int no, String name, String phone, String adress, String birthday) {
		super();
		this.no = no;
		this.name = name;
		this.phone = phone;
		this.adress = adress;
		this.birthday = birthday;
	}
	
	//Getter
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	
}
