package xyz.itwill10.exception;

import lombok.Getter;

//로그인에 대한 인증이 실패한 경우
public class LoginAuthFailException extends Exception{
	private static final long serialVersionUID = 1L;
	
	@Getter
	private String Userid;
	
	public LoginAuthFailException() {
		// TODO Auto-generated constructor stub
	}
	
	public LoginAuthFailException(String message, String userid) {
		super(message);
		this.Userid=userid;
	}
	
}
