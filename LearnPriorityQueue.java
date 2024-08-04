
import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(53);
        pq.offer(24);
        pq.offer(64);
        pq.offer(12);
        System.out.println(pq);

        pq.poll();
        System.out.println(pq);

        pq.peek();
        System.out.println(pq.peek());


    }
    
}
