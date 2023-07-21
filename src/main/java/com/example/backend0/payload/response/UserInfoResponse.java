package com.example.backend0.payload.response;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class UserInfoResponse {
	private Long id;
	private String username;
	private String fullname;
	private List<String> roles;
}
