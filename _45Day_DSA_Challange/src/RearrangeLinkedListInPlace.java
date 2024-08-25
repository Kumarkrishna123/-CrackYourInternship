package LinkedList;

public class RearrangeLinkedListInPlace {

    void reorderlist(Node head) {
        if (head == null || head.next == null) {
            return ;
        }
        Node mid = middleNode(head);
        Node hs =  reverseList(mid) ;
        Node hf =  head ;

        while (hs!=null && hf!=null){
            Node temp = hf.next;
            hf.next = hs  ;
            hf =  temp ;

            temp = hs.next ;
            hs.next = hf ;
            hs =  temp ;
        }
        if (hf != null) {
            hf.next =  null ;

        }
    }

    // / Question no = 876
    public Node middleNode(Node head) {
        Node f =  head ;
        Node s =  head ;
        while (f!=null && f.next != null){
            f =  f.next.next ;
            s= s.next ;
        }

        return s;
    }


    public Node reverseList(Node head){
        if (head == null) {
            return head ;
        }
        Node prev = null ;
        Node present =  head  ;
        Node next =  present.next ;
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
}

