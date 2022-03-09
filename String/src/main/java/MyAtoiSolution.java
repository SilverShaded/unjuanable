/*
 * 0008
 * 题目坑很多……
 * */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyAtoiSolution {

    public int myAtoi(String s) {
        String pattern = "(\\s*)((\\+|-)?)(\\d+)";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(s);
        if (!matcher.lookingAt()) {
            return 0;
        } else {
            //抽取出数字
            String str = matcher.group();
            String digitPattern = "((\\+|-)?)(\\d+)";
            Pattern digitRegex = Pattern.compile(digitPattern);
            Matcher digitMatcher = digitRegex.matcher(str);
            digitMatcher.find();
            Double result = Double.valueOf(digitMatcher.group(0));
            if (result >= Math.pow(2,31)) {
                result = Math.pow(2,31)-1;
            }else if (result<Math.pow(-2,31)) {
                result = Math.pow(-2,31);
            }

            return result.intValue();
        }
    }

    public static void main(String[] args) {
        String pattern = "(\\s*)((\\+|-)?)(\\d+)";
        Pattern regex = Pattern.compile(pattern);
        String s = "   -42";
        Matcher matcher = regex.matcher(s);
        if (matcher.lookingAt()) {
            System.out.println("matcher: "+matcher.group(0));
            System.out.println(Integer.valueOf(matcher.group(0)));
        }
    }
}
