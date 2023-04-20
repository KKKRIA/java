package xyz.itwill.util;

import java.util.ArrayList;
import java.util.List;

//저장매체에 학생정보를 관리 (삽입, 삭제, 변경, 검색 - CRUD)하기 위한 기능을 제공하는 클래스
// => BO(Business Object) 클래스 : 데이터 처리 클래스 - Manager 클래스

public class StudentManager {
	//다수의 학생정보를 저장하기 위한 필드 - List 객체 => 저장매체 
	private List<Student> studentsList =new ArrayList<Student>();
	
	//학번을 전달받아 저장매체에 저장된 학생정보의 학번과 비교하여 같은 학번의 학생정보가 저장된 고유값(Index)을 반환하는 메소드 
	// => 같은 학번의 학생정보가 없는 경우 -1 반환
	private int getStudentIndex(int num) {
		int index=-1;
		
		for(int i=0;i<studentsList.size();i++) {
			//저장매체에 저장된 학생정보의 학번과 매개변수로 전달받아 학번이 같은 경우
			if(studentsList.get(i).getNum()==num) {
				index=i;
				break;
			}
		}
		return index;
	}
	
	
	
	//학생정보를 전달받아 저장매체에 삽입하고 ★삽입 결과를 논리값(boolean) 으로 반환하는 메소드
	// => false 반환 : 삽입 실패, true 반환 : 삽입 성공
	// => 매개변수로 전달받은 학생정보의 학번이 저장매체에 저장된 기존 학생정보의 학번과 중복될 경우 삽입실패 처리
	public boolean insertStudent(Student student) {
		/*
		for(Student stu: studentsList) {
			//기존의 학생과 동일한 학번의 학생정보인 경우
			if(stu.getNum() == student.getNum()) {
				return false;
			}
		}
		*/
		
		
		//저장매체에 같은 학번의 학생정보가 있는 경우 (중복되는지 검사)
		if(getStudentIndex(student.getNum())!=-1) {
			return false;
		}
		
		studentsList.add(student);
		return true;
	}
	
	
	
	
	
	//학번을 전달받아 저장매체에 저장된 학생정보를 ★삭제하고 삭제결과를 논리값으로 반환하는 메소드
	public boolean deleteStudent(int num) {
		int index = getStudentIndex(num);
		
		if(index == -1) { //저장매체에 해당 학번의 학생정보가 없는 경우
			return false;
		}
		studentsList.remove(index);
		return true;
	}
	
	
	
	//학생정보를 전달받아 저장매체에 저장된 학생정보를 ★변경하고 변경결과를 논리값으로 반환하는 메소드
	public boolean updateStudent(Student student) {
		int index = getStudentIndex(student.getNum());
		if(index == -1) { //저장매체에 해당 학번의 학생정보가 없는 경우
			return false;
		}
		studentsList.set(index, student);
		return true;
	}
	
	
	
	//학번을 전달받아 저장매체에 저장된 학생정보를 ★검색하여 반환하는 메소드
	public Student selectStudent(int num) {
		int index = getStudentIndex(num);
		if(index ==-1) {
			return null;
		}
		return studentsList.get(index);
	}
	
	
	
	//저장매체에 저장된 모든 학생정보를 검색하여 반환하는 메소드
	public List<Student> selectStudentList() {
		return studentsList;
	}
	
	
	
}

