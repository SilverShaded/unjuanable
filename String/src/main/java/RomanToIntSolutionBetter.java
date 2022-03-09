/*
 * 0013
 * 如果array[i] >= array[i+1]，则加；如果array[i]<array[i+1]，则减
 * 不用map，改用switch直接获得int，效率更高
 * */

public class RomanToIntSolutionBetter {

    public int charToint(char ch) {
        int result = 0;
        switch (ch) {
            case 'I':
                result =  1;
                break;
            case 'V':
                result =  5;
                break;
            case 'X':
                result =  10;
                break;
            case 'L':
                result =  50;
                break;
            case 'C':
                result =  100;
                break;
            case 'D':
                result =  500;
                break;
            case 'M':
                result =  1000;
                break;
        }
        return result;
    }

    public int romanToInt(String s) {

        int answer = 0;
        char[] array = s.toCharArray();
        for (int i =0;i<array.length;i++) {
            int now = charToint(array[i]);
            if (i+1<array.length) {
               int next = charToint(array[i+1]);
                if (now >= next) {
                    answer += now;
                }else {
                    answer = answer + next - now;
                    i++;
                }
            }else{
                answer += now;
            }
        }

        return answer;
    }
}
