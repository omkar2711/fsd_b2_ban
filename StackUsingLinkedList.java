class Node {
    int data;
    Node next;

    Node(int val){
        this.data = val;
        this.next = null;
    }
}


public class StackUsingLinkedList {

    Node top;

    public StackUsingLinkedList(){
        this.top = null;
    }

    void push(int val){
        Node newNode = new Node(val);
        if(top == null){
            top = newNode;
            System.out.println(val + " : Element added to the Stack");
            return;
        }

        System.out.println(val + " : Element added to the Stack");
        newNode.next = top;
        top = newNode;
    }

    int pop(){
        if(top == null){
            System.out.println("Stack Underflow");
            return -1;
        }



        int ele = top.data;
        top = top.next;
        System.out.println(ele + " : element removed from the stack");
        return ele;
    }

    int peek(){
        if(top == null){
            System.out.println("Stack Underflow");
            return -1;
        }
        System.out.println(top.data + " : element is present at the top of the stack");
        return top.data;
    }

    boolean isEmpty(){
        return top == null;
    }

    void printStack(){
        Node curr = top;
        System.out.print("[ ");
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
         System.out.print(" ]");
         System.out.println();
    }



    public static void main(String[] args) {
        StackUsingLinkedList list = new StackUsingLinkedList();


        System.out.println("is Stack Empty? " + list.isEmpty());

        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        list.push(50);
        list.push(60);
        list.printStack();


        list.peek();


        list.pop();
        list.pop();
        list.pop();

        list.printStack();


    }
}
