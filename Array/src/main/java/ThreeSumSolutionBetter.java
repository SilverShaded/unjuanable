/*
 * 0015
 * 双指针，left指向第二个数，right指向第三个数，考虑各种重复条件
 * */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumSolutionBetter {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>(nums.length/2);
        if (nums.length<3) {
            return list;
        }

        //排序
        Arrays.sort(nums);


        int len = nums.length;
        //左指针，指向second
        int left = 0;
        //右指针，指向third
        int right = len-1;
        //first，从左向右
        if (nums[left] > 0||nums[right] < 0) {
            return list;
        }
        for (int i=0;i<len-2;i++) {
            //第一个数不大于0
            if (nums[i]>0) {
                break;
            }
            //第一个数重复，在上一次循环中已经考虑过该情况
            if (i>0 && nums[i] == nums[i-1]) {
                continue;
            }
            left = i+1;
            right = len-1;
            while (left<right) {
                //第三个数<0，跳出
                if (nums[right] < 0) {
                    break;
                }
                //first+second >0，跳出
                if (nums[i] + nums[left] > 0) {
                    break;
                }
                //第二个数重复，在上一次循环中已经考虑过该情况
                if (left > i+1 && nums[left]==nums[left-1]) {
                    left++;
                    continue;
                }
                int value = nums[i] + nums[left] + nums[right];
                if (value == 0) {
                    List<Integer> element = new ArrayList<>();
                    element.add(nums[i]);
                    element.add(nums[left]);
                    element.add(nums[right]);
                    list.add(element);
                    left++;
                    right--;
                }else if (value > 0) {
                    //偏大，right左移
                    right--;
                }else {
                    //偏小，left右移
                    left++;
                }
            }
        }

        return list;
    }
}
