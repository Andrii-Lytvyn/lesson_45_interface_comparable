import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  /*
 Используйте класс Book (книга) из домашнего задания к уроку 45 (см. Book.java).
 Создайте список книг и отсортируйте книги по названию, (при одинаковых названиях - по автору) при помощи лямбда-функции.
  */

    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();

        bookList.add(new Book(" 'Ayn Rand' ", " 'Atlas Shrugged' ", 1140));
        bookList.add(new Book(" 'Rowling' ", " 'Harry Potter' ", 260));
        bookList.add(new Book(" 'Ayn Rand1' ", " 'Abckedabra' ", 11));
        bookList.add(new Book(" 'Ayn Rand2' ", " 'Abckedabra' ", 1140));
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


        System.out.println();
        System.out.println();
        System.out.println("======NEW SORT 14.04 LAMBDA");
        bookList.sort((Book o1, Book o2) -> o1.getTitle().compareTo(o2.getTitle()));
        for (Book books : bookList) {
            System.out.println(books);
        }
//        public int compare(Book o1, Book o2) {
//            if (!o1.getTitle().equals(o2.getTitle())) {
//                return o1.getTitle().compareTo(o2.getTitle());
//            }
//            return o1.getAuthor().compareTo(o2.getAuthor());



    }
}




