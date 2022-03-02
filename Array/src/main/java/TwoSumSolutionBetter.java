/*
 * 0001 - better
 * Map(target-num[i],i)
 * 不要先转换为map，先判断map中是否含有key=target-nums[i]，再转换，避免重复index现象
 * 注意先转换的key=nums[i]，后面才可能找到taget-nums[i]这个key。相当于后面的元素找前面的元素。
 * */

import java.util.HashMap;
import java.util.Map;

public class TwoSumSolutionBetter {

    public int[] twoSum(int[] nums, int target) {
       Map<Integer, Integer> diffMap = new HashMap<Integer, Integer>(nums.length);
       for (int i=0;i<nums.length;i++) {
           if (diffMap.get(target-nums[i]) != null) {
               return new int[]{diffMap.get(target-nums[i]),i};
           }else {
               diffMap.put(nums[i],i);
           }
       }
       return new int[]{};
    }

}
