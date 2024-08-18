package LinkedList;

public class InterSectionOfLinkedList {
    public static void main(String[] args) {

    }

    public class ListNode {

        int val;
         ListNode next;
         ListNode(int x) {
 val = x;
 next = null;
 }
     }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        while (headA != null) {
//
//            ListNode temp= headB;
//            while (headB != null) {
//                if (temp == headA) {
//                    return headA;
//                }
//                temp = headB.next;
//            }
//            headA = headA.next;
//        }
//        return null;

        if(headA == null || headB==null) return null ;
        ListNode a  =  headA ;
        ListNode b = headB ;
        while(a != b){
            a=a== null?headA:a.next ;
            b=b==null?headB:b.next ;
        }

        return a;
    }

}


