/*
 * Test:0002
 *
 * */
import org.junit.jupiter.api.Test;

public class TestAddTwoNumbersSolution {

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

    @Test
    public void testAddTwoNumbers_1() {
        int[] array_a1 = new int[]{2,4,3};
        int[] array_a2 = new int[]{5,6,4};
        ListNode list_a1 = generateLink(array_a1);
       ListNode list_a2 = generateLink(array_a2);

        AddTwoNumbersSolution test = new AddTwoNumbersSolution();
        ListNode result = test.addTwoNumbers(list_a1,list_a2);


    }

    @Test
    public void testAddTwoNumbers_2() {
        int[] array_a1 = new int[]{0};
        int[] array_a2 = new int[]{0};
        ListNode list_a1 = generateLink(array_a1);
        ListNode list_a2 = generateLink(array_a2);

        AddTwoNumbersSolution test = new AddTwoNumbersSolution();
        ListNode result = test.addTwoNumbers(list_a1,list_a2);

    }

    @Test
    public void testAddTwoNumbers_3() {
        int[] array_a1 = new int[]{9,9,9,9,9,9,9};
        int[] array_a2 = new int[]{9,9,9,9};
        ListNode list_a1 = generateLink(array_a1);
        ListNode list_a2 = generateLink(array_a2);

        AddTwoNumbersSolution test = new AddTwoNumbersSolution();
        ListNode result = test.addTwoNumbers(list_a1,list_a2);

    }
}
