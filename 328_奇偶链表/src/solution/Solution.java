package solution;

import java.io.LineNumberReader;

/**
 * @author 姓名
 * @date 2022/3/14
 */
public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode oddHead = head;
        ListNode oddCur = oddHead;

        ListNode evenHead = head.next;
        ListNode evenCur = evenHead;

        while (evenCur != null && evenCur.next != null) {
            oddCur.next = oddCur.next.next;
            evenCur.next = evenCur.next.next;

            oddCur = oddCur.next;
            evenCur = evenCur.next;
        }

        oddCur.next = evenHead;
        return oddHead;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {

        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
