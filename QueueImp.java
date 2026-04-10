import java.util.LinkedList;
import java.util.Queue;

public class QueueImp {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();


        //enqueue
        System.out.println("Adding elements to the queue...");
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);


        System.out.println("Queue elements are : " + q );


        //dequeue : remove from the front
        System.out.println("Removed : " +  q.poll());
        System.out.println("Removed : " +  q.poll());

        //peek
        System.out.println("Font of the Queue: " + q.peek());


         System.out.println("Queue elements are : " + q );


    }
}
