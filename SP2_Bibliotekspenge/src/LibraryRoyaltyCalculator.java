import java.util.ArrayList;

public class LibraryRoyaltyCalculator {
    public static void main(String[] args) {

        //Opret forfatter
        Author firstAuthor = new Author("Olga ravn");

        //opret printetBog og lydBog
        Title printedBook = new PrintedBook("The dumb, the dumber and the flame sword", "BI", 324, 321);
        Title audioBook = new AudioBook("The dumb, the dumber and the flame sword", "BI", 3246, 160);

        //Add the books to the author
        firstAuthor.addTitle(printedBook);
        firstAuthor.addTitle(audioBook);

        //Calculate how much the author has earned and prints it
        double totalPay = firstAuthor.calculateTotalPay();
        System.out.println(firstAuthor.getName() + ": " + String.format("%.2f", totalPay) + " kr");

    }
}