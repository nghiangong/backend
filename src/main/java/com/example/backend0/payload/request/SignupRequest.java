package com.example.backend0.payload.request;

import java.util.Set;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class SignupRequest {
    @NotBlank
    @Size(max = 50)
    @Email
    private String username;

    @NotBlank
    @Size(max = 50)
    private String fullname;
    
    @NotBlank
    @Size(min = 6, max = 40)
    private String password;

    private Set<String> roles;
}
