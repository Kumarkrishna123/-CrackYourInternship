package LinkedList;

public class Zig_ZagFashion {
    public static void main(String[] args) {

    }
    class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }
    public Node zigZag(Node node , int flag){
        if (node == null||  node.next == null) {
            return node  ;
        }

            if (flag==0) {
                if (node.data > node.next.data) {
                    swap(node , node.next);
                }
                return zigZag(node.next , 1) ;
        }
            else {
                if (node.data  < node.next.data) {
                    swap(node , node.next) ;
                }
                return zigZag(node.next , 0) ;
            }
    }

    private void swap(Node a, Node b) {
        if (a == null ||  b==null) {
             return;
        }
        int temp =  a.data ;
        a.data = b.data ;
        b.data = temp ;
    }
    private  Node head ;
    public void printLL()
    {
        Node t = head;
        while (t != null) {
            System.out.print(t.data + " ->");
            t = t.next;
        }
        System.out.println();
    }
}
