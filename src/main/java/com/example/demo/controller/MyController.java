/**
 * 
 */
package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Neel
 *
 */
@RestController
public class MyController {
	
	@GetMapping(value="/")
	public String sayHello() {
		return "Hello There!";
	}
	
}
