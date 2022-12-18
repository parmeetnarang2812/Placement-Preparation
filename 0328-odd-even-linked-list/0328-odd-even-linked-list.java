/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public ListNode oddEvenList(ListNode head) {
        ListNode ohead = null, ehead = null, otail = null, etail = null;
        int count = 1; //first index(node) is 1.
        while (head != null) {
            if (count % 2 == 1) { // odd nodes
                if (ohead == null) {
                    ohead = otail = head;
                    head = head.next;
                } else {
                    otail.next = head;
                    otail = otail.next;
                    head = head.next;
                }
            } else { // even nodes
                if (ehead == null) {
                    ehead = etail = head;
                    head = head.next;
                } else {
                    etail.next = head;
                    etail = otail.next;
                    head = head.next;
                }
            }
            count++;
        }

        if (ohead == null) {
            return ehead;
        }
        if (ehead == null) {
            return ohead;
        }

        //normal working
        otail.next = ehead;
        etail.next = null;
        return ohead;
    }
    
}
