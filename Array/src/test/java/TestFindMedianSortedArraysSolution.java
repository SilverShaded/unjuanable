/*
 * Test:0004
 *
 * */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestFindMedianSortedArraysSolution {

    FindMedianSortedArraysSolution testClass = new FindMedianSortedArraysSolution();

    @Test
    public void findMedianSortedArrays01() {
        int[] nums1 = new int[]{1,3};
        int[] nums2 = new int[]{2};
        double result = testClass.findMedianSortedArrays(nums1,nums2);
        Assertions.assertEquals((double)2,result);
    }

    @Test
    public void findMedianSortedArrays02() {
        int[] nums1 = new int[]{1,2};
        int[] nums2 = new int[]{3,4};
        double result = testClass.findMedianSortedArrays(nums1,nums2);
        Assertions.assertEquals(2.5,result);
    }

    @Test
    public void findMedianSortedArrays03() {
        int[] nums1 = new int[]{1,3,5,7,9};
        int[] nums2 = new int[]{0,0};
        double result = testClass.findMedianSortedArrays(nums1,nums2);
        Assertions.assertEquals((double)3,result);
    }

}
