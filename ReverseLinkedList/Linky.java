import java.util.LinkedList;

public class Linky {
    public static void main(String[] args) {
    }
    public class Node{
        Node next;
        int data;

        public Node(int data) { //constructor
            this.data = data; //"this" is for emphazies it refers to the particular object we are running
        }
    }
    public class LinkedList{
        Node head;

        public void append(int data){ //takes in a data value
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
    }
}