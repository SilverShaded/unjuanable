/*
 * 0005
 * dp
 * For every i; palindrom[i][i] = true
 * For every (i, j); palindrom[i][j] = true if str[i] == str[j] && j-i <= 2
 * For every (i, j); palindrom[i][j] = true if str[i] == str[j] && palindrom[i+1][j-1]) == true
 * 注意，外面一层循环对应的元素先移动，内层循环元素的移动区间是[0,外层元素]，保证移动区间的回文都判断出来
 * */

public class LongestPalindromeSolutionBetter {

    /*
   * 输入：s = "cebabd"
     输出："bab"
   * */
    public String longestPalindrome(String s) {

        int len = s.length();
        int startIndex = 0;
        int maxLength = 1;
        //判断[a,b]区间是否回文，默认false
        boolean[][] isPalindrome = new boolean[len][len];

        //j=右边界元素
        for (int j=0;j<s.length();j++) {
            //单个元素是回文
            isPalindrome[j][j] = true;
            //i=左边界元素
            for (int i=0;i<j;i++) {
                /*区间元素介于2/3长度，或者[左边界+1,右边界-1]是回文。
                在此前提，左右边界元素相等。*/
                if ((j-i<=2 || isPalindrome[i+1][j-1]) && s.charAt(i) == s.charAt(j)) {
                    //是回文
                    isPalindrome[i][j] = true;
                    //判断是否为最大长度
                    if (j-i+1 > maxLength) {
                        maxLength = j-i+1;
                        startIndex = i;
                    }
                }
            }
        }

        return s.substring(startIndex,startIndex+maxLength);

    }
}
