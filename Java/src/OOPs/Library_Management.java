package OOPs;

import java.util.ArrayList;
import java.util.Scanner;

// Book class (Represents a Book entity)
class Book {
    private String bookName;
    private String bookAuthor;
    private int ISBN; 
    private int bookNo; // Unique identifier for each book
    private boolean isAvailable;

    // Constructor to initialize a book
    public Book(String bookName, String bookAuthor, int ISBN, int bookNo) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.ISBN = ISBN;
        this.bookNo = bookNo;
        this.isAvailable = true; // New books are available by default
    }

    // Getter methods
    public String getBookName() {
        return bookName;
    }

    public int getBookNo() {
        return bookNo;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Method to set the availability of the book
    public void setAvailability(boolean status) {
        this.isAvailable = status;
    }

    // Method to display book information
    public void displayBookInfo() {
        System.out.println("BookNo: " + bookNo + ", Title: " + bookName + ", Author: " + bookAuthor + ", Available: " + (isAvailable ? "Yes" : "No"));
    }
}

// Member class (Represents a Member entity)
class Member {
    private String memberName;
    private int memberID;
    private ArrayList<Book> borrowedBooks;

    // Constructor to initialize a member
    public Member(String memberName, int memberID) {
        this.memberName = memberName;
        this.memberID = memberID;
        this.borrowedBooks = new ArrayList<>();
    }

    // Getter methods
    public String getMemberName() {
        return memberName;
    }

    public int getMemberID() {
        return memberID;
    }

    // Method for a member to borrow a book
    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            borrowedBooks.add(book);
            book.setAvailability(false); // Mark book as borrowed (unavailable)
            System.out.println(memberName + " borrowed the book: " + book.getBookName());
        } else {
            System.out.println("The book is not available.");
        }
    }

    // Method for a member to return a book
    public void returnBook(Book book) {
        if (borrowedBooks.remove(book)) {
            book.setAvailability(true); // Mark book as available
            System.out.println(memberName + " returned the book: " + book.getBookName());
        } else {
            System.out.println("This book was not borrowed by " + memberName);
        }
    }

    // Method to display borrowed books
    public void displayBorrowedBooks() {
        System.out.println("Books borrowed by " + memberName + ":");
        if (borrowedBooks.isEmpty()) {
            System.out.println("No books borrowed.");
        } else {
            for (Book book : borrowedBooks) {
                System.out.println(book.getBookName());
            }
        }
    }
}

// Library class (Manages books and members)
class Library {
    private ArrayList<Book> books;
    private ArrayList<Member> members;

    // Constructor to initialize the library
    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    // Method to add a new book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book titled '" + book.getBookName() + "' added to the library.");
    }

    // Method to add a new member to the library
    public void addMember(Member member) {
        members.add(member);
        System.out.println("Member '" + member.getMemberName() + "' added to the library.");
    }

    // Method to find a book by its bookNo
    public Book findBookByBookNo(int bookNo) {
        for (Book book : books) {
            if (book.getBookNo() == bookNo) {
                return book;
            }
        }
        return null; // Return null if book is not found
    }

    // Method to find a member by their ID
    public Member findMemberByID(int memberID) {
        for (Member member : members) {
            if (member.getMemberID() == memberID) {
                return member;
            }
        }
        return null; // Return null if member is not found
    }

    // Method to allow a member to borrow a book
    public void borrowBook(int memberID, int bookNo) {
        Member member = findMemberByID(memberID);
        Book book = findBookByBookNo(bookNo);

        if (member == null) {
            System.out.println("Invalid member ID.");
        } else if (book == null) {
            System.out.println("Invalid book number.");
        } else {
            member.borrowBook(book);
        }
    }

    // Method to allow a member to return a book
    public void returnBook(int memberID, int bookNo) {
        Member member = findMemberByID(memberID);
        Book book = findBookByBookNo(bookNo);

        if (member == null) {
            System.out.println("Invalid member ID.");
        } else if (book == null) {
            System.out.println("Invalid book number.");
        } else {
            member.returnBook(book);
        }
    }

    // Method to display all books in the library
    public void displayAllBooks() {
        System.out.println("\nBooks in the library:");
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            for (Book book : books) {
                book.displayBookInfo();
            }
        }
    }

    // Method to display all members of the library
    public void displayAllMembers() {
        System.out.println("\nLibrary Members:");
        if (members.isEmpty()) {
            System.out.println("No members in the library.");
        } else {
            for (Member member : members) {
                System.out.println("Name: " + member.getMemberName() + ", ID: " + member.getMemberID());
            }
        }
    }

    // Method to display total number of books and members
    public void displayTotalBooksAndMembers() {
        System.out.println("\nTotal number of books: " + books.size());
        System.out.println("Total number of members: " + members.size());
    }
}

// Main class to manage the Library system (with a menu for user interaction)
public class Library_Management {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        System.out.println("Welcome to National Library!");

        // Menu-driven loop
        while (true) {
            System.out.println("\nLibrary Management Menu");
            System.out.println("1. Add a new book");
            System.out.println("2. Add a new member");
            System.out.println("3. Issue a book");
            System.out.println("4. Return a book");
            System.out.println("5. Display all books");
            System.out.println("6. Display all members");
            System.out.println("7. Display total number of books and members");
            System.out.println("8. Exit");

            System.out.print("\nSelect your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Add a new book
                    System.out.print("\nEnter the new Book Name: ");
                    sc.nextLine(); // Consume newline
                    String bookName = sc.nextLine();
                    System.out.print("Enter the Book Author: ");
                    String bookAuthor = sc.nextLine();
                    System.out.print("Enter the Book ISBN: ");
                    int ISBN = sc.nextInt();
                    System.out.print("Enter the Book No: ");
                    int bookNo = sc.nextInt();
                    Book newBook = new Book(bookName, bookAuthor, ISBN, bookNo);
                    library.addBook(newBook);
                    break;

                case 2:
                    // Add a new member
                    System.out.print("\nEnter the member name: ");
                    sc.nextLine(); // Consume newline
                    String memberName = sc.nextLine();
                    System.out.print("Enter the member ID: ");
                    int memberID = sc.nextInt();
                    Member newMember = new Member(memberName, memberID);
                    library.addMember(newMember);
                    break;

                case 3:
                    // Issue a book
                    System.out.print("\nEnter the member ID: ");
                    int issueMemberID = sc.nextInt();
                    System.out.print("Enter the book number of the book to issue: ");
                    int issueBookNo = sc.nextInt();
                    library.borrowBook(issueMemberID, issueBookNo);
                    break;

                case 4:
                    // Return a book
                    System.out.print("\nEnter the member ID: ");
                    int returnMemberID = sc.nextInt();
                    System.out.print("Enter the book number of the book to return: ");
                    int returnBookNo = sc.nextInt();
                    library.returnBook(returnMemberID, returnBookNo);
                    break;

                case 5:
                    // Display all books
                    library.displayAllBooks();
                    break;

                case 6:
                    // Display all members
                    library.displayAllMembers();
                    break;

                case 7:
                    // Display total number of books and members
                    library.displayTotalBooksAndMembers();
                    break;

                case 8:
                    // Exit the program
                    System.out.println("Exiting the system...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
    }
}
