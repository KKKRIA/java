package xyz.itwill10.exception;

import lombok.Getter;

//회원정보에 대한 변경, 삭제, 검색할 떄 사용자로부터 전달받은 아이디의 회원정보가 없는 경우
//발생될 예외를 처리하기 위한 예외 클래스
public class UserinfoNotFoundException extends Exception{
	private static final long serialVersionUID = 1L;
	
	@Getter
	private String Userid;
	
	public UserinfoNotFoundException() {
		// TODO Auto-generated constructor stub
	}
	
	public UserinfoNotFoundException(String message, String userid) {
		super(message);
		this.Userid=userid;
	}

}
