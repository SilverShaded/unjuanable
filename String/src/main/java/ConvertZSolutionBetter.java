/*
 * 0006
 * 行索引。使用StringBuilder，避免增加大量字符串
 * */

import java.util.ArrayList;
import java.util.List;

public class ConvertZSolutionBetter {
    /*
    * 输入：s = "PAYPALISHIRING", numRows = 4
      输出："PINALSIGYAHRPI"
        0P     6I    N12
        1A   5L S7  I11 G13
        2Y 4A   H8 R10
        3P      I9
    * */

    public String convert(String s, int numRows) {

        int len = s.length();
        if (numRows >= len || numRows==1) {
            return s;
        }
        List<StringBuilder> rowStr = new ArrayList<StringBuilder>();
        StringBuilder result = new StringBuilder();

        for (int i=0;i<numRows;i++) {
            rowStr.add(new StringBuilder());
        }

        int row = 0;
        int flag = -1;
        for (char c : s.toCharArray()) {
            rowStr.get(row).append(c);
            if (row == 0 || row == numRows-1) {
                flag = -flag;
            }
            row = row + flag;
        }

        for (int i =0;i<numRows;i++) {
            result = result.append(rowStr.get(i));
        }

        return result.toString();
    }
}
