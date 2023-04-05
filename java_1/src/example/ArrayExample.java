package example;



public class ArrayExample {

	public static void main(String[] args) {

		//사람들의 나이를 저장한 배열 생성하여 참조변수에 저장		

		int[] age={27,16,22,36,57,60,43,23,14,29,44,52,59,51,39,33,11};
		//int[] age=new int[] {27,16,22,36,57,60,43,23,14,29,44,52,59,51,39,33,11};

		//배열에 저장된 모든 사람들의 나이 평균을 계산하여 출력하세요. (1.다 더하고 2.나누기)

	
		int sum=0; //총합을 저장하기 위한 변수
		for(int i=0; i<age.length; i++) {  //i는 age.length보다 작은동안
			sum+= age[i]; 
		}
		
		System.out.println("모든사람들의 나이 평균 = " + sum/(double)age.length);

		

		/*
		 sum =+ age[0];
		 sum =+ age[1];
		 sum =+ age[2];
		 sum =+ age[3];
		 .
		 .
		 .
		 sum =+ age[16];
		 */


		System.out.println("===============================================================");

		//배열에 저장된 사람들의 나이를 연령별로 구분하여 인원수를 계산하여 출력하세요.
		//ex) 10대 = 3명
		//    20대 = 4명
		//    ...
		//    60대 = 1명


		

		//int[] num=new int[6]; //정수값을 6개 저장할수 있는 요소가 있는 배열 

		

		

		

		

		

		

		

		

		System.out.println("===============================================================");

	}

	

}