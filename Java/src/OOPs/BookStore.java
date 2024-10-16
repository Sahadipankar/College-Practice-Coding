package OOPs;

class Book {
    private String title; // Private member variable to store the title of the book
    private String author; // Private member variable to store the author of the book
    private double price; // Private member variable to store the price of the book

    // // Constructor to initialize the Book object with title, author, and price
    // public Book(String title, String author, double price) {
    //     this.title = title;
    //     this.author = author;
    //     this.price = price;
    // }

    // Getter and setter methods for encapsulation
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
}

// Class that represents the bookstore and handles selling books
class Shop {
    public void sellBook(Book book) {
        // Perform operations to sell the book
        System.out.println("Book sold:");
        book.displayDetails(); // Display book details when sold
    }
}

public class BookStore {
    public static void main(String[] args) {
        
        // // Create a new book object using the constructor
        // Book book1 = new Book("Java Programming", "John Doe", 29.99);

        Book book1 = new Book();
        book1.setTitle("Java Programming");
        book1.setAuthor("John Doe");
        book1.setPrice(29.99);

        // Create a bookstore (shop) object to sell the book
        Shop bookstore = new Shop();

        // Sell the book using the shop's method
        bookstore.sellBook(book1);
    }
}
