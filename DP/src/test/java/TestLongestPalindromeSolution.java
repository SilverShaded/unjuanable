/*
 * Test:0005
 *
 * */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestLongestPalindromeSolution {

    LongestPalindromeSolutionBest test1 = new LongestPalindromeSolutionBest();

    @Test
    public void testLongestPalindromeSolution01() {
        String s = "babad";
        String result = "bab";
        Assertions.assertEquals(result,test1.longestPalindrome(s));
    }

    @Test
    public void testLongestPalindromeSolution02() {
        String s = "cbbd";
        String result = "bb";
        Assertions.assertEquals(result,test1.longestPalindrome(s));
    }
    @Test
    public void testLongestPalindromeSolution03() {
        String s = "bb";
        String result = "bb";
        Assertions.assertEquals(result,test1.longestPalindrome(s));
    }

}
