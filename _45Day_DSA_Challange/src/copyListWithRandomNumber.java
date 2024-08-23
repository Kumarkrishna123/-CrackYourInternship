package LinkedList;

import java.util.HashMap;

public class copyListWithRandomNumber {

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        if (head == null) {
            return head ;
        }
        HashMap<Node ,  Node>  map= new HashMap<>() ;
    // copy all the elements in map
        Node temp  =  head ;
        while (temp !=null) {
            map.put(temp , new Node(temp.val)) ;
            temp   = temp.next ;
        }

        temp =  head ;
        while (temp!=null) {
            map.get(temp).next =  map.get(temp.next) ;
            map.get(temp).random = map.get(temp.random) ;
            temp = temp.next ;
        }


        return map.get(head);
    }

}
