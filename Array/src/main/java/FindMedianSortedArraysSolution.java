
import java.util.*;
import java.util.stream.Collectors;


/*
* 0004
* 直接合并出一个新的数组，再查找中位数
* */
public class FindMedianSortedArraysSolution {
    /*
    * 输入：nums1 = [1,3], nums2 = [2]
      输出：2.00000
      解释：合并数组 = [1,2,3] ，中位数 2
    * */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n1Length = nums1.length;
        int n2Length = nums2.length;

        if (nums1.length == 0) {
            return n2Length % 2 == 0 ? (nums2[n2Length/2-1]+nums2[n2Length/2])/2.0 : nums2[(n2Length-1)/2];
        } else if (nums2.length == 0) {
            return n1Length % 2 == 0 ? (nums1[n1Length/2-1]+nums1[n1Length/2])/2.0 : nums1[(n1Length-1)/2];
        }

        List<Integer> list1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());
        List<Integer> list3 = new ArrayList<>(n1Length+n2Length);
        while (list1.size() != 0 && list2.size() != 0) {
            if (list1.get(0) <= list2.get(0)) {
                list3.add(list1.get(0));
                list1.remove(0);
            }else {
                list3.add(list2.get(0));
                list2.remove(0);
            }
        }

        for (int element1 : list1) {
            list3.add(element1);
        }

        for (int element2 : list2) {
            list3.add(element2);
        }

        int l3Length = list3.size();
        return l3Length % 2 == 0 ? (list3.get(l3Length/2-1)+list3.get(l3Length/2))/2.0 : list3.get((l3Length-1)/2);
    }
}




