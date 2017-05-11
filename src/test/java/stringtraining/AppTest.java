package stringtraining;


import org.junit.Test;
import static org.junit.Assert.*;


public class AppTest {

    String testString = "aBBcccDDDDeeeee111111222222233333333";

    char testChar1 = 'a';
    char testChar2 = 'B';
    char testChar3 = 'c';
    char testChar4 = 'D';
    char testChar5 = 'e';
    char testChar6 = '1';
    char testChar7 = '2';
    char testChar8 = '3';
    char charNotInString = 'z';

    @Test
    public void testingChars() {
        assertEquals(1, App.howManyChar(testChar1, testString));
        assertEquals(2, App.howManyChar(testChar2, testString));
        assertEquals(3, App.howManyChar(testChar3, testString));
        assertEquals(4, App.howManyChar(testChar4, testString));
        assertEquals(5, App.howManyChar(testChar5, testString));
        assertEquals(6, App.howManyChar(testChar6, testString));
        assertEquals(7, App.howManyChar(testChar7, testString));
        assertEquals(8, App.howManyChar(testChar8, testString));

    }

    @Test
    public void noCharPrestentInString() {
        assertEquals(0, App.howManyChar(charNotInString, testString));
    }
}
