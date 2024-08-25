package LinkedList;

public class segrigatedEvenOrOdd {
    Node divide(Node head) {
        if (head == null || head.next == null) {
            return head ;
        }
        Node oddStr = null ;
        Node evenStr =  null ;
        Node  prev = null ;
        Node temp =  head ;

        while (temp !=null){
            if (temp.data %2  !=  0  &&  oddStr == null) {
           oddStr  = temp ;
            }
            else if (temp.data %2 ==  0 ) {
                if (oddStr == null) evenStr = temp;
                else {
                    prev.next = temp.next;
                    temp.next = oddStr;
                    if (evenStr == null) {
                        evenStr = temp;
                        head = evenStr;
                    } else {
                        evenStr.next = temp;
                        evenStr = evenStr.next;
                    }
                    temp = prev;
                }
            }
           prev  =  temp ;
            temp = temp.next;
        }


        return head;
    }

}
