import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<Book> bookList = new ArrayList<>();
    bookList.add(new Book(" 'Ayn Rand' ", " 'Abckedabra' ", 1140));
    bookList.add(new Book(" 'Ayn Rand' ", " 'Atlas Shrugged' ", 1123));
    bookList.add(new Book(" 'Rowling' ", " 'Harry Potter' ", 1140));
    bookList.add( new Book(" 'Rowling' ", " 'Abckedabra' ", 1140));
    for (Book books : bookList) {
      System.out.println(books);
    }


    System.out.println("Sort by author:");
    Collections.sort(bookList);
    for (Book books : bookList) {
        System.out.println(books);
    }

    System.out.println("Sort by Comparator:");
    bookList.sort(new BookNameComparator());
    for (Book books : bookList) {
      System.out.println(books);
    }
  }

}
