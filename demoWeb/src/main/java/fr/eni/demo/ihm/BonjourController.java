package fr.eni.demo.ihm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import fr.eni.demo.bo.Personne;

@Controller
@RequestMapping("/dire")
public class BonjourController {

	@RequestMapping
	public String bonjour(@RequestParam(required = false, defaultValue = " le monde") String prenom) {
		System.out.println("Bonjour " + prenom);

		return "bonjour";
	}

	@RequestMapping(method = RequestMethod.GET, path = "/hello")
	public String hello() {
		System.out.println("Dans BonjourController - hello");
		return "hello";
	}

	@GetMapping("/hello/{id}/{prenom}")
	public String hello2(@PathVariable int id, @PathVariable String prenom) {
		System.out.println("Hello " + id + " " + prenom);
		return "hello";
	}



	
	@RequestMapping(method = { RequestMethod.GET, RequestMethod.POST }, path = "/buenos-dias")
	public String buenosDias(@RequestParam String prenom, @RequestParam int age, 
			Model modele) {
		System.out.println("buenosDias " + prenom);
		Personne pers = new Personne( age, prenom);
		modele.addAttribute("personne", pers);
		
		System.out.println("Dans BonjourController - buenosDias");
		return "redirect:/index.html";
	}

}
