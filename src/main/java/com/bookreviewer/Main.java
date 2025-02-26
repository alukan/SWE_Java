package com.bookreviewer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bookreviewer.component.BookCatalog;
import com.bookreviewer.service.ReviewManager;

public class Main {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
            BookCatalog bookCatalog = context.getBean(BookCatalog.class);
            System.out.println(bookCatalog.getBooks());

            ReviewManager reviewManager = context.getBean(ReviewManager.class);
            reviewManager.printReviews();
        }
    }
}
