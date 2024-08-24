package LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlattenLinkedList {
    public static void main(String[] args) {

    }
    class Node{
        int data ;
        Node  next ;
        Node bottom ;
        Node(int x){
            data  =  x;
            next =  null ;
            bottom = null ;
        }

    }

    Node flatten(Node root) {
        List<Integer> arr = new ArrayList<>();

        Node ptr = root;
        while(ptr!=null){
            Node subPtr = ptr.bottom;
            while(subPtr != null){
                arr.add(subPtr.data);
                subPtr = subPtr.bottom;
            }
            arr.add(ptr.data);
            ptr = ptr.next;
        }

        Collections.sort(arr);

        Node n = new Node(arr.get(0));
        Node p = n;
        for(int i=1; i<arr.size(); i++){
            p.bottom = new Node(arr.get(i));
            p = p.bottom;
        }
        return n;

    }
}

