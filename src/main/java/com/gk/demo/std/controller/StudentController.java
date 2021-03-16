package com.gk.demo.std.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/std")
public class StudentController {
	
	@GetMapping
	public String getAll() {
		
		return "if url conatins second then redirected via Zuul Gateway !!";
	}

}
