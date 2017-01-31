package net.proselyte.bookmanager.dao;

/**
 * Created by gunter on 18.12.2016.
 */

import net.proselyte.bookmanager.model.Book;

import java.util.List;

public interface BookDao {

    void addBook(Book book);

    void updateBook(Book book);

    void removeBook(int id);

    Book getBookById(int id);

    List<Book> listBook();

}
