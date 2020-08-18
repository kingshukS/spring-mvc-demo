package com.kingshuk.spring.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.kingshuk.spring.model.Student;

@Controller
@PropertySource("classpath:/resources/messages.properties")
public class StudentController {
	
//	@Value("${key}")
//	String value;
	
	@Autowired
	@Qualifier("countryOptions")
	private Map<String, String> countryOptions;
	
	@Autowired
	@Qualifier("languageOptions")
	private Map<String, String> languageOptions;
	
	@Autowired
	@Qualifier("osOptions")
	private Map<String, String> osOptions;

	@GetMapping("/studentForm")
	public String showForm(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		model.addAttribute("countryOptions", countryOptions); 
		model.addAttribute("languageOptions", languageOptions);
		model.addAttribute("osOptions", osOptions); 
		return "studentForm";
	}
	
	@PostMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student student,Model model) {
		student.setFirstName(student.getFirstName().toUpperCase());
		student.setLastName(student.getLastName().toUpperCase());
		student.setCountry(student.getCountry().toUpperCase());
		model.addAttribute("student", student);
		return "processForm";
	}
}
