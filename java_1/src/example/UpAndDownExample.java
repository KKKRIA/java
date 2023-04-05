package example;

import java.util.Scanner;


//컴퓨터로부터 제공받은 정수 난수값을 키보드로 입력하여 맞추는 프로그램을 작성하세요.
// => 1~100 범위의 정수 난수값을 제공받도록 작성 0

// => 난수값을 맞출 수 있는 기회는 10번만 제공되도록 작성

// => 키보드 입력값이 1~100 범위가 아닌 경우 메세지 출력 후 재입력 0

// => 난수값과 입력값이 같은 경우 입력 횟수 출력 후 프로그램 종료

// => 난수값과 입력값이 다른 경우 "큰값 입력" 또는 "작은값 입력" 형식의 메세지 출력
// => 난수값을 10번 안에 맞추지 못한 경우 난수값이 출력되도록 작성



public class UpAndDownExample {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		// => 1~100 범위의 정수값을 난수로 제공받아 변수에 저장
		int su=(int)(Math.random()*100)+1;

		
		
		//정답 상태를 저장하기 위한 변수
		// => false : 정답을 맞추지 못한 상태, true : 정답을 맞춘 상태
		boolean result=false;
		
		
		
		//사용자에게 난수값 하나를 키보드로 입력받아 저장 
		// => 입력값이 1~100 범위가 아닌 경우 메세지 출력 후 재입력

		
		//난수값을 입력받아 맞추는 기회를 10번 제공하기 위한 반복문
		
		for(int cnt=1; cnt<=10; cnt++) {
			
			//사용자로부터 정수값을 입력받아 변수에 저장
			// => 비정상적인 값이 입력된 경우 에러 메세지를 출력하고 재입력되도록 반복문 사용
			
			int user;
			
			while(true) {
				System.out.println(cnt+"번째 정수값 입력 [1~100] >>");
				user=scanner.nextInt();
				if(user>=1 && user<=100) break; //정상적인 값이 입력된 경우 반복문 종료
				System.out.println("[에러] 1~100의 범위가 아닙니다." );
			}
		
			
			//난수값과 입력값을 비교하여 입력
			if(su==user) {
				System.out.println("정답입니다" + cnt+"번만에 맞췄습니다");
				result=true;
				break; //for(cnt=1;cnt<=10;cnt++) 종료
			}else if(su>user) {
				System.out.println("[결과]"+su +"보다 큰값을 입력해주세요");
			}else {
				System.out.println("[결과]"+su +"보다 작은값을 입력해주세요");
			}
		}

	
		if(!result) {
				System.out.println("10번안에 못맞춤, 답 = "+su);
			}

		scanner.close();

		

		

		

	

		

		

		



	}

}

	