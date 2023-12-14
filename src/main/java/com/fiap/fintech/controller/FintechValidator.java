package com.fiap.fintech.controller;

import java.util.regex.Pattern;

import lombok.Builder;

@Builder
public class FintechValidator {

	public static final Pattern USER_ID_PATTERN = Pattern.compile("^[\\d]{6}$");
	
	private String value;
	
	private Pattern pattern;
	
	public boolean isValid() {
		return pattern.matcher(value).find();
	}
}
