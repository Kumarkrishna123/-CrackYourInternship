package LinkedList;

public class RemoveDuplicatesFromSortedList {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


        public ListNode deleteDuplicates(ListNode head) {
             ListNode temp =  new ListNode(0) ;
            ListNode fast = head   , slow = temp ;
             slow.next = fast  ;

             while (fast!=null){
                 while (fast.next != null && fast.val ==  fast.next.val ){
                       fast = fast.next ;
                 }
                 if (slow.next != fast) {
                     slow.next = fast.next ;
                     fast  = slow.next ;
                 }

                 else {
                     slow = slow.next ;
                     fast = fast.next ;
                 }
             }
            return temp.next;
        }
}
