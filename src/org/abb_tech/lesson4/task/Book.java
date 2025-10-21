package org.abb_tech.lesson4.task;

public class Book {
    private String title;
    private String author;
    private String isbn;
    protected int totalCopies;
    protected int availableCopies;

    Book(String title,String author,String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        totalCopies = 1;
        availableCopies = 1;
    }

    public void borrowBook(){
        if(availableCopies > 0){
            availableCopies--;
            System.out.println("Book borrowed succesfully.");
        }else{
            System.out.println("Sorry , no copies available.");
        }
    }

    public void returnBook(){
        if(totalCopies > availableCopies){
            availableCopies--;
            System.out.println("Book returned succesfully .");
        }else{
            System.out.println("All copies are already in the library .");
        }
    }

    public void printInfo(){
        System.out.println("----- BOOK INFO -----");
        System.out.println(String.format("Title : %s \nAuthor : %s\nISBN : %s\nTotal Copies : %d\nAvailable Copies : %d"
                ,this.title,this.author,this.isbn,this.totalCopies,this.availableCopies));
        System.out.println("----------------------");

    }

    public static void libraryRules() {
        System.out.println("Max 3 books can be borrowed per person.");
    }

    public final void bookType() { System.out.println("This is a regular book.");}

    {
        System.out.println("New book created !");
    }
}
