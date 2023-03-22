import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    Book book = new Book("Rand", "Atlas Shrugged2", 1140);
    Book book2 = new Book("Rand", "Atlas Shrugged", 1123);
    Book book3 = new Book("Dickens", "newBook", 1140);
    System.out.println(book.toString());
    System.out.println(book2.toString());
    System.out.println(book3.toString());
    List<Book> bookList = new ArrayList<>();
    bookList.add(book);
    bookList.add(book2);
    bookList.add(book3);

    System.out.println();
    Collections.sort(bookList);
    for (Book books : bookList) {
        System.out.println(books);
    }


  }

}
