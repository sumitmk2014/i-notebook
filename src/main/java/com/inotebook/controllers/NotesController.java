package com.inotebook.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotesController {
	
	@GetMapping("/home")
	public String home() {
		return "this is home";
	}

}
