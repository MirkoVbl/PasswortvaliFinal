import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswortValiTest {

    @Test
    void passwortLaengeTest() {
        String password = "servusfreunde";

        boolean actual = PasswortVali.passwortLaenge(password);

        assertEquals(true, actual);
    }
    @Test
    void passwortNummerTest() {
        String password = "servusfreunde";

        boolean actual = PasswortVali.checkForNumber(password);

        assertEquals(false, actual);
    }
    @Test
    void passworUpperTest() {
        String password = "sErvusfreunde";

        boolean actual = PasswortVali.checkForUpperCase(password);

        assertEquals(true, actual);
    }
    @Test
    void passworLowerTest() {
        String password = "sErvusfreunde";

        boolean actual = PasswortVali.checkForLowerCase(password);

        assertEquals(true, actual);
    }
    @Test
    void badPasswortTest() {
        String password = "ServusFreunde7";

        boolean actual = PasswortVali.badPassword(password);

        assertEquals(true, actual);
    }

}
