package com.example.backend0.payload.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor @Getter @Setter
public class UserInfoResponse {
	private Long id;
	private String username;
	private String fullname;
	private List<String> roles;
}
