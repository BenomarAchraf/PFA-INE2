package com.MicroMovies.userservice.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
@Document("notifications")
public class Notification {
	
	@Id
	private String id;
	private String description;
	private Boolean allusers ;
	private List<String> categories;
	

}
