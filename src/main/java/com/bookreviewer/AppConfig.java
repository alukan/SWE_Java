package com.bookreviewer;

import com.bookreviewer.POJO.Book;
import com.bookreviewer.POJO.Review;
import com.bookreviewer.component.BookCatalog;
import com.bookreviewer.service.ReviewManager;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.bookreviewer")
public class AppConfig {

    @Bean
    public Book book1() {
        return new Book("Title1", "Author1");
    }

    @Bean
    public Book book2() {
        return new Book("Title2", "Author2");
    }

    @Bean
    public Book book3() {
        return new Book("Title3", "Author3");
    }

    @Bean
    public Review review1() {
        return new Review(5, "Excellent book!");
    }

    @Bean
    public Review review2() {
        return new Review(4, "Great read!");
    }

    @Bean
    public DataInitializer dataInitializer(BookCatalog bookCatalog, ReviewManager reviewManager) {
        return new DataInitializer(bookCatalog, reviewManager);
    }
}