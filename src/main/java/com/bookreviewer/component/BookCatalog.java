package com.bookreviewer.component;

import org.springframework.stereotype.Component;

import com.bookreviewer.POJO.Book;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookCatalog {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }
}