import java.util.ArrayDeque;
public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> Ardeq = new ArrayDeque<>();
        Ardeq.offer(23);
        Ardeq.offerFirst(12);
        Ardeq.offerLast(67);
        System.out.println(Ardeq);

        // System.out.println(Ardeq.poll());
        // System.out.println(Ardeq);


        // System.out.println(Ardeq.pollFirst());
        // System.out.println(Ardeq);


        // Ardeq.pollLast();
        // System.out.println(Ardeq.pollLast());
        // System.out.println(Ardeq);


        System.err.println(""+Ardeq.peekFirst());
        System.err.println(""+Ardeq.peekLast());



        

     }
    
}
