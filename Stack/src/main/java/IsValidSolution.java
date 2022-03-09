/*
 * 0020
 * 不要忘记边界问题，stack.get(stack.size()-1)之前先判断stack长度是否>=1
 * */

import java.util.ArrayList;
import java.util.List;

public class IsValidSolution {

    public boolean isValid(String s) {

        int len = s.length();
        List<Character> stack = new ArrayList<Character>(len);
        char[] array = s.toCharArray();

        for (int i=0;i<len;i++) {
            switch (array[i]) {
                case ']':
                    if (stack.size()>=1 && stack.get(stack.size()-1) == '[') {
                        stack.remove(stack.size()-1);
                    }else {
                        stack.add(array[i]);
                    }
                    break;
                case ')':
                    if (stack.size()>=1 && stack.get(stack.size()-1) == '(') {
                        stack.remove(stack.size()-1);
                    }else {
                        stack.add(array[i]);
                    }
                    break;
                case '}':
                    if (stack.size()>=1 && stack.get(stack.size()-1) == '{') {
                        stack.remove(stack.size()-1);
                    }else {
                        stack.add(array[i]);
                    }
                    break;
                default:
                    stack.add(array[i]);
                    break;
            }
        }

        return stack.size()==0;
    }
}
