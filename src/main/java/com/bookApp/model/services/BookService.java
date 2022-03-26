package com.bookApp.model.services;

import java.util.List;

import com.bookApp.model.dao.Book;

public interface BookService {
	public List<Book> getAll();
	public void addBook(Book b);
}