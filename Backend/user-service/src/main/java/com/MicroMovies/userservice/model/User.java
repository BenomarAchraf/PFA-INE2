package com.MicroMovies.userservice.model;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
@Document("users")
public class User {
	@Id
	private String id;
	private String username;
	private String password;
	private String email;
	@CreatedDate
    private Date createdAt;
	private Boolean isAdmin;

}