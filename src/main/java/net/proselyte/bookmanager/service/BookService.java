package net.proselyte.bookmanager.service;

import net.proselyte.bookmanager.model.Book;

import java.util.List;

/**
 * Created by gunter on 29.01.2017.
 */
public interface BookService {

    void addBook(Book book);
    void updateBook(Book book);
    void removeBook(int id);
    Book getBookById(int id);
    List<Book> listBook();

}
