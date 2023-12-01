package Map;
import java.util.TreeMap;

public class Map4 {
    public static void main(String[] args) {
        TreeMap <Integer, String> map = new TreeMap<>();
        map.put(12,"Takhir");
        map.put(9,"Rasulbek");
        map.put(21,"Saodaddin");
        map.put(3,"Yarashbek");
        map.put(17,"Temur");
        System.out.println(map);
        System.out.println("map keys : " + map.keySet());
        System.out.println("map keys reverse order : " + map.descendingKeySet());
        System.out.println("first element in map : " + map.pollFirstEntry());
        System.out.println("last element in map : " + map.pollLastEntry());
    }
}
