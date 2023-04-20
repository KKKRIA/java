package xyz.itwill.util;


import java.util.Random;
import java.util.UUID;

//새로운 비밀번호를 생성하여 제공하는 프로그램 작성
public class NewPasswordApp {
	//새로운 비밀번호를 생성하여 반환하는 메소드 - Random클래스 이용
	public static String newPasswordOne() {
		Random random=new Random();
		
		//비밀번호로 사용될 문자들이 저장된 문자열 생성
		String str ="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789~!@#$%^&*";
		
		StringBuffer password=new StringBuffer();
		for(int i=1;i<=10;i++) {
			password.append(str.charAt(random.nextInt(str.length()))); 
			//문자열에 문자갯수 반환44개 length/ 하나를 뽑아서 문자열 추가/난수로 제공받은거 하나씩 하나씩 뽑아서 10개를 문자열로 반환해주세요
			//범위안의 정수값 제공받아 스트링 버퍼객체에 10번 추가
		}
		
		return password.toString(); 
		//"toString" 메서드는 객체가 가지고 있는 정보나 값들을 문자열로 만들어 리턴하는 메소드
	}
	
	
	
	
	 
	
	public static String newPasswordTwo() {
		//UUID 클래스 : 범용적으로 사용되는 식별자(고유값)를 생성하기 위한 기능을 메소드로 제공하는 클래스
		//UUID.randomUUID() : 식별자를 생성하여 식별자가 저장된 UUID객체를 반환하는 메소드
		// => UUID객체에 저장된 식별자는 숫자와 영문자(소문자),4개 - 문자를 조합하여 36개의 문자가 구성된 문자열로 생성
		//UUID.toString() : UUID 객체에 저장된 식별자를 문자열(String객체)로 변환하여 반환하는
		return UUID.randomUUID().toString().replace("-", "").substring(0,10).toUpperCase();
		//문자열 반환, 문자열에서 -제거, 문자열에서 앞부분 10개만 반환, 대문자로 바꿔서 반환해주세요
	}
	
	

	
	
	public static void main(String[] args) {
		System.out.println("새로운 비밀번호-1 ="+newPasswordOne());
		System.out.println("새로운 비밀번호-2 ="+newPasswordTwo());
	}
}
