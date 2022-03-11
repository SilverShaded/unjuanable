/*
 * Test:0023
 *
 * */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestMergeKListsSolutionOnlogn {

    MergeKListsSolutionOnlogn test = new MergeKListsSolutionOnlogn();

    public ListNode generateLink(int[] arrary) {
        ListNode listNode = new ListNode(0);
        ListNode cp1 = listNode;
        for (int i=0;i<arrary.length;i++) {
            cp1.val = arrary[i];
            if (i < arrary.length-1) {
                cp1.next = new ListNode(0);
            }
            cp1 = cp1.next;

        }
        return listNode;
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
    public void testMergeKListsSolution01() {
        int[] num1 = new int[]{1,4,5};
        int[] num2 = new int[]{1,3,4};
        int[] num3 = new int[]{2,6};
        ListNode list1 = generateLink(num1);
        ListNode list2 = generateLink(num2);
        ListNode list3 = generateLink(num3);
        ListNode[] param = new ListNode[]{list1,list2,list3};
        List<Integer> resultNum = new ArrayList<Integer>(Arrays.asList(1,1,2,3,4,4,5,6));
        Assertions.assertEquals(resultNum,linkedlistToArray(test.mergeKLists(param)));
    }

    @Test
    public void testMergeKListsSolution02() {
        ListNode[] param = new ListNode[]{};
        Assertions.assertEquals(null,test.mergeKLists(param));
    }

    @Test
    public void testMergeKListsSolution03() {
        ListNode[] param = new ListNode[1];
        param[0] = null;
        Assertions.assertEquals(null,test.mergeKLists(param));
    }
}
