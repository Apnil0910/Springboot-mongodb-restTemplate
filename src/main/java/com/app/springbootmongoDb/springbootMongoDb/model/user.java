package com.app.springbootmongoDb.springbootMongoDb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "userdetails")
public class user {
	
	@Id
	private String id ;
	private String email;

	public String getEmail() {
		return email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "user [email=" + email + "]";
	}

	public user(String email, String id) {
		super();
		this.email = email;
		this.id=id;
	}
	
	public user() {
		
	}
}
