/*
 * 0005
 *以每个字母为中心点，左右分别向外扩，得出该字母的最大回文。
 *大概也算DP(?)
 *  */

public class LongestPalindromeSolutionBest {

    String max_str = "";
    int max_length = 1;

    //外扩
    public void expand(String str, int low, int high) {
        while (low >= 0 && high < str.length() && str.charAt(low) == str.charAt(high)) {
            low--;
            high++;
        }
        if (high-low+1 > max_length) {
            max_length = high-low+1;
            max_str = str.substring(low+1,high);
        }
    }

    public String longestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }

        for (int i=0;i<s.length();i++) {
            //当前奇数回文
            expand(s,i,i);
            //当前偶数回文
            expand(s,i-1,i);
        }

        return max_str;
    }
}
