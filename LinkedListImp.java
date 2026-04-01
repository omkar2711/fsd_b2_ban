class Node {
    int data;
    Node next; // reference to the next node in the list
    // Node prev;  

    Node(int val){
        this.data = val;
        this.next = null; // new node starts with no link
        // this.prev = null;
    }
}


public class LinkedListImp {


    public static void printLinkedListForward(Node n1){
        Node curr = n1; // start traversal from the head node

        while(curr != null){
            System.out.print(curr.data + " -> ");
            curr = curr.next; // move to the next linked node
        }
        System.out.print("null");

    }

    // public static void printLinkedListBackward(Node n4){
    //      Node curr = n4;

    //     while(curr != null){
    //         System.out.print(curr.data + " -> ");
    //         curr = curr.prev;
    //     }
    //     System.out.print("null");

    // }
    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);

        n1.next = n2; // link first node to second
        n2.next = n3; // link second node to third
        n3.next = n4; // link third node to fourth
        n4.next = n1; // link fourth back to first (circular list)

        // n4.prev = n3;
        // n3.prev = n2;
        // n2.prev = n1;


        // printLinkedListBackward(n4);
    }
}
