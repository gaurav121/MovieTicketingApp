/**
 * 
 */
package bookticket.app.controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author gyadav
 *
 */

@Controller
public class LoginController {

	static{
		String password = "123456";
		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String hashedPassword = passwordEncoder.encode(password);
		
		
		System.out.println("Password"+password);
		System.out.println("Password"+hashedPassword);

	}
	
	
	@GetMapping("login")
	public String tryLogin() {
		System.out.println("Going to login page");
		return "user-login";
	}
}
