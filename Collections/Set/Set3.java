package Set;
import java.util.*;

public class Set3 {
    public static void main(String[] args) {
        HashSet <String>set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("Javascript");
        set.add("Php");
        set.add("Malibu");
        set.add("Nexia");
        set.add("Gentra");
        set.add("Cobalt");
        // clone set
        HashSet <String>cloneSet = new HashSet<>();
        cloneSet = (HashSet<String>) set.clone();
        System.out.println(cloneSet);

        // convert to arraylist
        List <String> list = new ArrayList<>(cloneSet);

        // print only even number of position elements
        int size = list.size();
        for (int i = 1; i < size;) {
            System.out.println(list.get(i));
            i+=2;
        }
    }
}

