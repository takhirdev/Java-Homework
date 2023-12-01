package Map;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Map2 {
    public static void main(String[] args) {
        Map map1 = new HashMap<>();
        map1.put("book","kitob");
        map1.put("pencil","qalam");
        map1.put("notebook","daftar");

        Map map2 = new HashMap<>();
        map2.put("pen","ruchka");
        map2.put("bag","ryugzak");

        // added two maps each other
        map1.putAll(map2);
        Collection list = map1.values();
        System.out.println(list);

        // clear all maps
        map1.clear();
        map2.clear();
        System.out.println(map1);
        System.out.println(map2);
    }
}
