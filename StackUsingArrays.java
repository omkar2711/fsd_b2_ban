

public class StackUsingArrays {

    int arr[];
    int top;
    int capacity;

    public StackUsingArrays(int capacity){
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.top = -1;
    }


    void push(int val){
        if(top == capacity-1){
            System.out.println(" Cannot add " + val + " due to Stack Overflow");
            return;
        }

        top++;
        arr[top] = val;
        System.out.println(val + " : element added to stack");
    }

    int pop(){
        if(top == -1){
            System.out.println("Stack Underflow");
            return -1;
        }

        int ele = arr[top];
        top--;
        System.out.println(ele + " element removed from the stack");
        return ele;
    }

    int peek(){
        if(top == -1){
            System.out.println("Stack Underflow");
            return -1;
        }
        System.out.println(arr[top] + " : element present at the top of the stack");
        return arr[top];
    }

    boolean isEmpty(){
        return top == -1;
    }

    int size(){
        return top+1;
    }

    void printStack(){
        System.out.print("[ ");
        for(int i = 0;i<capacity;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ]");
    }

    public static void main(String[] args) {
        StackUsingArrays st = new StackUsingArrays(5);

        System.out.println("Stack Empty? " + st.isEmpty());
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);

        st.peek();
        st.pop();
        st.peek();

        System.out.println("Stack Empty? " + st.isEmpty());


        st.printStack();


    }
}
