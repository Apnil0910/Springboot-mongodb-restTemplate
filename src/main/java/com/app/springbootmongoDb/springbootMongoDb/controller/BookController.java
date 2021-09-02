package com.app.springbootmongoDb.springbootMongoDb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.springbootmongoDb.springbootMongoDb.model.book;
import com.app.springbootmongoDb.springbootMongoDb.repoistory.IbookRepoistory;

@RestController
public class BookController {
	
	@Autowired
	public IbookRepoistory bookObj;
	
	@PostMapping("/savebook")
	public void postUserDetails(@RequestBody book obj) {
		System.out.println("user obje for saving details " +obj.toString() );
		bookObj.save(obj);	
	}

	@GetMapping("/getAllbooks")
	public List<book> getUserdetails() {
		return bookObj.findAll();
	}

	@GetMapping("/getBooks/{authorname}")
	public book getBooksbyAuthorName(@PathVariable String authorname) {
		return bookObj.findBooksByauthorname(authorname);
		
	}
	
	@DeleteMapping("/deleteBooks/{id}")
	public String deleteBooksById(@PathVariable Integer id) {
		 bookObj.deleteById(id);
		return "Book deleted bro store !!! having id as " + id;
		
	}
	
	
}
