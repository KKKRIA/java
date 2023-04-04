package example;



public class MultiforExample {

	public static void main(String[] args) {

		//★★★★★  i=1  별=5
		//★★★★    i=2  별=4
		//★★★      i=3  별=3
		//★★        i=4  별=2
		//★          i=5  별=1


		for(int i=1; i>=5; i++) {
			for(int j=1; j<=6-i; j++ ) {
				System.out.print("★");
			}
			System.out.println("");
		}

		
		/*
		for(int i=5; i>=1; i--) {
			for(int j=1; j<=i; j++ ) {
				System.out.print("★");
			}
			System.out.println("");
		}

		*/
		



		System.out.println("===============================================================");

		// 1 2 3 4 5 >> j
		//★★★★★  i=1  흰별= 0 검별=5
		//☆★★★★  i=2  흰별= 1 검별=4
		//☆☆★★★  i=3  흰별= 2 검별=3
		//☆☆☆★★  i=4  흰별= 3 검별=2
		//☆☆☆☆★  i=5  흰별= 4 검별=1

		
		
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
		
		
		/*
		 for(int i=1;i<=5;i++) {
			for(int j=1;j<=i-1;j++) {
				System.out.print("☆");
			}
			for(int j=1;j<=6-i;j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		*/

		

	



		 

		

		System.out.println("===============================================================");

		//★                 i=1  별=1
		//★★★             i=2  별=3
		//★★★★★         i=3  별=5
		//★★★★★★★     i=4  별=7
		//★★★★★★★★★ i=5  별=9

		
		for(int i=1; i<=5; i++) { //행
			for(int j=1; j<=i*2-1; j++) { //열
				System.out.print("★");
			}
			System.out.println();
			
		}
		
		
		/*
		int count=1;

		for(int i=1; i<=5; i++) { //행
			for(int j=1; j<=count; j++) { //열
				System.out.print("★");
			}
			System.out.println();
			count +=2;
		}
		 */

		

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

		// 1 2 3 4 5 >> j
		//★☆☆☆★  i=1
		//☆★☆★☆  i=2
		//☆☆★☆☆  i=3
		//☆★☆★☆  i=4
		//★☆☆☆★  i=5


		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i==j || i+j==6 ) {
					 System.out.print("★");
				}
				else {
					 System.out.print("☆");
				 }
			}
			System.out.println("");
		}

					

		System.out.println("===============================================================");

	}

}