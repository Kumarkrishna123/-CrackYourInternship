package LinkedList;
class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data ;
        next = next ;
    }
}
public class SortLinkedList {
    public static void printList(Node node) {
        while (node!=null){

            System.out.println(""  +  node.data);
            node =  node.next ;

        }
        System.out.println();
    }
   public static  void sortList(Node head){
        int[] cnt  ={0,0,0} ;
        Node ptr=  head ;

        while (ptr!=null){
            cnt[ptr.data]+=1 ;
            ptr= ptr.next ;
        }
        int idx = 0 ;
        ptr  = head ;

        while (ptr!=null){
            if (cnt[idx]  == 0) {
                idx+=1 ;
            }
            else {
                ptr.data = idx ;
                cnt[idx] -=1 ;
                ptr =  ptr.next ;
            }


        }
   }
}
