package com.bookreviewer;

import com.bookreviewer.component.BookCatalog;
import com.bookreviewer.service.ReviewManager;
import com.bookreviewer.POJO.Book;
import com.bookreviewer.POJO.Review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {

    private final BookCatalog bookCatalog;
    private final ReviewManager reviewManager;

    @Autowired
    public DataInitializer(BookCatalog bookCatalog, ReviewManager reviewManager) {
        this.bookCatalog = bookCatalog;
        this.reviewManager = reviewManager;
        initializeData();
    }

    private void initializeData() {
        Book book1 = new Book("Initilizer Title1", "Author1");
        Book book2 = new Book("Initilizer Title2", "Author2");
        Book book3 = new Book("Initilizer Title3", "Author3");

        bookCatalog.addBook(book1);
        bookCatalog.addBook(book2);
        bookCatalog.addBook(book3);

        Review review1 = new Review(5, "Excellent book!");
        Review review2 = new Review(4, "Great read!");

        reviewManager.addReview(book1, review1);
        reviewManager.addReview(book2, review2);

        System.out.println("Data initialization complete.");
    }
}