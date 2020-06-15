package cl.icap.cursofullstack.developerweed;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebAppController{
	@RequestMapping("/")
	public	String getHome() {
		return "index";
	}
	@RequestMapping("/indexx")
	public String getIndex() {
		return "indexx";
		
	}

	@RequestMapping("/login")
	public String getLogin(){
		return "login";
	}
/*	

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
	*/
}

