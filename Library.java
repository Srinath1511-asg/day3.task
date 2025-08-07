package day3.task;

import java.util.*;

public class Library {
    private static List<Book> books = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        books.add(new Book("Java Basics", "James Gosling"));
        books.add(new Book("advance java", "manish soni"));
        books.add(new Book("python Basics", "Dinesh"));
        books.add(new Book("DSA", "Srinath"));
        

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        User user = new User(name, new Random().nextInt(100));
        user.displayUser();

        int choice;
        do {
            System.out.println("\n1. View Books\n2. Issue Book\n3. Return Book\n4. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    for (Book book : books) {
                        book.displayInfo();
                    }
                    break;

                case 2:
                    System.out.print("Enter book title to issue: ");
                    String titleToIssue = sc.nextLine();
                    issueBook(titleToIssue);
                    break;

                case 3:
                    System.out.print("Enter book title to return: ");
                    String titleToReturn = sc.nextLine();
                    returnBook(titleToReturn);
                    break;

                case 4:
                    System.out.println("Exiting Library System.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);

        sc.close();
    }

    public static void issueBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.issueBook();
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public static void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.returnBook();
                return;
            }
        }
        System.out.println("Book not found.");
    }
}

