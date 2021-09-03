package com.app.springbootmongoDb.springbootMongoDb.repoistory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.app.springbootmongoDb.springbootMongoDb.model.user;

@Repository
public class UserRepoistory {
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	public user saveUser(user obj) {
		return mongoTemplate.save(obj);
	 
 }

}
