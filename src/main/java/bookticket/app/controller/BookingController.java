package bookticket.app.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@Controller
public class BookingController {

	
	
	@RequestMapping("/hello")
	public String helloUser() {
		
		System.out.println("welcome user");
		
		return "welcome";
	}
	
	@RequestMapping("/")
	public String hello() {
		
		System.out.println("welcome userrrrr");
		
		return "welcome";
	}

}
