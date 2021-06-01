package com.mvcpractice.springdemo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormCOntroller {
@RequestMapping("/show-form")
public String showForm() {
	return "showForm";
}

@RequestMapping("/submit-form")
public String submitForm(HttpServletRequest request, Model model) {
	String name = request.getParameter("studentName");
	String result= name.toUpperCase();
	model.addAttribute("message",result);
	return "home";
}

@RequestMapping("/submit-form-anno")
public String submitForm( @RequestParam("studentName") String theName, Model model) {
	String name = theName;
	String result= name.toUpperCase();
	model.addAttribute("message",result);
	return "home";
}
}
