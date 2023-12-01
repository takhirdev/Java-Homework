package Set;
import java.util.HashSet;
import java.util.Set;

public class Set2 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Malibu");
        set.add("Nexia");
        set.add("Gentra");
        set.add("Cobalt");

        // Print set size
        int size = set.size();
        System.out.println(size);

        // set is empty or not
        boolean isHave = set.isEmpty();
        System.out.println(isHave);

        // clear set
        set.clear();
        System.out.println(set);
    }
}
