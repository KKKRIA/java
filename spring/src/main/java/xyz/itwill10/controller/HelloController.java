package xyz.itwill10.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

//@Controller : 요청 처리 클래스(Controller 클래스)를 Spring Bean으로 등록하기 위한 어노테이션
// => 클래스의 이름을 Spring Bean의 식별자(beanName)으로 자동 설정 - 첫문자는 소문자로 변환
// => value 속성을 사용하여 Spring Bean의 식별자(beanName) 변경 가능

//@Controller 어노테이션을 사용하면 Controller 인터페이스를 상속받지 않아도 요청 처리 클래스로 작성 가능
// => @RequestMapping 어노테이션을 사용하여 메소드를 요청 처리 메소드 처리되도록 작성
// => @RequestMapping 어노테이션을 사용하여 요청 처리 메소드를 여러개 선언 가능 
@Controller
@Slf4j
public class HelloController {
	
	//요청 처리 메소드는 Front Controller에게 반드시 뷰이름(ViewName) 제공
	// => Front Controller는 제공받은 뷰이름을 이용하여 ViewResolver 객체로 응답 처리되도록 변환
	//1.요청 처리 메소드의 반환형을 [void]로 설정한 경우 Front Controller에게 메소드의 이름을 뷰이름으로 제공 
	
	//@RequestMapping : 클라이언트의 요청을 처리하기 위한 메소드로 선언하기 위한 어노테이션
	// => 기본적으로 클라이언트의 모든 요청방식(Method - GET, POST, PUT, PATCH, DELETE 등)에 
	//의해 호출되는 요청 처리 메소드를 작성할 경우 사용하는 어노테이션
	// => 클라이언트의 요청방식을 구분하여 요청 처리 메소드를 호출하고자 할 경우 @GetMapping
	//, @PostMapping, @PutMapping, @PatchMapping, @DeleteMapping 등의 어노테이션을 사용 가능
	//value 속성 : 클라이언트의 요청정보(URL 주소)를 속성값으로 설정
	// => 클라이언트의 요청 URL 주소로 Front Controller에 의해 요청 처리 메소드 자동 호출
	// => 다른 속성이 없는 경우 속성값만 설정 가능
	// => 다른 요청 처리 메소드의 value 속성값과 중복될 경우 WAS 프로그램 시작시 에러 발생
	@RequestMapping(value = "/hello")
	public void hello() {//요청 처리 메소드
		//요청 처리 명령 작성 - Service 클래스의 메소드 호출
		log.info("[/hello] 페이지 요청 : HelloController 클래스의 hello() 메소드 호출");
	}
	
}











