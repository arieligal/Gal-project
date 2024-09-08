package Library_Project;

import java.util.ArrayList;
import java.util.List;

public class Reader {
    int id;
    String name;
    List<Book> books;

    public Reader(int id, String name) {
        this.id = id;
        this.name = name;
        this.books = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void readBook(Book book){
        books.add(book);
    }
}