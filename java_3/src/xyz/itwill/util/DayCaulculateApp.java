package xyz.itwill.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//키보드로 생년월일을 입력받아 오늘까지 살아온 날짜(일)을 계산하여 출려하는 프로그램 작성
//ex) 생년월일 입력[ex. 2000-01-01] >> 2023-04-18
//    [결과]태어난지 <1일>이 지났습니다.
// => 형식에 맞지 않는 생년월일을 입력한 경우 에러 메세지 출력 후 프로그램 종료

//데이트랑 심플ㄹ데이트 이용


public class DayCaulculateApp {
   public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
	   
	   SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
	   Date birthday=null;  //try안에가 아닌 블럭 바깥에 생성해야 트라이문 끝나도 사용가능 / 초기화시키기
	   
	   System.out.print("생년월일 입력 [ex. 2000-01-01] >> ");
	   
	   try {
		   //키보드로 입력받은 문자열을 Date 객체로 변환하여 저장
		   // => 키보드로 입력방은 문자열이 SimpleDateFormat 객체에 저장된 패턴정보와 일치하지 않을경우 ParseException 발생 - 일반 예외이므로 반드시 예외처리
		   birthday=dateFormat.parse(scanner.nextLine());
	   } catch(ParseException e){
	         System.out.println("[에러]생년월일을 형식에 맞게 입력해주세요");
	         System.exit(0);
	   }finally {
		scanner.close();
	}
      
	   
	   //살아온 날짜를 계산하여 출력
	   long day= (System.currentTimeMillis()-birthday.getTime())/(1000*86400);
	   System.out.println("[결과]태어난지 <"+day+"일> 지났습니다."); //86400초
	   
      
      
      
      
      
      /*
      Scanner scanner = new Scanner(System.in);
      System.out.print("생년월일 입력 [ex. 2000-01-01] >> ");
      String birthday=scanner.nextLine();
      
     
      try {
         if()
    	  
    	  
      }catch(Exception e){
         System.out.println("잘못된 형식의 생년월일을 입력하였습니다");
         System.exit(0);
      }
      SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
      
      
      long today= System.currentTimeMillis();
      long wantTime=birthday.getTime();
      System.out.println("[결과]태어난지"+(today-wantTime)/(1000*86400)+"일 지났습니다."); //86400초
   
      */
      
      
      
   }
}