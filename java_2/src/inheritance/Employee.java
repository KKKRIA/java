package inheritance;

//사원정보(사원번호, 사원이름)를 저장하기 위한 클래스
// => 모든 사원 관련 클래스 상속받아야 되는 부모클래스

public class Employee {
	private int empNO;
	private String empName;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empNO, String empName) {
		super();
		this.empNO = empNO;
		this.empName = empName;
	}

	public int getEmpNO() {
		return empNO;
	}

	public void setEmpNO(int empNO) {
		this.empNO = empNO;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	

	
}
