package com.minort.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

	@GetMapping({ "", "/" })
	public String getDashBoard() {
		return "dashboard";
	}

	@GetMapping({ "/add" })
	public String addEmployee() {
		return "addEmployee";
	}
}
