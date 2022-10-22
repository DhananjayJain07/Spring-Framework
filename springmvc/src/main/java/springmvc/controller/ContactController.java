package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header", "Learn code with gaurav");
		m.addAttribute("Desc","Home for Programmer");
		System.out.println("adding common data to tabel");
	}
	
	@RequestMapping("/contact")
	public String showForm() {
		
		return "contact";
	}

	@RequestMapping(path="/processform", method= RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {

		System.out.println(user);
		if(user.getUsername().isBlank()) {
			return "redirect:/contact";
		}
		int createUser = this.userService.CreateUser(user);
		model.addAttribute("msg", "User created with id "+createUser);
		return "success";
	}
}



/*
@RequestMapping(path="/processform", method= RequestMethod.POST)
public String handleForm(@RequestParam(name= "email", required =false) String userEmail, 
		@RequestParam("username") String userName,
		@RequestParam("password") String userPassword, Model model) {
//	System.out.println("User email: "+userEmail);
//	System.out.println("User name: "+userName);
//	System.out.println("User Password: "+userPassword);
	User user = new User();
	user.setEmail(userEmail);
	user.setUsername(userName);
	user.setPassword(userPassword);
	System.out.println(user);
//	model.addAttribute("name", userName);
//	model.addAttribute("email",userEmail);
//	model.addAttribute("password",userPassword);
	
	model.addAttribute("user",user);
	return "success";
}*/