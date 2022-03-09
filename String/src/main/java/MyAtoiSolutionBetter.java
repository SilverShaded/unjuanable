/*
 * 0008
 * 题目坑很多……
 * 不到最后一刻，不要把double转换为int，否则边界容易溢出！
 * 达成beats 100% :)
 * */

public class MyAtoiSolutionBetter {

    public int myAtoi(String s) {
        char[] array = s.toCharArray();
        int positive = 1;
        //排除前导空格
        int index = 0;
        while (index < array.length) {
            if (array[index] != ' ') {
                break;
            }
            index++;
        }

        //正负号
        if (index < array.length && (array[index] == '+' || array[index] == '-')) {
            positive = array[index]=='+' ? 1 : -1;
            index++;
        }


        Double max = Math.pow(2,31)-1;
        Double min = Math.pow(-2,31);
        Double answer = 0.0;
        boolean hasDigit = false;
        int sign = index;

        //从这里开始，应该出现数字，否则返回0
        while (index<array.length && '0'<=array[index]&&array[index]<='9') {
            //开始考虑边界值
            if (index - sign >8) {
                if (answer*positive > max) {
                    return max.intValue();
                }else if (answer*positive < min) {
                    return min.intValue();
                }
            }
            if (!hasDigit) {
                hasDigit = true;
                answer = Double.valueOf(array[index] - 48);
                index++;
                continue;
            }
            answer = answer*10 + Double.valueOf(array[index] - 48);
            hasDigit = true;
            index++;
        }

        if (!hasDigit) {
            return 0;
        }
        answer = answer*positive;

        return answer.intValue();
    }
}
