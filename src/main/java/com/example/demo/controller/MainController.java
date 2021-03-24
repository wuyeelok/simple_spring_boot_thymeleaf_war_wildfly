package com.example.demo.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	private static final Logger LOGGER = LoggerFactory.getLogger(MainController.class);

	@GetMapping("/")
	public String mainPage(ModelMap model) {

		LOGGER.info("in root, should go to index");

		model.addAttribute("time_now", new Date().toString());

		return "index";
	}
}
