package xyz.itwill.util;

import java.util.Random;
import java.util.Scanner;

//숫자야구게임 : 0~9 범위의 정수 난수값을 3개 제공받아 키보드로 입력하여 맞추는 게임
// => 난수값와 키보드 입력값은 0~9 범위의 3개에 정수값으로 서로 다르며 0으로 시작 불가능
// => 키보드 입력값이 형식에 맞지 않은 경우 재입력 되도록 작성
// => 난수값과 입력값을 비교하여 동일한 정수값이 존재하는 경우 위치가 같으면 스트라이크
// 처리하고 위치가 다르면 볼로 처리하여 계산
// => 스트라이크가 3개면 성공 메세지 출력 후 프로그램 종료하고 아니면 스트라이크와 볼의 갯수를 출력
// => 키보드로 정수값을 입력할 수 있는 기회는 15번을 제공하며 기회를 모두 소진한 경우 난수값 출력


public class BaseballGameApp {
	public static void main(String[] args) {
		Random random=new Random();
		
		//0~9 범위의 정수값 3개를 저장하기 위한 배열 선언 - 난수값을 배열 요소에 저장
		int[] dap=new int[3];
		
		//0~9 범위의 정수값 3개를 저장하기 위한 배열 선언 - 입력값을 배열 요소에 저장
		int[] num=new int[3];
		
		
		
		//규칙에 맞는 난수값이 배열 요소에 저장되도록 처리하기 위한 반복문
		while(true) { //와일 문으로 올바른 값인지 검증
			for(int i=0;i<dap.length;i++) {
				dap[i]=random.nextInt(10); //0~9 범위의 난수값을 배열 요소에 저장
			}
			
			if(dap[0]!=0 && dap[0]!=dap[1] && dap[1]!=dap[2] && dap[2]!=dap[0]) break;
		}
		
		Scanner scanner=new Scanner(System.in);
		
		//키보으로 정수값을 입력받아 비교하기 위한 기회를 제공하기 위한 반복문
		for(int cnt=1;cnt<=15;cnt++) {
			//스트라이크와 볼의 갯수를 저장하기 위한 변수 선언
			int strike=0,ball=0;
			
			
			loop:
			while(true) {
				System.out.println(cnt+"번째입력>>");
				String input=scanner.nextLine();
				
				if(input.length()!=3) {//비정상적인 값이 입력된 경우
					System.out.println("[에러]3자리의 숫자만 입력 가능합니다.");
					continue; //continue : while로 올라가 다시 입력값을 받음 / break는 나감
				}
				
				//입력받은 문자열의 문자를 차례대로 추출하여 배열 요소에 저장
				for(int i=0;i<num.length;i++) {
					//문자코드(CharacterCode) : '0'문자는 48, '9'문자는 57
					//ex) '4'라는 문자에서 '0'문자를 빼면 52-48=4
					num[i]=input.charAt(i)-'0'; //문자값을 >> 정수값으로 만들때
					
					if(num[i]<0 || num[i]>9) {//비정상적인 값이 입력된 경우
						System.out.println("[에러] 숫자만 입력 가능합니다.");
						continue loop;
						//원래는 for 문 재실행하지만 loop라는 이름을 추가하여 위 loop while로 이동하여 반복가능
					}
				}
				
				
				if(num[0]!=0 && num[0]!=num[1] && num[1]!=num[2] && num[2]!=num[0]) break; //while문이 정상이면 빠져나가야하니까 브레이크 추가
				System.out.println("[에러]0으로 시작되거나 중복된 숫자가 존재합니다.");
			}
		}
		
		
	}
}
