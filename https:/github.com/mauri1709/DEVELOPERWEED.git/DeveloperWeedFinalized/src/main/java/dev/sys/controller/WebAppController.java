package dev.sys.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Servlet implementation class WebAppController
 */
@Controller("/WebAppController")
public class WebAppController {
	
		@RequestMapping("/")
		public String getHome(){
			return "home";
		}
	
		@RequestMapping("/login")
		public String getLogin(){
			return "login";
		}
		
		@RequestMapping("/index")
		public String getIndex(){
			return "index";
		}
		@RequestMapping("/BL")
		public String getBL() {
			return "BL";
			
		}
		
		@RequestMapping("/403")
		public String get403(){
			return "403";
		}

		@RequestMapping("/Administrador_users")
		public String getAdministrador_users(){
			return "Administrador_users";
		}
		
		@RequestMapping("/insert")
		public String getInsert(){
			return "insert";
		}
		

}
