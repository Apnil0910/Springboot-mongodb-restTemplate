package com.app.springbootmongoDb.springbootMongoDb.repoistory;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.app.springbootmongoDb.springbootMongoDb.model.book;

public interface IbookRepoistory extends MongoRepository<book, Integer> {
	
	public book findBooksByauthorname(String authorname);

}
