package xyz.itwill04.bean;

public class FactoryMethodBean {
	private static FactoryMethodBean _bean;
	
	public FactoryMethodBean() {
		// TODO Auto-generated constructor stub
	}
	
	static{
		_bean=new FactoryMethodBean();
	}
	
	public static FactoryMethodBean getFactoryMethodBean() {
		return _bean;
	}
}
