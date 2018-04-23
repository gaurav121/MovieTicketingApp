/**
 * 
 */
package bookticket.app.controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author gyadav
 *
 */

@Controller
public class LoginController {


	
	@GetMapping("login")
	public String tryLogin(Model model) {
		
		ModelMap map = new ModelMap();
		model.addAttribute("testing2", "Logi aagye");
		map.addAttribute("testing", "yoyo hunny singh");
		System.out.println("Going to login page");
		return "user-login";
	}
	
	
	//admin test
	
	@RequestMapping("/admin")
	public String testAdmin() {
		
		System.out.println("in testadmin");
		
		return "admintest";
	}
}
