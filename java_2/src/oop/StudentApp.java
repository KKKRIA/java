package oop;

public class StudentApp {
	public static void main(String[] args) {
		/*Student student1 = new Student(1000, "홍길동", 90, 90);
		Student student2 = new Student(2000, "임꺽정", 94, 98);
		Student student3 = new Student(3000, "전우치", 91, 80);
		Student student4 = new Student(4000, "일지매", 76, 82);
		Student student5 = new Student(5000, "장길산", 84, 86);
		
		/* 
		student1.calcTot();
		student2.calcTot();
		student3.calcTot();
		student4.calcTot();
		student5.calcTot();
		
		
		student1.display();
		student2.display();
		student3.display();
		student4.display();
		student5.display();
		*/
		
		
		
		System.out.println("===========================================================");
		
		/*
		student1.setKor(100);
		student1.calcTot();
		student1.display();
		*/
		
		
		//객체를 저장할 수 있는 참조요소가 5개인 배열생성
		// => 배열의 참조요소에는 기본적으로 [null]을 초기값으로 저장
		Student[] students=new Student[5];
		
		//객체를 생성하여 배열을 참조용소에 객체의 메모리 주소 저장 - 객체배열
		students[0]= new Student(1000, "홍길동", 90, 90);
		students[1]= new Student(2000, "임꺽정", 94, 98);
		students[2]= new Student(3000, "전우치", 91, 80);
		students[3]= new Student(4000, "일지매", 76, 82);
		students[4]= new Student(5000, "장길산", 84, 86);
		
		//반복문을 사용하여 배열의 참조요소에 저장된 객체의 메소드를 일괄적으로 호출하여 처리
		//참조변수(배열의 참조요소)에 [null]이 저장된 상태에서 참조변수로 객체의 메소드를 호출할 경우 NullPointerException 발생
		for(int i=0; i<students.length;i++ ) {
			//참조변수에 null이 저장되어 있지 않은 경우 메소드 호출
			//=> NullPointerException를 방지할 수 있는 선택문
			if(students [i]!=null) {
				students[i].display();
			}
			
		}
		
		
		System.out.println("===========================================================");
		
		//	Student[] students = 
	
		
		//for(Students student : student){
		
				
		//모든 학생들의 점수들의 합계를 계산하여 출력
		System.out.println("총합계=" );
		
	}
}
