import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<Book> bookList = new ArrayList<>();
    bookList.add(new Book(" 'Ayn Rand' ", " 'Abckedabra' ", 1140));
    bookList.add(new Book(" 'Ayn Rand' ", " 'Atlas Shrugged' ", 1140));
    bookList.add(new Book(" 'Rowling' ", " 'Harry Potter' ", 260));
    bookList.add(new Book(" 'Rowling' ", " 'Abckedabra' ", 11));
    for (Book books : bookList) {
      System.out.println(books);
    }

    System.out.println("Sort by author:");
    Collections.sort(bookList);
    for (Book books : bookList) {
      System.out.println(books);
    }

    System.out.println("Sort by Title -  Comparator:");
    bookList.sort(new BookNameComparator());
    for (Book books : bookList) {
      System.out.println(books);
    }

    System.out.println("Sort by pages Comparator:");
    bookList.sort(new BookPagesComperator());
    for (Book books : bookList) {
      System.out.println(books);
    }
  }
}



