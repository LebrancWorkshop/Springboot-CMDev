package com.lebrancconvas.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductController {
	@GetMapping("/products")
	public String getProducts() {
		return "Hello Product";
	}
	

}
