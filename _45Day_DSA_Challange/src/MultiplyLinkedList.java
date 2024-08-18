package LinkedList;

public class MultiplyLinkedList {
    public static void main(String[] args) {

    }
    class Node
    {
        int data;
        Node next;
        Node(int data) {
            this.data=data;
            this.next = null;
        }
    }


        public long multiplyTwoLists(Node first, Node second) {
            int N = 1000000007 ;
            long n1 = 0 ; long n2 =0 ;
            Node temp  =  first ;
            while (temp!=null){
                n1 = (n1*10)%N + temp.data;
               temp = temp.next;
            }
            Node temp1  =  second ;
            while (temp1!=null){
                 n2 = (n2*10)%N + temp1.data;
                temp1= temp1.next;
            }
            return (n1*n2)%N ;
        }

}
