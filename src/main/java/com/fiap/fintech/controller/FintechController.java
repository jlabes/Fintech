package com.fiap.fintech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.fiap.fintech.service.FintechService;

import static com.fiap.fintech.controller.FintechValidator.USER_ID_PATTERN;

@Controller
public class FintechController {

	@Autowired
	private FintechService service;

	@GetMapping(path = "/{userid}", produces = MediaType.TEXT_HTML_VALUE)
	public String welcome(@PathVariable(name = "userid", required = true) String userId, Model model) {
		FintechValidator validator = FintechValidator.builder().value(userId).pattern(USER_ID_PATTERN).build();

		if (!validator.isValid()) {
			model.addAttribute("response", "400");
			return "error";
		}

		model.addAttribute("data", service.getData(userId));
		return "welcome";
	}
}
