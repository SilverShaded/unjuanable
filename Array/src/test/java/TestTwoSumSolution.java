/*
* Test:0001
*
* */

import org.junit.jupiter.api.*;

public class TestTwoSumSolution {
    int[] nums1 = new int[]{2,7,11,15};
    int target1 = 9;
    int[] result1 = new int[]{0,1};

    int[] nums2 = new int[]{3,2,4};
    int target2 = 6;
    int[] result2 = new int[]{1,2};

    int[] nums3 = new int[]{3,3};
    int target3 = 6;
    int[] result3 = new int[]{0,1};

    TwoSumSolutionBetter twoSumSolution = new TwoSumSolutionBetter();

    @Test
    public void testTwoSum() {
        Assertions.assertArrayEquals(result1,twoSumSolution.twoSum(nums1,target1));
        Assertions.assertArrayEquals(result2,twoSumSolution.twoSum(nums2,target2));
        Assertions.assertArrayEquals(result3,twoSumSolution.twoSum(nums3,target3));
    }
}
