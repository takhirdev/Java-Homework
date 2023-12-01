package Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Map5 {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(12,"Takhir");
        map.put(9,"Rasulbek");
        map.put(21,"Saodaddin");
        map.put(3,"Yarashbek");
        map.put(17,"Temur");

        // print to input key
        System.out.println(map.headMap(17));

        // map keys convert to TreeSet
        Set treeSet = new TreeSet<>(map.keySet());
        System.out.println(treeSet);

        // clear the map
        map.clear();
        System.out.println(map);
    }
}
