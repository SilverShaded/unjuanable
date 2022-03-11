/*
 * 0023
 * 把每个链表的值都取出，放到一个数组里，数组排序，再生成链表
 * */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeKListsSolutionOnlogn {

    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> save = new ArrayList<Integer>();
        ListNode result = null;
        ListNode cp = null;
        //长度为0
        if (lists==null || lists.length==0) {
            return result;
        }
        for (int i=0;i < lists.length;i++) {
            while (lists[i] != null) {
                save.add(lists[i].val);
                lists[i] = lists[i].next;
            }
        }
        if (save.size() < 1) {
            return result;
        }

        Collections.sort(save);
        for (Integer e : save) {
            if (result == null) {
                result = new ListNode(e);
                cp = result;
            }else {
                cp.next = new ListNode(e);
                cp = cp.next;
            }
        }

        return result;
    }
}
