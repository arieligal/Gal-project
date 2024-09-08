package Library_Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Book book1 = new Book("Freida Mcfadden", "The Housemaid", 336);
        Book book2 = new Book("Ali Hazelwood", "The Love Hypothesis", 400);
        Book book3 = new Book("Colleen Hoover","It End With us", 384);
        Book book4 = new Book("Colleen Hoover","It Start With Us", 330);
        Book book5 = new Book("Kristin Harmel","The Book Of The Lost Name", 416);
        Book book6 = new Book("Danielle Steel","The Duchess", 442);

        Shelf shelf1 = new Shelf();
        shelf1.addABook(book1);
        shelf1.addABook(book2);
        Shelf shelf2 = new Shelf();
        shelf2.addABook(book3);
        shelf2.addABook(book4);
        Shelf shelf3 = new Shelf();
        shelf3.addABook(book5);
        shelf3.addABook(book6);

        List<Shelf> shelves = new ArrayList<>();
        shelves.add(shelf1);
        shelves.add(shelf2);
        shelves.add(shelf3);

        Library library = new Library(shelves);

        int choice = 0;

        while (choice != 6) {
            System.out.println("Press 1 - For adding a book");
            System.out.println("Press 2 - For deleting a book");
            System.out.println("Press 3 - For registering a new reader");
            System.out.println("Press 4 - For removing a reader");
            System.out.println("Press 5 - For searching books by author");
            System.out.println("Press 6 - for exit the program");
            System.out.println("Your choice:");

            choice = input.nextInt();
            input.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Pls enter the book details: ");
                    System.out.println("The Name of the book");
                    String bookName = input.nextLine();
                    System.out.println("Author's Name");
                    String bookAuthor = input.nextLine();
                    System.out.println("The num of pages");
                    int numOfPages = input.nextInt();
                    library.addNewBook(new Book(bookAuthor, bookName, numOfPages));
                    input.nextLine();
                    break;
                case 2:
                    System.out.println("Pls write the book name to delete");
                    String book2Delete = input.nextLine();
                    library.deleteBook(book2Delete);
                    break;
                case 3:
                    System.out.println("Pls write the reader details");
                    System.out.println("ID");
                    int id = input.nextInt();
                    System.out.println("Name");
                    String readerName = input.next();
                    library.registerReader(id, readerName);
                    break;
                case 4:
                    System.out.println("Pls write the reader name to delete");
                    String readerName2Delete = input.nextLine();
                    library.removeReader(readerName2Delete);
                    break;
                case 5:
                    System.out.println("Pls write the author name for search a book ");
                    String authorName = input.nextLine();
                    List<Book> booksOfAuthor = library.searchByAuthor(authorName);
                    System.out.println("The book list: ");
                    for (Book book: booksOfAuthor) {
                        System.out.println("book name: " + book.title + "\n");
                    }
                    break;
                case 6:
            }
        }

    }

}

