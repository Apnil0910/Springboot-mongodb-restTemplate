package com.app.springbootmongoDb.springbootMongoDb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.springbootmongoDb.springbootMongoDb.model.user;
import com.app.springbootmongoDb.springbootMongoDb.repoistory.IuserRepoistory;
import com.app.springbootmongoDb.springbootMongoDb.repoistory.UserRepoistory;

@RestController
public class UserController {
	@Autowired
	public IuserRepoistory objRepos ;
	
	
	@Autowired
	public UserRepoistory objMongotemplate;
	
	
	
	@PostMapping("/userdetails")
	public void postUserDetails(@RequestBody user obj) {
		System.out.println("user obje for saving details " +obj.getEmail() );
		objRepos.save(obj);	
	}

	@GetMapping("/getuser")
	public List<user> getUserdetails() {
		return objRepos.findAll();
	}

	@PostMapping("/saveuser")
	public void postUserDetailswithMongoTemplate(@RequestBody user obj) {
		System.out.println("user obje for saving details using mongo template features >>> " +obj.getEmail() );
		objMongotemplate.saveUser(obj);
	}

	
	
}

