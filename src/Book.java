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




    public String toString() {
        return "Book{"
                + "author='" + author + '\''
                + ", name=" + name
                + ", publishingYear=" + publishingYear
                + '}';
    }

}
