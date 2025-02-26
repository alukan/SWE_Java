package com.bookreviewer.POJO;

public class Review {
    private int rating;
    private String comment;

    public Review(int rating, String comment) {
        this.rating = rating;
        this.comment = comment;
    }

    public void printReview() {
        System.out.println("Review: " + rating + "/5 - " + comment);
    }
}
