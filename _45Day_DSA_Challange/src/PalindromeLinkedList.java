package LinkedList;

public class PalindromeLinkedList {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public boolean isPalindrome(ListNode head) {
        ListNode mid =  middleNode(head) ;
        ListNode headSecond  =  reverseList(mid) ;
        ListNode reReverseHead = headSecond ;

        while (head!=null && headSecond !=null)
        {
            if (head.val != headSecond.val) {
                break;
            }
            head =  head.next ;
            headSecond =  headSecond.next ;
        }
        reverseList(reReverseHead) ;
        return head == null || headSecond==null ;
    }

    public ListNode reverseList(ListNode head){
        if (head == null) {
            return head ;
        }
        ListNode prev = null ;
        ListNode present =  head  ;
        ListNode next =  present.next ;
        while (present!=null){
            present.next =  prev ;
            prev =  present ;
            present = next ;
            if (next != null) {
                next =  next.next ;
            }
        }

        return prev;
    }
    // Question no = 876
    public ListNode middleNode(ListNode head) {
        ListNode f =  head ;
        ListNode s =  head ;
        while (f!=null && f.next != null){
            f =  f.next.next ;
            s= s.next ;
        }

        return s;
    }

}
