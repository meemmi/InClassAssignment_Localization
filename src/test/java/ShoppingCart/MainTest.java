package ShoppingCart;
import org.junit.jupiter.api.Test;

import java.util.Locale;
import java.util.ResourceBundle;

import static org.junit.jupiter.api.Assertions.*;


class MainTest {


    @Test
    void testFI() {
        String fiLanguage = "fi";
        String fiCountry = "FI";
        Locale locale = new Locale(fiLanguage, fiCountry);
        ResourceBundle rb  = ResourceBundle.getBundle("MessagesBundle", locale);
        assertEquals("Anna ostettavien tuotteiden määrä", rb.getString("amount"));

    }

    @Test
    void testEN() {
        String fiLanguage = "en";
        String fiCountry = "US";
        Locale locale = new Locale(fiLanguage, fiCountry);
        ResourceBundle rb  = ResourceBundle.getBundle("MessagesBundle", locale);
        assertEquals("Enter the number of items to purchase:", rb.getString("amount"));

    }

    @Test
    void testSW() {
        String fiLanguage = "ja";
        String fiCountry = "JP";
        Locale locale = new Locale(fiLanguage, fiCountry);
        ResourceBundle rb  = ResourceBundle.getBundle("MessagesBundle", locale);
        assertEquals("購入する商品の数量を入力してください。", rb.getString("amount"));

    }

    @Test
    void testJP() {
        String fiLanguage = "sv";
        String fiCountry = "SE";
        Locale locale = new Locale(fiLanguage, fiCountry);
        ResourceBundle rb  = ResourceBundle.getBundle("MessagesBundle", locale);
        assertEquals("Ange antalet varor att köpa:", rb.getString("amount"));

    }
}
