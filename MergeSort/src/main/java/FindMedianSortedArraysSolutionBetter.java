/*
* 0004-better
* 归并排序新数组(左半部分即可,最后一位即中位数)
* */

public class FindMedianSortedArraysSolutionBetter {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int totalLen = len1 + len2;
        int i =0;
        int j =0;
        int middle = totalLen % 2 == 0 ? totalLen/2 : (totalLen-1)/2;
        int[] num3 = new int[middle+1];

        for (int k=0;k<=middle;k++) {
            if (i>=len1) {
                num3[k] = nums2[j];
                j++;
            }else if (j>=len2) {
                num3[k] = nums1[i];
                i++;
            }else {
                if (nums1[i] <= nums2[j]) {
                    num3[k] = nums1[i];
                    i++;
                }else {
                    num3[k] = nums2[j];
                    j++;
                }
            }
        }

        double result = totalLen % 2 == 0 ? (num3[middle-1]+num3[middle])/2.0 : num3[middle];
        return result;
    }

}
