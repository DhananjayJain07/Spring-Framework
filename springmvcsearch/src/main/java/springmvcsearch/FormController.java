package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FormController {

	@RequestMapping("/complex")
	public String showForm() {
		
		return "complex";
	}
	
	@RequestMapping(path="/handle", method = RequestMethod.POST)
	public String formHandler(@ModelAttribute("student") Student student, BindingResult result) {
		if(result.hasErrors()) {
			return "complex";
		}
		System.out.println(student);
		System.err.println(student.getAddress());
		return "success";
	}
	
	
}
