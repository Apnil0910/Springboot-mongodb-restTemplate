package com.app.springbootmongoDb.springbootMongoDb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "bookstore")
public class book {
	
	@Id
	private int id;
	private String bookname;
	private String authorname;
	
	
	public book(int id, String bookname, String authorname) {
		super();
		this.id = id;
		this.bookname = bookname;
		this.authorname = authorname;
	}
	
	public book() {
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}

	@Override
	public String toString() {
		return "book [id=" + id + ", bookname=" + bookname + ", authorname=" + authorname + "]";
	}

}
