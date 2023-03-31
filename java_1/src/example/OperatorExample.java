package example;



public class OperatorExample {

	public static void main(String[] args) {
		//245678초를 일시분초 형식으로 변환하여 출력하세요.
		int tot=245678;
		int day= tot/(60*60*24);
		int hour= (tot-day*60*60*24)/(60*60);	
		int minute= (tot-day*60*60*24-hour*3600)/60;
		int second= tot%60;

		 
		System.out.println("245678초는 " + day + "일 " + hour + "시 " + minute + "분 " + second +"초");

	

		System.out.println("===============================================");

	
		//한대의 가격이 1억 5천원만인 비행기를 20대 구매할 경우 지불해야될 금액을 계산하여 출력하세요. 
		//단, 15대 이상 구매할 경우 1대당 25%의 할인율을 적용하여 계산하세요.


		System.out.println("===============================================");

	}

}