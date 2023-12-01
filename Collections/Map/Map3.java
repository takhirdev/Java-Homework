package Map;
import java.util.*;

public class Map3 {
    public static void main(String[] args) {
        HashMap map1 = new HashMap<>();
        map1.put("book","kitob");
        map1.put("pencil","qalam");
        map1.put("notebook","daftar");
        map1.put("pen","ruchka");
        map1.put("bag","ryugzak");

        HashMap map2 = (HashMap) map1.clone();

        // map convert to list and print
        Set<Map.Entry> entrySet = map2.entrySet();
        List list = new ArrayList(entrySet);
        System.out.println(list);

        // map convert to list and print using foreach method
        List<Map.Entry> entryList = new ArrayList<Map.Entry>(map2.entrySet());
        for (Map.Entry entry : entryList){
            System.out.println(entry);
        }
    }
}
