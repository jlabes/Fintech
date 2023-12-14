package com.fiap.fintech.model.welcome;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserModel {

	private String name;

	private String lastName;
}
