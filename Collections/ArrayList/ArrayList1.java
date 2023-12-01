import java.util.ArrayList;
import java.util.List;
public class ArrayList1 {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("white");
        list.add("black");
        list.add("green");
        list.add("yellow");
        list.add("brown");
        list.add("blue");
        list.add("dark");
        System.out.println(list);
        list.set(0,"red");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("List size " + list.size());
    }
}
