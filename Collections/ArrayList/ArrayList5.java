import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList5 {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("white");
        list.add("black");
        list.add("green");
        list.add("yellow");
        System.out.println("before swap method : " + list);
        Collections.swap(list, 1, 3);
        System.out.println("after swap method : " + list);

        // create a new list
        List list1 = new ArrayList<>();
        list1.add("Nexia");
        list1.add("Cobalt");
        list1.add("Malibu");
        list1.add("Tracker");

        //  two list add each other
        list.addAll(list1);
        System.out.println(list);
    }
}
