package xyz.itwill.util;

import java.util.Scanner;

//키보드로 생년월일을 입력받아 오늘까지 살아온 날짜(일)을 계산하여 출려하는 프로그램 작성
//ex) 생년월일 입력[ex. 2000-01-01] >> 2023-04-18
//    [결과]태어난지 <1일>이 지났습니다.
// => 형식에 맞지 않는 생년월일을 입력한 경우 에러 메세지 출력 후 프로그램 종료

//데이트랑 심플ㄹ데이트 이용

public class DayCaulculateApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("생년월일 입력 >> ");
		String operation=scanner.nextLine().replace(" ", "");
		
		
		scanner.close();
        
		
		
		
		
		
	}
}
