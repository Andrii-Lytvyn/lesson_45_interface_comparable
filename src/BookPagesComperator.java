import java.util.Comparator;

public class BookPagesComperator implements Comparator<Book> {
  @Override
  public int compare(Book o1, Book o2) {
    if (o1.getPages() != o2.getPages()) {
      return o2.getPages() - o1.getPages();
    }
    return o1.getTitle().compareTo(o2.getTitle());
  }
}
