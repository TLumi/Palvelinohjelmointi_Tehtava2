package fi.PalvelinohjelmointiTunti1.Tehtava2.web;

import javax.swing.Spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody

public class HelloController {
	
	@RequestMapping("/hello")
	public String vastaus(@RequestParam(name="location") String paikka, 
	@RequestParam(name="name") String nimi) {
		return "Welcome to the " + paikka + " " +nimi +"!"; 
		
	}
	
			
}	



