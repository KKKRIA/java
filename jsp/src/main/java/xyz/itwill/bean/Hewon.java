package xyz.itwill.bean;

//JavaBean : 클래스로 생성된 모든 Java 객체
// => 웹프로그램에서는 명령 실행에 필요한 값을 저장하기 위한 클래스로 생성된 객체

//회원정보를 저장하기 위한 클래스 - JavaBean 클래스(웹에서 쓰면) >> VO 클래스(자바에서 쓰면), DTO 클래스(DAO에서 쓰면)
public class Hewon {
	private String name;
	private String phone;
	private String adress;

	public Hewon() {
		// TODO Auto-generated constructor stub
	}

	public Hewon(String name, String phone, String adress) {
		super();
		this.name = name;
		this.phone = phone;
		this.adress = adress;
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
	
	
}
