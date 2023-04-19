import java.util.Scanner;

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