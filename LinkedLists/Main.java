public class Main{
    public static void main(String[] args){
        Node nodeA = new Node(6);
        Node nodeB = new Node(3);
        Node nodeC = new Node(4);
        Node nodeD = new Node(2);
        Node nodeE = new Node(1);

        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        nodeD.next = nodeE;

        System.out.println("This linked list's length is: (should print 5)");
        System.out.println(countNodes(nodeA));
    }
    static int countNodes(Node head) {
        int count = 1; //keeps track of how many nodes we have seen so far
        Node current = head;
        while(current.next != null){
            current = current.next;
            count += 1;
        }
    return count;
    }
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data; // "this" is for emphazies it refers to the particular object we are running
        }
    }
}