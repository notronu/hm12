import java.sql.SQLOutput;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        Author joanRowling = new Author("Joan", "Rowling");
        Book harryPotter = new Book(joanRowling, "Harry Potter", 2000);
        System.out.println(joanRowling);
        System.out.println(harryPotter);

        Author andrzejSapkowski = new Author("Andrzej", "Sapkowski");
        Book theWitcher = new Book(andrzejSapkowski, "The Witcher", 1993);
        theWitcher.setPublishingYear(1986);

        System.out.println(andrzejSapkowski);
        System.out.println(theWitcher);

        System.out.println(joanRowling.equals(andrzejSapkowski));
        System.out.println(harryPotter.equals(theWitcher));

        System.out.println(joanRowling.hashCode());
        System.out.println(andrzejSapkowski.hashCode());
        System.out.println(harryPotter.hashCode());
        System.out.println(theWitcher.hashCode());








    }










    }
