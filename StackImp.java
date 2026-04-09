import java.util.Stack;

public class StackImp {
    public static void main(String[] args) {
    
        Stack<Integer> s = new Stack<>();

        System.out.println("is stack empty? " + s.empty());


        System.out.println("Pushed element: " + s.push(10));
        System.out.println("Pushed element: " + s.push(20));
        System.out.println("Pushed element: " + s.push(30));
      
        System.out.println(s);
        System.out.println("is stack empty? " + s.empty());

        System.out.println("Element present at the top: " + s.peek());

        System.out.println("Popped element: " + s.pop());
        System.out.println("Popped element: " + s.pop());
        System.out.println("Popped element: " + s.pop());
        System.out.println("Popped element: " + s.pop());
        System.out.println("is stack empty? " + s.empty());

        System.out.println(s);


       
    }
}
