/*
 * Test:0006
 *
 * */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestConvertZSolution {

    ConvertZSolutionBest test = new ConvertZSolutionBest();

    @Test
    public void TestConvertZSolution01() {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        String result = "PAHNAPLSIIGYIR";
        Assertions.assertEquals(result,test.convert(s,numRows));

    }

    @Test
    public void TestConvertZSolution02() {
        String s = "PAYPALISHIRING";
        int numRows = 4;
        String result = "PINALSIGYAHRPI";
        Assertions.assertEquals(result,test.convert(s,numRows));

    }

    @Test
    public void TestConvertZSolution03() {
        String s = "AB";
        int numRows = 1;
        String result = "AB";
        Assertions.assertEquals(result,test.convert(s,numRows));

    }
}
