package example;



public class MultiforExample {

	public static void main(String[] args) {

		//★★★★★
		//★★★★
		//★★★
		//★★
		//★



		for(int i=5; i>=1; i--) {
			for(int j=1; j<=i; j++ ) {
				System.out.print("★");
			}
			System.out.println("");
		}

		

		

		

		



		System.out.println("===============================================================");

		//★★★★★
		//☆★★★★
		//☆☆★★★
		//☆☆☆★★
		//☆☆☆☆★


		for(int i=1; i<=5; i++) {

			for(int j=1; j<=5; j++) {
				if(j<i) {
					 System.out.print("☆");
				}
				else {
					 System.out.print("★");
				 }
			}
			System.out.println("");
		}

		

		

	



		 

		

		System.out.println("===============================================================");

		//★
		//★★★
		//★★★★★
		//★★★★★★★
		//★★★★★★★★★

		

		int count=1;

		for(int i=1; i<=5; i++) { //행
			for(int j=1; j<=count; j++) { //열
				System.out.print("★");
			}
			System.out.println();
			count +=2;
		}
	
		
		

/*
		for(int i=1; i<=9; i+=2) { //행 
			for(int j=1; j<=9; j++) {//열 
				if(j<=i){
				System.out.print("★");
				}
			}
			System.out.println();
		}
		
*/
	

		



		System.out.println("===============================================================");

		//★☆☆☆★
		//☆★☆★☆
		//☆☆★☆☆
		//☆★☆★☆
		//★☆☆☆★


		



					

		System.out.println("===============================================================");

	}

}