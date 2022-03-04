/*
* 0005
* 双指针，left从首字母开始,right从最后一个字母开始。left在外，right在内
* 注意：将结果（左index和maxlength）保存，最后返回这个保存结果，避免错误！不要返回双指针！！
* right-left >= maxLenth是判断值，而不是right-left > maxLenth，否则会错过“bb”这样长度为2的回文！
* */

public class LongestPalindromeSolution {

    /*
    * 输入：s = "cebabd"
      输出："bab"
    * */
    public String longestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }
        //result[0]=leftIndex,result[1]=maxLength
        int[] result = new int[2];
        result[0] = 0;
        result[1] = 1;
        int left = 0;

        //双指针
        while (left < s.length()) {
            //确定left的元素
            int right = s.length()-1;
            //right开始寻找和lValue相同的元素
            while (right < s.length() && right-left >= result[1]) {
                if (s.charAt(right) == s.charAt(left)) {
                    String sub = s.substring(left,right)+s.charAt(right);
                    String reverse = new StringBuilder(sub).reverse().toString();
                    if (sub.equals(reverse) && sub.length()>result[1]) {
                        result[0] = left;
                        result[1] = sub.length();
                    }
                }
                right--;
            }
            left++;
        }

        return s.substring(result[0],result[0]+result[1]);
    }
}
