package xyz.itwill.lang;
import java.util.Scanner;


//키보드로 사칙 연산식을 입력받아 연산결과를 계산하여 출력하는 프로그램 작성
//ex) 연산식 입력 >> 20 + 10
//    [결과]30
// => 입력 연산식에서 사용 가능한 연산자는 사칙 연산자(*,/,+,-)만 허용
// => 형식에 맞지 않는 연산식이 입력된 경우 에러 메세지 출력 후 프로그램 종료
// => 입력 연산식에 공백 입력이 가능하도록 처리





public class ConsoleCalculateApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("연산식 입력 >> ");
        
        
        String input = scanner.nextLine().replaceAll("\\s+", ""); // 입력받은 문자열에서 공백 제거

        String[] tokens = input.split("[+\\-*/]"); // 연산자를 기준으로 문자열 분리

        
        
        /*
        if (tokens.length != 2) { // 분리된 문자열 개수가 2가 아니면 에러 메세지 출력 후 프로그램 종료
            System.out.println("잘못된 형식의 연산식입니다.");
            System.exit(1);
        }
         */
        
        
        String operator = input.replaceAll("[^+\\-*/]", ""); // 연산자 추출
        int num1 = Integer.parseInt(tokens[0]); // 첫 번째 숫자
        int num2 = Integer.parseInt(tokens[1]); // 두 번째 숫자
        int result = 0; // 결과값

        switch (operator) { // 연산자에 따라 계산 수행
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) { // 0으로 나누는 경우 에러 메세지 출력 후 프로그램 종료
                    System.out.println("0으로 나눌 수 없습니다.");
                    System.exit(1);
                }
                result = num1 / num2;
                break;
            default: // 허용되지 않은 연산자인 경우 에러 메세지 출력 후 프로그램 종료
                System.out.println("허용되지 않은 연산자입니다.");
                System.exit(1);
        }

        System.out.println("계산 결과: " + result); // 결과 출력
    }
}