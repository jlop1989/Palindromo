package palindrom;

import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromTest {
    
    public PalindromTest() {
    }

    @Test
    public void oneDigitNumberIsPalindrom() {
        assertTrue(Palindrom.isPalindrom(9));
    }
    
    @Test
    public void PairDigitNumberIsPalindrom() {
        assertTrue(Palindrom.isPalindrom(11));
    }
    
    @Test
    public void PairDigitNumberIsNotPalindrom() {
        assertFalse(Palindrom.isPalindrom(10));
    }
    
    @Test
    public void OddDigitNumberIsPalindrom() {
        assertTrue(Palindrom.isPalindrom(101));
    }
    
    @Test
    public void OddDigitNumberIsNotPalindrom() {
        assertFalse(Palindrom.isPalindrom(102));
    }
}
