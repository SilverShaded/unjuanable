/*
 * Test:0020
 *
 * */


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestIsValidSolution {

    IsValidSolution test = new IsValidSolution();

    @Test
    public void testIsValidSolution01() {
        String s = ")";
        boolean result = false;
        Assertions.assertEquals(result,test.isValid(s));
    }

    @Test
    public void testIsValidSolution02() {
        String s = "()[]{}";
        boolean result = true;
        Assertions.assertEquals(result,test.isValid(s));
    }

    @Test
    public void testIsValidSolution03() {
        String s = "(]";
        boolean result = false;
        Assertions.assertEquals(result,test.isValid(s));
    }

    @Test
    public void testIsValidSolution04() {
        String s = "([)]";
        boolean result = false;
        Assertions.assertEquals(result,test.isValid(s));
    }

    @Test
    public void testIsValidSolution05() {
        String s = "{[]}";
        boolean result = true;
        Assertions.assertEquals(result,test.isValid(s));
    }
}
