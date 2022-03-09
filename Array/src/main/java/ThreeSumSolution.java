/*
 * 0015
 * 哈希去重，多考虑去重复的隐藏条件
 * */


import java.util.*;

public class ThreeSumSolution {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();
        if (nums == null || nums.length <= 2) {
            return list;
        }
        // 排序，从小到大
        Arrays.sort(nums);

        Integer first = 0;
        Integer second = 0;
        Integer third = 0;

        Map<Integer, Integer> save = new HashMap<>();
        for (int e = 0; e < nums.length; e++) {
            save.put(-nums[e], e);
        }

        for (int i = 0; i < nums.length; i++) {
            first = nums[i];
            // 第一个数大于0，说明从此至后都没有了
            if (first > 0) {
                break;
            }
            // first=nums[i-1]已经将所有组合都计算了，这次搜索只会重复
            if (i > 0 && first == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length; j++) {
                second = nums[j];
                // second=nums[i-1]已经将所有组合都计算了，这次搜索只会重复
                if (j > i + 1 && second == nums[j - 1]) {
                    continue;
                }
                if (save.get(nums[i] + nums[j]) == null) {
                    continue;
                }
                if (save.get(nums[i] + nums[j]) <= j) {
                    continue;
                }
                third = -(nums[i] + nums[j]);
                // 反向指针，从最大数开始向左移，能省略third<0的步骤
                list.add(new ArrayList<>(Arrays.asList(first, second, third)));
            }
        }

        return list;
    }
}
