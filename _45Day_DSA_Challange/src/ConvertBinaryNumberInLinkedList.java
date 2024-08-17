package LinkedList;

public class ConvertBinaryNumberInLinkedList {
    public static void main(String[] args) {
      head  = {}
    }
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public int getDecimalValue(ListNode head) {
        int ans  =0 ;
  for (ListNode temp =  head ;  temp!=null ;temp = temp.next){
         ans = (ans<<1) + temp.val ;
  }
        return ans;
    }
}
