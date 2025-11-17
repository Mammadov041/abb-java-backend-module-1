package org.abb_tech.lesson9.tasks.task1;

import org.abb_tech.lesson9.tasks.task1.classes.Book;
import org.abb_tech.lesson9.tasks.task1.classes.BorrowRecord;
import org.abb_tech.lesson9.tasks.task1.classes.LibraryService;
import org.abb_tech.lesson9.tasks.task1.classes.User;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // --- Books ---
        Book b1 = new Book("1984", "George Orwell", 1949, 4.9, true);
        Book b2 = new Book("Animal Farm", "George Orwell", 1945, 4.8, false);
        Book b3 = new Book("Clean Code", "Robert Martin", 2008, 4.7, true);
        Book b4 = new Book("Effective Java", "Joshua Bloch", 2018, 4.9, true);
        Book b5 = new Book("The Pragmatic Programmer", "Andy Hunt", 1999, 4.6, true);
        Book b6 = new Book("Java Concurrency in Practice", "Brian Goetz", 2006, 4.5, false);

        List<Book> books = Arrays.asList(b1, b2, b3, b4, b5, b6);

        // --- Users ---
        User u1 = new User("Aydin", 25, Arrays.asList(
                new BorrowRecord(b1, LocalDate.of(2025, 9, 1), LocalDate.of(2025, 9, 10)),
                new BorrowRecord(b3, LocalDate.of(2025, 10, 5), null)
        ));

        User u2 = new User("Leyla", 22, Arrays.asList(
                new BorrowRecord(b4, LocalDate.of(2025, 10, 2), LocalDate.of(2025, 10, 20)),
                new BorrowRecord(b6, LocalDate.of(2025, 10, 12), null)
        ));

        User u3 = new User("Murad", 28, Arrays.asList(
                new BorrowRecord(b5, LocalDate.of(2025, 9, 10), LocalDate.of(2025, 9, 25))
        ));

        List<User> users = Arrays.asList(u1, u2, u3);

        // --- Library Service ---
        LibraryService service = new LibraryService(books, users);



        System.out.println("\n📚 Recommendation for Aydin:");
        service.findRecommendedBookForUser(u1)
                .ifPresentOrElse(
                        b -> System.out.println("Recommended: " + b),
                        () -> System.out.println("No recommendation available.")
                );

        System.out.println("\n🏆 Top Reader of October 2025:");
        service.findTopReaderOfMonth(10, 2025)
                .ifPresentOrElse(
                        u -> System.out.println("Top Reader: " + u.getName()),
                        () -> System.out.println("No reader found.")
                );

        // Bonus: calculate reading durations
        System.out.println("\n⏱ Reading Durations:");
        users.stream()
                .flatMap(u -> u.getBorrowHistory().stream())
                .filter(b -> b.getReturnedDate() != null)
                .forEach(r -> {
                    long days = Duration.between(
                            r.getBorrowedDate().atStartOfDay(),
                            r.getReturnedDate().atStartOfDay()
                    ).toDays();

                    System.out.println(
                            r.getBook().getTitle() + " read in " + days + " days"
                    );
                });

                // --- CALL ALL LIBRARY FUNCTIONS THAT WERE NOT USED ---

                // 3️⃣ Most borrowed book
                System.out.println("\n📘 Most Borrowed Book:");
                Book mostBorrowed = service.getMostBorrowedBook();
                System.out.println(mostBorrowed != null ? mostBorrowed : "None");

                // 4️⃣ Users & their currently borrowed books
                System.out.println("\n📚 Users' Current Borrowed Books:");
                service.getUsersCurrentBooks().forEach((user, bookList) -> {
                    System.out.println(user + " → " + bookList);
                });

                // 5️⃣ Group Books by Author
                System.out.println("\n👨‍🏫 Books grouped by authors (from borrow history):");
                service.groupBooksByAuthor().forEach((author, list) -> {
                System.out.println(author + ": " + list);
                });

                // 6️⃣ Average Rating
                System.out.println("\n⭐ Average book rating in library:");
                System.out.println(service.calculateAverageRating());

                // 7️⃣ Books after 2000 and available
                System.out.println("\n📘 Available books published after 2000:");
                service.after2000AndIsAvailable();

                // 8️⃣ Get all authors from borrow history
                System.out.println("\n✍ All authors in borrow history:");
                System.out.println(service.getAuthors());

    }

}
