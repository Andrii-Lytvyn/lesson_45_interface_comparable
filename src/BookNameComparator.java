import java.util.Comparator;
  /*Задача 1
Создайте компаратор, который позволит сортировать книги по названию, при одинаковых названиях
- по автору (и там, и там - по алфавиту)
  * */

public class BookNameComparator implements Comparator<Book> {
  @Override
  public int compare(Book o1, Book o2) {
    if (!o1.getTitle().equals(o2.getTitle())) {
      return o1.getTitle().compareTo(o2.getTitle());
    }
    return o1.getAuthor().compareTo(o2.getTitle());
  }

}
