import java.util.LinkedList;

import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args){
        LinkedList list = new LinkedList(1);
        System.out.println(list.head.data);

        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        
        // System.out.println((head));
    }
    public static Node reverseList(Node head) {
        Node next = null; //stashing the next pointer in order to know where to go next
        Node prev = null;
        Node current = head; 
        while(current != null){
            //current is equal to our head 
            next = current.next; //save next
            current.next = prev; //reverse
            prev = current;
            current = next;
        }
        System.out.println(prev);
        return prev; //return prev because prev is now sitting in our new head
    }
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static class LinkedList {
        Node head;

        public LinkedList(int data) {
            this.head = new Node(data);
        }

        public void insert(int data) {
            if (this.head == null) {
                this.head = new Node(data);
                System.out.println((head));
                return;
            }

            Node currentNode = head;
            while (currentNode != null) {
                if (currentNode.next == null) {
                    currentNode.next = new Node(data);
                    return;
                }
                currentNode = currentNode.next;
            }
        }
        
        public boolean search(int data){
            if (this.head == null) {
                return false;
            }
            else{
                Node currentNode = head;   
                while (currentNode != null) {
                    if (currentNode.data == data)
                    return true;
                    currentNode = currentNode.next;
                }
                return false;

            }
        }

        public void delete(int data){
            Node linkRef = head;
            if (this.head == null) {
                System.out.println(" Empty LinkedList");
                return ;
            }
            else{
                Node currentNode = head;   
                while (currentNode != null) {
                    if (currentNode.data == data)
                    System.out.println(" Not empty LinkedList");
                    currentNode = currentNode.next;
                    return;
                }
                return;
            }
        }
    }
}