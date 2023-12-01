import java.util.ArrayList;
import java.util.List;

public class ArrayList4 {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("Green");
        list.add("Red");
        list.add("Black");
        list.add("white");

        List list1 = new ArrayList();
        list1.add("Green");
        list1.add("Yellow");
        list1.add("Black");
        list1.add("Blue");

        List result = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            boolean a = list.get(i).equals(list1.get(i));
            result.add(a);
        }
        System.out.println(list + " & " + list1 + " -> result: " +result);
    }
}
