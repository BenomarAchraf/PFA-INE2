package com.MicroMovies.userservice.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class AuthRequest {
	
	private String username;
	private String password;

}
