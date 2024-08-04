
import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new  LinkedList<>();

        queue.offer(12);  //offer to add element
        queue.offer(24);
        queue.offer(36);
        queue.offer(48);
        System.out.println("" +queue);
        
        System.out.println(queue.poll());   // poll to remove element
        System.out.println("" +queue);


        queue.peek();
        System.out.println(""+queue.peek()); //top element

        

    }
    
}
