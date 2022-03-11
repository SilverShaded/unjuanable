/*
 * 0021
 * 就是比较。最后剩下的部分直接链接，也不用再循环了。
 * */

public class MergeTwoListsSolution {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1==null) {
            return list2;
        }else if (list2 == null) {
            return list1;
        }

        ListNode list3 = null;
        ListNode front = null;

        //两个链表都不为空，避免边界问题。
        while (list1!=null && list2!=null) {
            if (list1.val <= list2.val) {
                if (list3 == null) {
                    //第一个节点
                    list3 = new ListNode(list1.val);
                    front = list3;
                }else {
                    //cp对应上一个
                    front.next = new ListNode(list1.val);
                    front = front.next;
                }
                list1 = list1.next;
                if (list1== null) {
                    //list1结束，list2剩余
                    while (list2 != null) {
                        front.next = list2;
                        break;
                    }
                }

            }
            else {
                if (list3 == null) {
                    list3 = new ListNode(list2.val);
                    front = list3;
                }else {
                    //cp对应上一个
                    front.next = new ListNode(list2.val);
                    front = front.next;
                }
                list2 = list2.next;
                if (list2 == null) {
                    front.next = list1;
                    break;
                }

            }
        }

        return list3;
    }
}
