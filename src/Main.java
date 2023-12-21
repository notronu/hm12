import java.sql.SQLOutput;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        Author joanRowling = new Author("Joan", "Rowling");
        Book harryPotter = new Book("Joan Rowling", "Harry Potter", 2000);
        System.out.println(joanRowling);
        System.out.println(harryPotter);
        Author andrzejSapkowski = new Author("Andrzej", "Sapkowski");
        Book theWitcher = new Book("Andrzej Sapkowski", "The Witcher", 1993);
        theWitcher.setPublishingYear(1986);
        System.out.println(andrzejSapkowski);
        System.out.println(theWitcher);
        System.out.println("harryPotter.name = " + harryPotter.getName()); // проверил геттеp




    }










    }
