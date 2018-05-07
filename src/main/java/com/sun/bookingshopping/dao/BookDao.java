package com.sun.bookingshopping.dao;


import java.util.List;

import com.sun.bookingshopping.model.Book;

public interface BookDao {
	/*
	 * CREATE and UPDATE
	 */
	public void saveBook(Book book);
	
	/*
	 * READ
	 */
	public List<Book> listBooks();
	public Book getBook(Long id);
	
	/*
	 * DELETE
	 */
	public void deleteBook(Long id);
}
