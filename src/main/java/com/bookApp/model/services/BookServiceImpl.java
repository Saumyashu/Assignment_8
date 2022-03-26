package com.bookApp.model.services;

import java.util.List;

import com.bookApp.model.dao.Book;
import com.bookApp.model.dao.BookDao;
import com.bookApp.model.dao.BookDaoImpl;
import com.bookApp.model.dao.BookDaoImplHib;

public class BookServiceImpl implements BookService{

	private BookDao bookDao;
	
	public BookServiceImpl() {
		bookDao=new BookDaoImplHib();
	}

	@Override
	public List<Book> getAll() {
		return bookDao.getAll();
	}

	@Override
	public void addBook(Book b) {
		bookDao.addBook(b);
	}

}
