package bookticket.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller


public class AdminController {

	
	static {
		System.out.println("heee");
	}
	
	@RequestMapping("/admin")
	public String testAdmin() {
		
		System.out.println("in testadmin");
		
		return "admintest";
	}

	

}
