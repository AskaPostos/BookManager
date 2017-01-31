package net.proselyte.bookmanager.model;

/**
 * Created by gunter on 16.12.2016.
 */

import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "Books")
public class Book {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = IDENTITY)
    private int id;

    @Column(name = "Title")
    private String title;

    @Column(name = "Author")
    private String author;

    @Column(name = "Price")
    private int price;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.title = name;
    }

    public String getName() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

}
