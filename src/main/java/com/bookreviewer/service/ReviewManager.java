package com.bookreviewer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.bookreviewer.POJO.Book;
import com.bookreviewer.POJO.Review;

import java.util.HashMap;
import java.util.Map;

@Service
public class ReviewManager {
    private Map<Book, Review> reviews = new HashMap<>();

    public void addReview(Book book, Review review) {
        reviews.put(book, review);
    }

    public Review getReview(Book book) {
        return reviews.get(book);
    }

    public void printReviews() {
        reviews.forEach((book, review) -> System.out.println(book + " -> " + review));
    }

    @Autowired
    @Qualifier("book1")
    public void setBook(Book book) {
        System.out.println("Setter injection used for book: " + book.getTitle());
    }
}