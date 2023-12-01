package Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Set4 {
    public static void main(String[] args) {
        HashSet <String> set1 = new HashSet<>();
        set1.add("Eshmat");
        set1.add("Toshmat");
        set1.add("Qodirali");
        set1.add("Mastona");
        set1.add("Chingiz");
        HashSet <String> set2 = new HashSet<>();
        set2.add("Gulchapchap");
        set2.add("Toshmat");
        set2.add("Qodirali");
        set2.add("Halima");
        set2.add("Chingiz");

        // Comparing two HashSets and return similar elements
        List <String> list = new ArrayList<>();
        for (String s : set1) {
            if (set2.contains(s)){
                list.add(s);
            }
        }
        System.out.println(set1 + " & " + set2 + " -> result: " + list);

        // comparing two hashset and unsimilar elements
        List <String> list2 = new ArrayList<>();
        for (String s : set1) {
            if (!set2.contains(s)){
                list2.add(s);
            }
        }
        for (String s2 : set2) {
            if (!set1.contains(s2)){
                list2.add(s2);
            }
        }
        System.out.println(set1 + " & " + set2 + " -> result: " + list2);
    }
}
