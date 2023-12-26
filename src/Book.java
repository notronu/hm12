import java.util.Objects;

public class Book {
    private Author author;
    private String name;
    private int publishingYear;


    public Book(Author author, String name, int publishingYear) {
        this.author = author;
        this.name = name;
        this.publishingYear = publishingYear;
    }
    public Author getAuthor() {
        return this.author;
    }
    public String getName() {
        return this.name;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(author, book.author) && Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }


    public String toString() {
        return " Автор: " + author + "; Название книги: " + name + "; Год издания: " + publishingYear;
    }

}
