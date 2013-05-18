package palindrom;

import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromTest {
    
    public PalindromTest() {
    }

    @Test
    public void oneDigitNumberIsPalindrom() {
        assertTrue(Palindrom.isPalindrom(new Integer(9)));
    }
    
    @Test
    public void PairDigitNumberIsPalindrom() {
        assertTrue(Palindrom.isPalindrom(new Integer(11)));
    }
    
    @Test
    public void PairDigitNumberIsNotPalindrom() {
        assertFalse(Palindrom.isPalindrom(new Integer(10)));
    }
    
    @Test
    public void OddDigitNumberIsPalindrom() {
        assertTrue(Palindrom.isPalindrom(new Integer(101)));
    }
    
    @Test
    public void OddDigitNumberIsNotPalindrom() {
        assertFalse(Palindrom.isPalindrom(new Integer(102)));
    }
}
