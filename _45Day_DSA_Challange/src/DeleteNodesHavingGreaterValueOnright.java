package LinkedList;

public class DeleteNodesHavingGreaterValueOnright {
    public static void main(String[] args) {

    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

        Node compute(Node head) {
            if (head.next== null) {
                return head;
            }
            Node next = compute(head.next);
            if (next.data <= head.data) {
                head.next = next;
                return head;
            }


            return next;
        }
    }
}

