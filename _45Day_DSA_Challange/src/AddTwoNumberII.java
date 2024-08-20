package LinkedList;

import LinkedList.AddTwoNumbers;
import LinkedList.ReverseLinkedList;

public class AddTwoNumberII {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       l1 = reverseList(l1) ;
         l2 = reverseList(l2) ;
         ListNode ans  =  helper(l1, l2) ;
         return reverseList(ans) ;
    }

    private ListNode helper(ListNode l1, ListNode l2) {

        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int digit1 = (l1 != null) ? l1.val : 0;
            int digit2 = (l2 != null) ? l2.val : 0;

            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            ListNode newNode = new ListNode(digit);
            tail.next = newNode;
            tail = tail.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        ListNode result = dummyHead.next;
        dummyHead.next = null;
        return result;
    }

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head ;
        }
        ListNode prev =  null ;
        ListNode present = head  ;
        ListNode next =  present.next ;
        while(present!=null){
            present.next = prev ;
            prev =  present  ;
            present =  next   ;
            if (next != null) {
                next =  next.next ;
            }
            head = prev;
        }

        return prev;
    }
}
