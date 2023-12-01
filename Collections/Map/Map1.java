package Map;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map1 {
    public static void main(String[] args) {
        Map map = new HashMap<>();
        map.put("book","kitob");
        map.put("pencil","qalam");
        map.put("notebook","daftar");
        map.put("pen","ruchka");
        map.put("bag","ryugzak");

        Set <Map.Entry <String, String>> entrySet = map.entrySet();
        for(Map.Entry <String, String> entry : entrySet){
            System.out.println("key : " + entry.getKey() + "    value : " + entry.getValue());
        }
        int size = map.size();
        System.out.println("Map size : " + size);
    }
}
