package com.syntax.class20;

public class TaskBook {
    String title;
    String author;
    int pages;

    public TaskBook(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        System.out.println("The book "+title+" by "+author+" has "+pages+" pages");
    }
    TaskBook () {
        System.out.println("This is default constructor");
    }

    public static void main(String[] args) {
        new TaskBook ("Peace and war", "Lev Tolstoy", 234);
        new TaskBook();
    }
}
