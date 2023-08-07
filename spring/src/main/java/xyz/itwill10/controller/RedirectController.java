package xyz.itwill10.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {
	@RequestMapping("/forward_move")
	private String forward(Model model) {
		
		model.addAttribute("name", "홍길동");
		
		return "display_forward"; 
	}
}
