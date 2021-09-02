package com.app.springbootmongoDb.springbootMongoDb.repoistory;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.app.springbootmongoDb.springbootMongoDb.model.user;

public interface IuserRepoistory extends MongoRepository<user, String>{

}
