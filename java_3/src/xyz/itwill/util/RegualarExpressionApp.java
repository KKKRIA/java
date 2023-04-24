package xyz.itwill.util;

import java.util.Scanner;
import java.util.regex.Pattern;

//정규표현식(RegualarExpression) : 메타문자(Meta Character), 회피문자(Escape character)등을
//사용하여 일정한 규칙의 문자열을 표현하는 방법 - 사용자 입력값에 대한 검증

/* 
 <메타문자>
 
 ^문자 : 문자(열)로 시작됨을 의미 (꺽쇠)
 문자$ : 문자(열)로 종료됨을 의미
 . : 임의의 문자 하나를 의미(\ 역슬래시 문자는 표현 불가능/ 사용시 역슬래시 2번 사용)
 [문자1문자2문자3] : 나열된 문자 중 하나를 의미
 [^문자1문자2문자3] : 나열된 문자를 제외한 문자 중 하나를 의미
 [문자1-문자2] : [문자1]에서 [문자2] 범위의 문자 중 하나를 의미
 문자열1|문자열2|문자열3 : 나열된 문자열 중 하나를 의미
 문자열+ : 문자열이 1번이상 반복됨을 의미
 문자열* : 문자열이 0번이상 반복됨을 의미
 문자열? : 문자열이 0번 또는 1번 존재함을 의미
문자열{숫자} : 문자열이 [숫자] 만큼 반복됨을 의미
문자열{숫자1,숫자2} : 문자열이 [숫자1]부터 [숫자2]범위만큼 반복됨을 의미
(?!)문자열 : 문자열에서 대소문자를 구분하지 않음을 의미
(?=문자열) : 문자열이 반드시 포함됨을 의미  
(!=문자열) : 문자열이 반드시 포함되지 않음을 의미
 
 */

 

/* 
 <회피문자>
 
\s : 공백이 있는 문자열을 의미
\S : 공백이 없는 문자열을 의미
\w : 영문자, 숫자, 특수문자(_)의 문자로만 구성된 문자열 의미
\W : 영문자, 숫자, 특수문자(_)의 문자를 제외한 나머지 구성된 문자열 의미
\d : 숫자의 형태의 문자로만 구성된 문자열을 의미
\D : 숫자의 형태의 문자를 제외한 문자로 구성된 문자열을 의미
\메타문자 : 메타문자를 일반문자로 표현됨을 의미 - ex) \. : 문자 .
 
 */


//키보드로 사용자에게 값을 입력받아 형식에 맞는 값인지를 비교하여 출력하는 프로그램
// => 형식에 맞지 않는 값이 입력될 경우 에러 메세지 출력 후 프로그램 종료

public class RegualarExpressionApp {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		/*
		//사용자에게 아이디를 입력받아 형식에 맞는 값인지를 비교
		//아이디 형식(패턴) : 영문자로 시작되며 영문자, 숫자, 특수문자(_)의 조합으로 6~20범위의 문자들로 구성된 문자열  
		System.out.println("아이디 입력 >> ");
		String id =scanner.nextLine();
		
		if(id==null || id.equals("")) {//사용자 입력값이 없을 경우
			System.out.println("[에러]아이디를 반드시 입력해주세요");
			System.exit(0);
		}
		
		
		//아이디 패턴을 정규표현식으로 표현하여 저장
		String idReg="^[a-zA-Z][a-zA-Z0-9_ ]{5,19}$"; //이미 앞에 하나의 문자가 나와서 /5부터 시작-19까지
		
		//Pattern 클래스 : 정규 표현식을 사용하기 위한 기능의 메소드를 제공하는 클래스
		//Pattern.matches(String regEx, CharSsequence input) : 정규표현식과 입력값을 비교하여 
		//정규표현식의 패턴과 입력값의 패턴이 다르면 [false]를 반환하고 같으면 [true]를 반환하는 메소드
		if(!Pattern.matches(idReg, id)) {
			System.out.println("[에러]아이디를 형식에 맞게 입력해주세요.");
			System.exit(0);
		}
		System.out.println("[메세지]형식에 맞는 아이디를 입력하였습니다");
		*/
		
		
		
		
		
		
		/*
		//사용자에게 비밀번호를 입력받아 형식에 맞는 값인지를 비교
		//비밀번호 형식(패턴) : 영문자, 숫자, 특수문자가 반드시 1번이상 포함되며 8~30 범위의 문자들 구성된 문자열  
		
		System.out.print("비밀번호 입력 >>");
		String password=scanner.nextLine();
		
		if(password==null || password.equals("")){
			System.out.println("[에러]비밀번호를 반드시 입력해주세요");
			System.exit(0);
		}
		
		String passwordReg="^()(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[~!@#$%^&*_-]).{8,30}&"; //^는 시작이라 조건 중간에 오면 안됨/ -는 ~부터라 조건 중간에 오면 안됨 조건끝으로
		if(!Pattern.matches(passwordReg, password)) {
			System.out.println("[에러]비밀번호를 형식에 맞게 입력해주세요.");
			System.exit(0);
		}
		System.out.println("[메세지]형식에 맞는 비밀번호를 입력하였습니다");
		
		*/

		
		
		
		
		//사용자에게 이메일를 입력받아 형식에 맞는 값인지를 비교
		//이메일 형식(패턴) : [아이디@도메인] 형식의 문자열  
		
		System.out.print("이메일 입력 >>");
		String email=scanner.nextLine();
		
		if(email==null || email.equals("")){
			System.out.println("[에러]이메일를 반드시 입력해주세요");
			System.exit(0);
		}
		
		String emailReg="^([a-zA_Z0-9_-]+@[a-zA_Z0-9_-]+(\\.[a-zA_Z0-9_-]+)+)*$"; // .사용시 역슬래시 2번 자바에서 회피문자
		
		if(!Pattern.matches(emailReg, email)) {
			System.out.println("[에러]이메일을 형식에 맞게 입력해주세요.");
			System.exit(0);
		}
		System.out.println("[메세지]형식에 맞는 이메일을 입력하였습니다");
		
		scanner.close();
		
		
		
		/*
		한글만 입력
		"^[가-힣]{2,20}$"
		*/
		
		
		
		
		
	}
}
