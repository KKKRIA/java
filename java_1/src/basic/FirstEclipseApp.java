package basic;

/*
 범위 주석 : 범위의 문장을 설명문으로 설정하여 사용
 */

//이클립스 단축키
//[ctrl]+[space] >> 단어(키워드 또는 식별자)와 문장(템플릿 코드)을 자동 완성하는 기능을 제공
//[ctrl]+[alt]+[↑] 또는 [ctrl]+[alt]+[↓] : 행을 복사하여 붙여넣기 하는 기능을 제공
//[alt]+[↑] 또는 [alt]+[↓] : 행을 이동하는 기능을 제공
//[ctrl]+s : 저장-자동컴파일
//[ctrl]+F11 : 실행

//주석문 : 프로그램에 설명을 제공하기 위한 문장
// => 프로그램 실행과 아무런 관계없는 문장
// => 행주석 또는 범위주석

public class FirstEclipseApp {
	public static void main(String[] args) {
		//행주석 : 하나의 행을 설명문으로 설정하여 사용
		System.out.print("안녕하세요."); // 출력 메소드 호출
		System.out.println("이클립스를 이용한 첫번째 프로그램입니다.");/*출력 메소드 호출*/
		System.out.println("재미있게 프로그램을 만들어 봐요.");
	}
}
