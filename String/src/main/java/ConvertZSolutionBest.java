/*
 * 0006
 * 第一排数字的间隔: interval_1=(row-1)*2
 * 第二排数字的间隔: interval_21=(row-2)*2, interval_22=interval_1-interval_21
 * …
 * 第i排数字的间隔: interval_i1=(row-i)*2, interval_i2=interval_1-interval_i1
 * 最后一排数字的间隔与第一排一致。
 * 切记flag在每一行结束后重置。
*/


public class ConvertZSolutionBest {

    public String convert(String s, int numRows) {
        int len = s.length();
        if (numRows<=1 || numRows >= len) {
            return s;
        }

        StringBuilder result = new StringBuilder();
        int max_interval = 2*(numRows-1);
        for (int i=1;i<=numRows;i++) {
            int index = i-1;
            boolean flag = true;
            while (index < len) {
                result.append(s.charAt(index));
                if (i==1||i==numRows) {
                    index = index+max_interval;
                    continue;
                }
                if (flag) {
                    index = index+(numRows-i)*2;
                    flag = !flag;
                }else {
                    index = index+(max_interval-2*(numRows-i));
                    flag = !flag;
                }
            }

        }

        return result.toString();
    }
}
