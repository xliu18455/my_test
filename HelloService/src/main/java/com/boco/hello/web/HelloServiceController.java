package com.boco.hello.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloServiceController {
	
	@RequestMapping("/hello")
	public String hello(){
		
		return  "hello world";
	}

}
