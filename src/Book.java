public class Book {
    private String author;
    private String name;
    int publishingYear;


    public Book(String author, String name, int publishingYear) {
        this.author = author;
        this.name = name;
        this.publishingYear = publishingYear;
    }
    public String getAuthor() {
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
