import java.util.LinkedList;

public class Main2 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
    }
    public static Node reverseList(Node head) {
        Node next = null;
        Node prev = null;
        Node current = head; 
        while(current != null){
            next = current.next; 
            current.next = prev; 
            prev = current;
            current = next;
        }
        System.out.println(prev);
        return prev;
    }
    public static class Node{
        Node next;
        int data;

        public Node(int data) { //constructor
            this.data = data; //"this" is for emphazies it refers to the particular object we are running
        }
    }
    public static class LinkedList{
        Node head;

        public LinkedList(int data) {
            this.head = new Node(data);
        }

        public void insert(int data){ //takes in a data value
            if(head == null){ 
                head = new Node(data); //just creates head
                return;
            }
            Node current = head; //has a pointer that stars at the head of the linkedlist
            while(current.next!= null){ // this is how we know if we are not at the end of the linkedlist
                current = current.next;
            }
            current.next = new Node(data);
        }
        // public void prepend(int data){
        //     Node newHead = new Node(data);
        //     newHead.next = head;
        //     head = newHead;
        // }
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
        public void deleteWithValue(int data){
            if(head == null){
                return;
            }
            if(head.data == data){
                head = head.next;
                return;
            }
            Node current = head; 
            while(current.next != null){
                if(current.next.data == data){
                    current.next = current.next.next; 
                    return;
                }
                current = current.next;
            }

        }
        
    }
}