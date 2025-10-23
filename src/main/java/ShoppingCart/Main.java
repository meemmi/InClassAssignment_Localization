package ShoppingCart;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter language:");
        String language = sc.nextLine();
        System.out.println("Enter country:");
        String country = sc.nextLine();

        Locale locale = new Locale(language, country);
        ResourceBundle rb  = ResourceBundle.getBundle("MessagesBundle", locale);

        double sum = 0;

        System.out.println(rb.getString("amount"));
        String amountOfProducts = sc.nextLine();
        Integer amount = parseInt(amountOfProducts);

        for (int i = 0; i < amount; i++) {
            System.out.println(rb.getString("price"));
            String productPrice = sc.nextLine();
            Double productPriceToD = parseDouble(productPrice);


            System.out.println(rb.getString("number"));
            String numberOfProducts = sc.nextLine();
            Double priceToDouble = parseDouble(numberOfProducts);
            Double productSum = productPriceToD * priceToDouble;
            sum += productSum;
        }

        System.out.println("");
        System.out.println(rb.getString("sum"));
        System.out.println(sum);

    }
}

// void testEngilshBundle() { toimiiko englanninkielen bundle oikein
// sen jälkeen assert equals, palauttaako saman tekstin
// rb.getString(price)
