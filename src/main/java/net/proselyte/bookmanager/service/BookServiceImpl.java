package net.proselyte.bookmanager.service;

import net.proselyte.bookmanager.dao.BookDao;
import net.proselyte.bookmanager.model.Book;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by gunter on 29.01.2017.
 */

@Service
public class BookServiceImpl implements BookService{

    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    @Transactional
    public void addBook(Book book) {
        bookDao.addBook(book);
    }

    @Override
    @Transactional
    public void updateBook(Book book) {
        bookDao.updateBook(book);
    }

    @Override
    @Transactional
    public void removeBook(int id) {
        bookDao.removeBook(id);
    }

    @Override
    @Transactional
    public Book getBookById(int id) {
        return bookDao.getBookById(id);
    }

    @Override
    @Transactional
    public List<Book> listBook() {
        return bookDao.listBook();
    }
}
