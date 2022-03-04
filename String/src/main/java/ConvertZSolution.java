/*
* 0006
* 找规律，第一行和最后一行，每个z包含一个。其余行，每个Z包含两个，且间距相等。
* */

public class ConvertZSolution {
    /*
    * 输入：s = "PAYPALISHIRING", numRows = 4
      输出："PINALSIGYAHRPI"
        0P     6I    N12
        1A   5L S7  I11 G
        2Y 4A   H8 R10
        3P      I9
    * */

    public String sub(String s, String result,int numRows,int row) {
        int firstIndex = row-1;
        while (firstIndex < s.length()) {
            //第一行或最后一行
           if (row == 1 || row == numRows) {
               result = result + s.charAt(firstIndex);
               firstIndex = firstIndex + 2*numRows - 2;
           }
           //其他行数
           else {
               result = result + s.charAt(firstIndex);
               if (firstIndex + 2*numRows - 2*row < s.length()) {
                   result = result + s.charAt(firstIndex + 2*numRows - 2*row);
               }
               firstIndex = firstIndex + 2*numRows - 2;
           }
        }
        return result;
    }
    public String convert(String s, int numRows) {
        if (numRows >= s.length() || numRows == 1) {
            return s;
        }

        String result = "";
        //每一行
        for (int i =1;i<=numRows;i++) {
            result = sub(s,result,numRows,i);
        }

        return result;
    }
}
