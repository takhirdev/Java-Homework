package Set;
import java.util.*;
public class Set1 {
    public static void main(String[] args) {
        Set <String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("Javascript");
        set.add("Php");

        // pring using iterator
        Iterator <String> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // reverse order
        List <String> list = new ArrayList<>(set);
        Collections.reverse(list);
        System.out.println(list);
    }
}
