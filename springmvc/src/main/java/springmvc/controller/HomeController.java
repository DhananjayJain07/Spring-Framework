package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model) {
		
		System.out.println("This is home url");
		model.addAttribute("name","Sarang Kahadake");
		model.addAttribute("id",1421);
		List<String> friends = new ArrayList<String>();
		friends.add("Ram");
		friends.add("Prasad");
		model.addAttribute("f", friends);
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("This is about controller");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		
		System.out.println("This is help controller");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", "Pankaj");
		modelAndView.addObject("rollno", 12365);
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time", now);
		List<Integer> list = new ArrayList<Integer>();
		list.add(25);
		list.add(55);
		list.add(65);
		list.add(655);
		modelAndView.addObject("marks",list);
		modelAndView.setViewName("help");
		return modelAndView;
	}

}
