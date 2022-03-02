/*
* 0001
* hashtable(value,index)
* getHashtable(target-value)
* */

import java.util.ArrayList;
import java.util.Hashtable;

class TwoSumSolution {

    public int[] twoSum(int[] nums, int target) {

        Hashtable<Integer, ArrayList<Integer>> hashtable = new Hashtable<Integer, ArrayList<Integer>>();
        int[] result = new int[2];

        for (int i=0;i< nums.length;i++) {
            if (hashtable.get(nums[i]) != null) {
                hashtable.get(nums[i]).add(i);
            } else {
                ArrayList<Integer> indexs = new ArrayList<Integer>();
                indexs.add(i);
                hashtable.put(nums[i],indexs);
            }
        }

        for (int j=0;j<nums.length;j++) {
            int diffValue = target-nums[j];
            if (hashtable.get(diffValue) != null) {
                int firstValue = hashtable.get(diffValue).get(0);
                int hashSize = hashtable.get(diffValue).size();
                //[3,2,4] target=6
               if (hashSize == 1 && firstValue == j) {
                   continue;
               } else if (hashSize != 1 && firstValue == j) {
                   result[0] = firstValue;
                   result[1] = hashtable.get(diffValue).get(1);
                   return result;
               }

               result[0] = j;
               result[1] = firstValue;
               return result;

            }
        }

        return new int[]{};
    }
}
