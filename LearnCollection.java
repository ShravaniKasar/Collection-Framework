import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class LearnCollection {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(7);
        list.add(40);
        list.add(1);


        // System.out.println(Collections.min(list));
        // System.out.println(Collections.max(list));
        // System.out.println(Collections.frequency(list , 1));
        
        Collections.sort(list);
        System.out.println(list);

Collections.sort(list , Comparator.reverseOrder());
System.out.println(list);

    }
}
