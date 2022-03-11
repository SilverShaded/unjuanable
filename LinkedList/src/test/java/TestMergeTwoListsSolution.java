/*
 * Test:0021
 *
 * */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestMergeTwoListsSolution {

    MergeTwoListsSolution test = new MergeTwoListsSolution();

    public ListNode arrayToLinkedlist(List<Integer> nums) {
        ListNode list = null;
        ListNode cp = null;
        for (int num : nums) {
            if (list==null) {
                list = new ListNode(num);
                cp = list;
            }else {
                cp.next = new ListNode(num);
                cp = cp.next;
            }
        }
        return list;
    }

    public List<Integer> linkedlistToArray(ListNode listNode) {
        int i =0;
        List<Integer> array = new ArrayList<Integer>();
        while (listNode!=null) {
            array.add(listNode.val);
            listNode = listNode.next;
            i++;
        }
        return array;
    }

    @Test
    public void testMergeTwoListsSolution01() {
        List<Integer>nums1 = new ArrayList<Integer>(Arrays.asList(1,2,4));
        List<Integer>nums2 = new ArrayList<Integer>(Arrays.asList(1,3,4));
        List<Integer>nums3 = new ArrayList<Integer>(Arrays.asList(1,1,2,3,4,4));
        ListNode list1 = arrayToLinkedlist(nums1);
        ListNode list2 = arrayToLinkedlist(nums2);
        ListNode list3 = arrayToLinkedlist(nums3);
        Assertions.assertEquals(nums3,linkedlistToArray(test.mergeTwoLists(list1,list2)));
    }

    @Test
    public void testMergeTwoListsSolution02() {
        List<Integer>nums1 = new ArrayList<Integer>();
        List<Integer>nums2 = new ArrayList<Integer>();
        List<Integer>nums3 = new ArrayList<Integer>();
        ListNode list1 = arrayToLinkedlist(nums1);
        ListNode list2 = arrayToLinkedlist(nums2);
        ListNode list3 = arrayToLinkedlist(nums3);
        Assertions.assertEquals(nums3,linkedlistToArray(test.mergeTwoLists(list1,list2)));
    }

    @Test
    public void testMergeTwoListsSolution03() {
        List<Integer>nums1 = new ArrayList<Integer>();
        List<Integer>nums2 = new ArrayList<Integer>(Arrays.asList(0));
        List<Integer>nums3 = new ArrayList<Integer>(Arrays.asList(0));
        ListNode list1 = arrayToLinkedlist(nums1);
        ListNode list2 = arrayToLinkedlist(nums2);
        ListNode list3 = arrayToLinkedlist(nums3);
        Assertions.assertEquals(nums3,linkedlistToArray(test.mergeTwoLists(list1,list2)));
    }

}
