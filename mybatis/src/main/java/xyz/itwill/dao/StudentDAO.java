package xyz.itwill.dao;

import java.util.List;

import xyz.itwill.dto.Student;

public class StudentDAO {
	private static StudentDAO _dao;
	
	public StudentDAO() {
		// TODO Auto-generated constructor stub
	}
	
	static {
		_dao=new StudentDAO();
	}
	
	public static StudentDAO getDAO() {
		return _dao;
	}
	
	public List<Student> selectStudentList() {
		
	}
}
