package basic;

public class MultiForApp {
	public static void main(String[] args) {
		
		
		
		int cnt=0;//이동방법의 갯수를 저장하기 위한 변수
		
		for(int i=1;i<=3;i++) {//A나라 >> 섬 - 반복문
			for(int j=1;j<=4;j++) {//섬 >> B나라 - 반복문
				cnt++;
			}
		}
		 
		
		System.out.println("이동방법의 갯수 = "+cnt);
		
		
		 System.out.println("============================================");
		 
		 
		 //★★★★★★★
		 //★★★★★★★
		 //★★★★★★★
		 //★★★★★★★
		
		 for(int i=1; i<=4; i++) {//행 (Row)을 처리하기 위한 반복문 (세로 줄)
			 for(int j=1; j<=7; j++) {//열 (column)을 처리하기 위한 반복문 (가로 갯수)
				 System.out.print("★");
			 }
			 System.out.println();
		 }
		 
		 
		 for (int i=1;i<=5;i++) {//행 세로
			 for(int j=1; j<=3;j++) {//열 가로
				 System.out.print("&");
			 }
			 System.out.println();
		 }
		 
		 
		 
		 
		 System.out.println("============================================");
		 
		 //*=	*=	*=	*=	*=	*=	*=	
		 //*=	*=	*=	*=	*=	*=	*=	
		 //*=	*=	*=	*=	*=	*=	*=	
		 //*=	*=	*=	*=	*=	*=	*=	
		 //*=	*=	*=	*=	*=	*=	*=	
		 //*=	*=	*=	*=	*=	*=	*=	
		 //*=	*=	*=	*=	*=	*=	*=	
		 //*=	*=	*=	*=	*=	*=	*=	
		 //*=	*=	*=	*=	*=	*=	*=
		 
		 
		 for(int i=1; i<=9; i++) {
			 for(int j=1; j<8; j++) {
				 System.out.print("*=\t");
			 }
			 System.out.println();
		 }
		
		 
		 System.out.println("============================================");
		 
		 //2*=	3*=	4*=	5*=	6*=	7*=	8*=	
		 //2*=	3*=	4*=	5*=	6*=	7*=	8*=	
		 //2*=	3*=	4*=	5*=	6*=	7*=	8*=	
		 //2*=	3*=	4*=	5*=	6*=	7*=	8*=	
		 //2*=	3*=	4*=	5*=	6*=	7*=	8*=	
		 //2*=	3*=	4*=	5*=	6*=	7*=	8*=	
		 //2*=	3*=	4*=	5*=	6*=	7*=	8*=	
		 //2*=	3*=	4*=	5*=	6*=	7*=	8*=	
		 //2*=	3*=	4*=	5*=	6*=	7*=	8*=	
		 
		 for(int i=1; i<=9; i++) {
			 for(int j=2; j<9; j++) {
				 System.out.print(j+"*=\t");
			 }
			 System.out.println();
		 }
		 

		 
		 
		 
		 System.out.println("============================================");
		 
		 //2*1=	3*1=	4*1=	5*1=	6*1=	7*1=	8*1=	
		 //2*2=	3*2=	4*2=	5*2=	6*2=	7*2=	8*2=	
		 //2*3=	3*3=	4*3=	5*3=	6*3=	7*3=	8*3=	
		 //2*4=	3*4=	4*4=	5*4=	6*4=	7*4=	8*4=	
		 //2*5=	3*5=	4*5=	5*5=	6*5=	7*5=	8*5=	
		 //2*6=	3*6=	4*6=	5*6=	6*6=	7*6=	8*6=	
		 //2*7=	3*7=	4*7=	5*7=	6*7=	7*7=	8*7=	
		 //2*8=	3*8=	4*8=	5*8=	6*8=	7*8=	8*8=	
		 //2*9=	3*9=	4*9=	5*9=	6*9=	7*9=	8*9=	
		 
		 
		 for(int i=1; i<=9; i++) {//행
			 for(int j=2; j<9; j++) {//열
				 System.out.print(j+ "*" + i +"=\t");
			 }
			 System.out.println();
		 }
		 
		 
		 System.out.println("============================================");
		 
		 //2*1=2	3*1=3	4*1=4	5*1=5	6*1=6	7*1=7	8*1=8	
		 //2*2=4	3*2=6	4*2=8	5*2=10	6*2=12	7*2=14	8*2=16	
		 //2*3=6	3*3=9	4*3=12	5*3=15	6*3=18	7*3=21	8*3=24	
		 //2*4=8	3*4=12	4*4=16	5*4=20	6*4=24	7*4=28	8*4=32	
		 //2*5=10	3*5=15	4*5=20	5*5=25	6*5=30	7*5=35	8*5=40	
		 //2*6=12	3*6=18	4*6=24	5*6=30	6*6=36	7*6=42	8*6=48	
		 //2*7=14	3*7=21	4*7=28	5*7=35	6*7=42	7*7=49	8*7=56	
		 //2*8=16	3*8=24	4*8=32	5*8=40	6*8=48	7*8=56	8*8=64	
		 //2*9=18	3*9=27	4*9=36	5*9=45	6*9=54	7*9=63	8*9=72	
		 
		 for(int i=1; i<=9; i++) {
			 for(int j=2; j<9; j++) {
				 System.out.print(j+ "*" + i +"="+(i*j)+"\t");
			 }
			 System.out.println();
		 }
		 

		 
		 
		 
		 
		 System.out.println("============================================");
		 
		//★          i=1  별=1
		//★★        i=2  별=2 
		//★★★      i=3  별=3
		//★★★★    i=4  별=4
		//★★★★★  i=5  별=5
		 
		
		 for(int i=1; i<=5; i++) {//행 
			 for(int j=1; j<=i; j++) {//열 
				 System.out.print("★");
			 }
			 System.out.println();
		 }
		 
		 
		 System.out.println("============================================");
		
		//★★★★★  i=5  별=5
		//★★★★    i=4  별=4
		//★★★      i=3  별=3
		//★★        i=2  별=2
		//★          i=1  별=1
		 
		 for(int i=5; i>=1; i--) {
			 for(int j=1; j<=i; j++) {
				 System.out.print("★");
			 }
			 System.out.println();
		 }
		 
		 System.out.println("============================================");
		 
		 
		 
		//☆☆☆☆★  i=1  흰별=4  검은별=1
		//☆☆☆★★  i=2  흰별=3  검은별=2 
		//☆☆★★★  i=3  흰별=2  검은별=3
		//☆★★★★  i=4  흰별=1  검은별=4
		//★★★★★  i=5  흰별=0  검은별=5
		 
		 
		 for(int i=1; i<=5; i++) {//행 
			 for(int j=1; j<=(5-i); j++) {//열 
				 System.out.print("☆");
			 }
			 for(int j=1; j<=i; j++) {//열 
				 System.out.print("★");
			 }
			 System.out.println();
		 }
	
		 System.out.println("============================================");
		 
		 
		// 1 2 3 4 5 >> j
		//☆☆☆☆★  i=1
		//☆☆☆★★  i=2
		//☆☆★★★  i=3
		//☆★★★★  i=4
		//★★★★★  i=5
		 
		 
		 for(int i=1; i<=5; i++) {//행 
			 for(int j=1; j<=5; j++) {//열 
				 if(i+j<6) {
					 System.out.print("☆");
				 }
				 else {
					 System.out.print("★");
				 }
			 }
			 System.out.println();
		 }
		 
		 System.out.println("============================================");
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
}