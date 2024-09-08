package Library_Project;

import java.util.ArrayList;
import java.util.List;

public class Shelf {
    List<Book> books;
    boolean isShelfFull;


    public Shelf() {
        books = new ArrayList<>(5);
        isShelfFull = false;
    }

    public boolean isShelfFull() {
        return isShelfFull;
    }

    public void addABook(Book book) {
        if (isShelfFull()) {
            System.out.println("no more room, shelf is full of books");
        } else {
            books.add(book);
            if (books.size() == 5) {
                isShelfFull = true;
            }
        }
    }

    public void replaceBooks(int first, int second) {
        Book firstBook = books.get(first);
        Book secondBook = books.get(second);

        books.set(second, firstBook);
        books.set(first, secondBook);
    }

    public List<Book> getBooks() {
        return books;
    }
}