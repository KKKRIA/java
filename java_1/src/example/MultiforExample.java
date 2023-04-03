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

		
		
		for(int i=5; i>=1; i--) {
			for(int j=1; j<=i; j++ ) {
				System.out.print("★");
			}
			for(int j=1; j<=(5-i); j++ ) {
				System.out.print("☆");
			}
			System.out.println("");
		}
		
		
		
		/*
		for(int i=1; i<=5; i++) {//행 
			 for(int j=1; j<=(5-i); j++) {//열 
				 System.out.print("☆");
			 }
			 for(int j=1; j<=i; j++) {//열 
				 System.out.print("★");
			 }
			 System.out.println();
		 }
		*/
	

		 
		
		System.out.println("===============================================================");
		//★
		//★★★
		//★★★★★
		//★★★★★★★
		//★★★★★★★★★

		
		for(int i=1; i<=5; i++) {
			/*for(int j=1; j<=(int)(i%3==0); j++) */{
				System.out.print("★");
			}
			System.out.println();
		}
		
		
	
		

		System.out.println("===============================================================");
		//★☆☆☆★
		//☆★☆★☆
		//☆☆★☆☆
		//☆★☆★☆
		//★☆☆☆★

		
		System.out.println("===============================================================");
	}
}
