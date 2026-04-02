class Node {
    int data;
    Node next;

    Node(int val){
        this.data = val;
        this.next = null;
    }
}

public class linkedListOperations {

    Node head;
    public void addAtStart(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            return;
        }
        
        newNode.next = head;
        head = newNode;

    }

    public void addAtEnd(int val){

        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            return;
        }

        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;

    }

    public void addAtPosition(int val, int pos){
        Node newNode = new Node(val);

        if(head == null){
            head = newNode;
            return;
        }

        Node curr = head;
        for(int i = 0;i<pos-1;i++){
            curr = curr.next;
        }

        newNode.next = curr.next;
        curr.next = newNode;

    }


    public int deleteAtStart(){

        if(head == null){
            System.out.println("Cannot delete elements from the linkedlist as it is empty");
            return -1;
        }

        int ele = head.data;
        head = head.next;
        return ele;
    }


    public int deleteAtEnd(){
        if(head == null){
            System.out.println("Cannot delete elements from the linkedlist as it is empty");
            return -1;
        }

        Node curr = head;
        while(curr.next.next != null){
            curr= curr.next;
        }
        int ele = curr.next.data;
        curr.next = null;
        return ele;
    }

    public int deleteAtPostion(int pos){
        if(head == null){
            System.out.println("Cannot delete elements from the linkedlist as it is empty");
            return -1;
        }

        Node curr = head;
        for(int i = 0;i<pos-1;i++){
            curr = curr.next;
        }

        int ele = curr.next.data;
        curr.next = curr.next.next;

        return ele;

    }

    public void printList(Node head){
        Node curr = head;

        while(curr != null){
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
       linkedListOperations list = new linkedListOperations();
        list.addAtStart(10);
        list.addAtStart(20);
        list.addAtStart(30);
        list.addAtEnd(40);
        list.addAtEnd(50);
        list.addAtPosition(25, 1);
        System.out.println(list.deleteAtStart());
        System.out.println(list.deleteAtEnd());
        System.out.println(list.deleteAtPostion(1));


     


       list.printList(list.head);


    }
}
