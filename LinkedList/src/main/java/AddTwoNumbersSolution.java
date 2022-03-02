/*
* 0002
*
* */


public class AddTwoNumbersSolution {

    /*
    * 输入：l1 = [2,4,3], l2 = [5,6,4]
      输出：[7,0,8]
      解释：342 + 465 = 807.
    * */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode cpr = result;
        int carry = 0;

        //只要两个链表不都为空
        while (l1 != null || l2 != null) {
            //是否进位
            if (l1.val+l2.val+carry > 9 ) {
                int number = l1.val + l2.val +carry - 10;
                cpr.val = number;
                carry = 1;
            }else {
                int number = l1.val + l2.val +carry;
                cpr.val = number;
                carry = 0;
            }

            //l1结束，l2未结束，给l1添加val=0的节点
            if (l1.next == null && l2.next !=null) {
                l1.next = new ListNode(0);
            } else if (l1.next != null && l2.next == null) {
                l2.next = new ListNode(0);
            }
            //l2结束，l1未结束，给l2添加val=0的节点
            if (l1.next != null || l2.next != null) {
                cpr.next = new ListNode(0);
                cpr = cpr.next;
            }
            //l1 l2都结束，但进位未结束
            if (l1.next == null && l2.next == null & carry != 0) {
                ListNode top = new ListNode(carry);
                cpr.next = top;
            }

            l1 = l1.next;
            l2 = l2.next;

        }

        return result;

    }
}
