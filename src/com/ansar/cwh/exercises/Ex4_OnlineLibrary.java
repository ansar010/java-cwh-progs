package com.ansar.cwh.exercises;

public class Ex4_OnlineLibrary {
    public static void main(String[] args) {
        // You have to implement a library1 using Java Class "Library1"
        // Methods: addBook, issueBook, returnBook, showAvailableBooks
        // Properties: Array to store the available books,
        // Array to store the issued books

        System.out.println("Welcome to Library1");
        Book book1 = new Book("Harry Potter", "Samual");
        Book book2 = new Book("Animal History", "John");
        Book book3 = new Book("Nature Book", "Mike");
        Book book4 = new Book("Shahin Book", "Shahin");

        Library1 library1 = new Library1();
        library1.addBooks(book1);
        library1.addBooks(book2);
        library1.addBooks(book3);

        Book nature_book = library1.issueBook("Nature Book");
        System.out.println("Got book from Library1: " + nature_book.getName());

        Book harry_potter = library1.issueBook("Harry Potter");
        System.out.println("Got book from Library1: " + harry_potter.getName());

        library1.showAvailableBooks();
        library1.showIssuedBooks();
        library1.addBooks(book4);
        System.out.println("\nBook Added");
        library1.showAvailableBooks();
    }
}

class Library {
    Book[] availableBooks = new Book[5], issuedBooks = new Book[5];

    public void addBooks(Book book) {
        for (int i = 0; i < availableBooks.length; i++) {
            if (availableBooks[i] == null) {
                availableBooks[i] = book;
                break;
            }
        }
    }

    public Book issueBook(String bookName) {
        showAvailableBooks();
        System.out.println("\nEntered book name: " + bookName);
        int i = 0;
        while (i < availableBooks.length) {
            if (availableBooks[i].getName().equalsIgnoreCase(bookName)) {
                Book tempBook = availableBooks[i];
                availableBooks[i] = null;
                for (int j = 0; j < issuedBooks.length; j++) {
                    if (issuedBooks[j] == null) {
                        issuedBooks[j] = tempBook;
                        break;
                    }
                }
                return tempBook;
            }
            i++;
        }
        return null;
    }

    public void returnBook(Book bookName) {
        addBooks(bookName);
    }

    public void showAvailableBooks() {
        System.out.println("\nAvailable books");
        System.out.println("===============");
        for (Book bk : availableBooks) {
            if (bk != null) {
                System.out.println(bk.getName());
            }
        }
    }

    public void showIssuedBooks() {
        System.out.println("\nIssued books");
        System.out.println("===============");
        for (Book bk : issuedBooks) {
            if (bk != null) {
                System.out.println(bk.getName());
            }
        }
    }
}

class Book {
    String name, author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }
}