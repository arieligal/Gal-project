package Library_Project;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Shelf> shelves;
    List<Reader> readers;

    public Library(List<Shelf> shelves) {
        this.shelves = shelves;
        this.readers = new ArrayList<>();
    }

    public boolean isTherePlaceForNewBook(){
        for (Shelf shelf: shelves) {
            if(!shelf.isShelfFull()){
                return true;
            }
        }
        return false;
    }
    public void addNewBook(Book book){
        if(isTherePlaceForNewBook()){
            for (Shelf shelf: shelves){
                if(!shelf.isShelfFull()){
                    shelf.addABook(book);
                    return;
                }
            }
        }
    }

    public void deleteBook(String title){
        for (Shelf shelf: shelves){
            for (Book book: shelf.getBooks()){
                if (book.getTitle().equals(title)){
                    shelf.getBooks().remove(book);
                    return;
                }
            }
        }
    }
    public void registerReader(int id, String name){
        readers.add(new Reader(id, name));
    }

    public void removeReader(String name){
        readers.removeIf(reader -> reader.getName().equals(name));
    }
    public List<Book> searchByAuthor(String authorName){
        List<Book> allBooks = new ArrayList<>();
        for (Shelf shelf: shelves){
            for (Book book: shelf.getBooks()){
                if (book.getAuthor().equals(authorName)){
                    allBooks.add(book);
                }
            }
        }
        return allBooks;
    }
}