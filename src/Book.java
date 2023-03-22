public class Book implements Comparable<Book> {

    /*
Задача 1

Реализуйте интерфейс для сравнения книг: они должны сортироваться по авторам,
 а если авторы совпадают - по названиям (и там, и там - по алфавиту, "в словарном порядке").*/

  private final String author;
  private final String title;
  private final int pages;

  public Book(String author, String title, int pages) {
    this.author = author;
    this.title = title;
    this.pages = pages;
  }

  public int getPages() {
    return pages;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  @Override
  public int compareTo(Book otherBook) {

    if (!author.equals(otherBook.author)) {
      return author.compareTo(otherBook.author);
    }
    return title.compareTo(otherBook.title);

  }

  @Override
  public String toString() {
    String line = author + " " + title + " " + pages;
    return line;
  }
}
