import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayList3 {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        // reverse order
        Collections.reverse(list);
        System.out.println(list);

        // substring arrraylist
        List newList = list.subList(1,3);
        System.out.println(newList);
    }
}
