/*
 * Test:0008
 *
 * */


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMyAtoiSolution {

    MyAtoiSolutionBetter test = new MyAtoiSolutionBetter();

    @Test
    public void testMyAtoiSolution01() {
        String s = "   -42";
        int result = -42;
        Assertions.assertEquals(result,test.myAtoi(s));
    }

    @Test
    public void testMyAtoiSolution02() {
        String s = "+-12";
        int result = 0;
        Assertions.assertEquals(result,test.myAtoi(s));
    }

    @Test
    public void testMyAtoiSolution03() {
        String s = "words and 987";
        int result = 0;
        Assertions.assertEquals(result,test.myAtoi(s));
    }

    @Test
    public void testMyAtoiSolution04() {
        String s = "00000-42a1234";
        int result = 0;
        Assertions.assertEquals(result,test.myAtoi(s));
    }

    @Test
    public void testMyAtoiSolution05() {
        String s = "-2147483648";
        int result = -2147483648;
        Assertions.assertEquals(result,test.myAtoi(s));
    }

}
