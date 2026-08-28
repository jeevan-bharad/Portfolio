package com.jj.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping({"/","/home",""})
	public String openHomepage(Model m) 
	{
		m.addAttribute("title","Home");
		return "master";
	}
	@GetMapping("/projects")
	public String openProjects(Model m) 
	{
		m.addAttribute("title","Projects");
		return "master";
	}
	@GetMapping("/resume")
	public String openREsume(Model m) 
	{
		m.addAttribute("title","Resume");
		return "master";
	}
	@GetMapping("/contact")
	public String openContacts(Model m) 
	{
		m.addAttribute("title","Contact");
		return "master";
	}
	
}
