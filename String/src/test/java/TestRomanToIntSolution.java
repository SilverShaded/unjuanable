/*
 * Test:0013
 *
 * */


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRomanToIntSolution {

    RomanToIntSolutionBetter test = new RomanToIntSolutionBetter();

    @Test
    public void testRomanToIntSolution01() {
        String s = "III";
        int result = 3;
        Assertions.assertEquals(result,test.romanToInt(s));
    }

    @Test
    public void testRomanToIntSolution02() {
        String s = "IV";
        int result = 4;
        Assertions.assertEquals(result,test.romanToInt(s));
    }

    @Test
    public void testRomanToIntSolution03() {
        String s = "IX";
        int result = 9;
        Assertions.assertEquals(result,test.romanToInt(s));
    }

    @Test
    public void testRomanToIntSolution04() {
        String s = "LVIII";
        int result = 58;
        Assertions.assertEquals(result,test.romanToInt(s));
    }

    @Test
    public void testRomanToIntSolution05() {
        String s = "MCMXCIV";
        int result = 1994;
        Assertions.assertEquals(result,test.romanToInt(s));
    }
}
