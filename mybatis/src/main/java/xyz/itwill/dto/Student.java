package xyz.itwill.dto;

/*
 이름       널?       유형            
-------- -------- ------------- 
NO       NOT NULL NUMBER(4)     
NAME              VARCHAR2(50)  
PHONE             VARCHAR2(20)  
ADDRESS           VARCHAR2(100) 
BIRTHDAY          DATE          
 */


public class Student {
	private int no;
	private String name;
	private String phone;
	private String address;
	private String birthdat;
		
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	

	public Student(int no, String name, String phone, String address, String birthdat) {
		super();
		this.no = no;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.birthdat = birthdat;
	}


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


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getBirthdat() {
		return birthdat;
	}


	public void setBirthdat(String birthdat) {
		this.birthdat = birthdat;
	}
	
	
	
}

