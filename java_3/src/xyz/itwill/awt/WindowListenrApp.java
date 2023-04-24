package xyz.itwill.awt;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


//프레임에서는 WindowEvent 발생
// => WindowListenr 인터페이스를 상속받은 자식클래스를 사용하여 이벤트 처리
public class WindowListenrApp extends Frame{
	private static final long serialVersionUID = 1L;
	
	public WindowListenrApp(String title) {
		super(title);
		
		//프레임에서 WindowEvent가 발생될 경우 이벤트 처리할 객체 등록
		addWindowListener(new WindowEventHandleOne());
		
		setBounds(800,200,300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new WindowListenrApp("윈도우이벤트");
	}
	
	//Listener 인터페이스를 상속받은 자식클래스 (이벤트 처리 클래스)는 무조건 인터페이스의 모든 추상메소드를 오버라이드 선언
	// => 불필요한 추상메소드도 오버라이드 선언
	public class WindowEventHandleOne implements WindowListener{

		@Override
		public void windowOpened(WindowEvent e) {
			//System.out.println("windowOpen 메소드 호출");
		}

		@Override
		public void windowClosing(WindowEvent e) {
			//System.out.println("windowClosing 메소드 호출");
			System.exit(0); //닫기 명령
		}

		@Override
		public void windowClosed(WindowEvent e) {
			//System.out.println("windowClosed 메소드 호출");
			
		}

		@Override
		public void windowIconified(WindowEvent e) { //최소화해서 아이콘화 됐을때
			//System.out.println("windowIconified 메소드 호출");
			
		}

		@Override
		public void windowDeiconified(WindowEvent e) {//다시 프레임이 됐을때
			//System.out.println("windowDeiconified 메소드 호출");
			
		}

		@Override
		public void windowActivated(WindowEvent e) { //활성화됐을때
			//System.out.println("windowActivated 메소드 호출");
			
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			//System.out.println("windowDeactivated 메소드 호출");
			
		}
		
	}
}
