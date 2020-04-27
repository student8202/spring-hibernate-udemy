package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class SillyController {
	
	@RequestMapping("/main")
	public String showPageVersion2() {
		return "main-menu-2";
	}

}
