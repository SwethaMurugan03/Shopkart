package com.shop.Shopkart;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TestController {
@RequestMapping("/hello")
	
	public String test() {
		return"Spring boot application using spring initialzer";
	}
	

}
