package com.tech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tech.service.AsyncService;

@RestController
@RequestMapping("/test")
public class TestController {
	@Autowired
	private AsyncService service;

	@GetMapping
	public String asyncTest() {
		service.process();
		return "SUCCESS";
	}
}
