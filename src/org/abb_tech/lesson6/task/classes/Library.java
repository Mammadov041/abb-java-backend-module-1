package org.abb_tech.lesson6.task.classes;

import org.abb_tech.lesson6.task.interfaces.BookFilter;

import java.util.ArrayList;
import java.util.List;

public class Library<T extends Library.Section> {

    private List<T> sections = new ArrayList<>();

    public void addSection(T section) {
        sections.add(section);
    }

    public void displayAllSections() {
        for (T section : sections) {
            section.displayBooks();
        }
    }

    public void filterBooks(BookFilter filter) {
        System.out.println("Filtered books (based on filter condition):");
        for (T section : sections) {
            for (Library<?>.Book book : section.getBooks()) {
                if (filter.filter(book)) {
                    System.out.println(" - " + book);
                }
            }
        }
    }

    public class Book {
        private String title;
        private String author;
        private int year;

        public Book(String title, String author, int year) {
            this.title = title;
            this.author = author;
            this.year = year;
        }

        public int getYear() {
            return year;
        }

        @Override
        public String toString() {
            return "Book{title='" + title + "', author='" + author + "', year=" + year + "}";
        }
    }

    public static class Section {
        private String name;
        private List<Library<?>.Book> books = new ArrayList<>();

        public Section(String name) {
            this.name = name;
        }

        public void addBook(Library<?>.Book book) {
            books.add(book);
        }

        public void displayBooks() {
            System.out.println("Section: " + name);
            for (Library<?>.Book book : books) {
                System.out.println(" - " + book);
            }
        }

        public List<Library<?>.Book> getBooks() {
            return books;
        }
    }
}
