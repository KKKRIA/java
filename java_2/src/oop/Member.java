package oop;


//회원정보(아이디, 이름, 이메일)를 저장하기 위한 클래스
// => VO(Value object) 클래스 : 특정 대상의 값을 저장할 목적의 객체를 생성하기 위한 클래스

public class Member {
	//필드 선언 : 객체를 생성하면 객체의 필드에는 기본값 (숫자형 : 0, 논리형: false, 참조형 : null)이 초기값으로 자동 저장
	private String id;
	private String name;
	private String email;
	
	
	//생성자 선언 : 객체를 생성하기 위한 특별한 형태의 메소드
	// => 생성자를 선언하지 않으면 매개변수가 없는 기본 생성자 제공
	
	
	//메소드 선언    
	//단축키로 getter setter 만들어주기 ([Alt]+[Shift]+[s] >> 팝업메뉴 >> [R] >> 필드 선택 >> Generate)
	public String getId() {
		return id;
	}
	
	
	public void setId(String id) {
		this.id = id;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name; 
	}
	
	
	public String getEmail() {
		return email;
	}
	
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
	
	
	
}
