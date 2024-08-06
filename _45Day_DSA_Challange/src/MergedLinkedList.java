package LinkedList;

public class MergedLinkedList {
    public static void main(String[] args) {
        ListNode[] list1 = new ListNode[]{1, 2, 4};
    int[ ]list2 ={1,3,4} ;
        System.out.println(mergeTwoLists(list1 , list2));
    }
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
           return list1 ;
        }
        if (list1.val < list2.val) {
            list1.next =mergeTwoLists(list1.next , list2) ;
           return list1 ;
        }
        else {
            list2.next =  mergeTwoLists(list1 , list2.next) ;
            return list2 ;
        }
    }

    }
