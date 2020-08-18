package com.kingshuk.spring.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.kingshuk.spring.model.Customer;

@Controller
public class CustomerController {
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, editor);
	}
	
	@GetMapping("/customerForm")
	public String showForm(Model model) {
		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		return "customerForm";
	}

	@PostMapping("/processCustomerForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			return "customerForm";
		}
		customer.setFirstName(customer.getFirstName().toUpperCase());
		customer.setLastName(customer.getLastName().toUpperCase());
		return "processCustomerForm";
	}
}
