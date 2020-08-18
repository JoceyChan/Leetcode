public class Main {
    public static void main(String[] args){

    }
    public static ListNode sortList(ListNode head) {
        
    }

    public class ListNode{
        int data;
        ListNode next;

        ListNode(int data){
            this.data = data;
        }
    }

    public static class LinkedList{
        ListNode head;

        public LinkedList(int data) {
            this.head = new ListNode(data);
        }

        public void insert(int data){ //takes in a data value
            if(head == null){ 
                head = new ListNode(data); //just creates head
                return;
            }
            ListNode current = head; //has a pointer that starts at the head of the linkedlist
            while(current.next!= null){ // this is how we know if we are not at the end of the linkedlist
                current = current.next;
            }
            current.next = new ListNode(data);
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
                ListNode currentNode = head;   
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
            ListNode current = head; 
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