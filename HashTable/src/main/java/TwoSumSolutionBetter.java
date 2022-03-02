import java.util.HashMap;
import java.util.Map;

/*
 * 0001
 * */
public class TwoSumSolutionBetter {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>(nums.length);
        for (int i=0; i<nums.length;i++) {
            if (map.get(target-nums[i]) != null) {
                return new int[] {map.get(target-nums[i]),i};
            } else {
                map.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}
