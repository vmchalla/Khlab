package com.khdreamlife.khlab.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LabController {
	
	@Value("${spring.application.name}")
    String appName;
	
	@GetMapping("/")
	public String patientDetails(Model model) {
		model.addAttribute("appName", appName);
		return "patient-info";
	}
	
	@PostMapping("/report")
	public String patientInfoReport(Model model) {
		
		return "report";
	}

}
