package Map;

import java.util.*;

public class MapSorted {
    public static void main(String[] args) {
        Map<Student, Integer > map = new HashMap<>();
        map.put( new Student("Takhir", 21),1);
        map.put(new Student("Rasulbek", 22),2);
        map.put(new Student("Saodaddin", 20),3);

        // sort using with comparable  KEY
        TreeMap <Student, Integer> treeMap = new TreeMap<>(map);
        System.out.println(treeMap);

        // sort using comparator KEY OR VALUE
        List <Student> list = new ArrayList<>(map.keySet());
        Collections.sort(list,Comparator.comparing(Student ::getAge));
        System.out.println(list);


        System.out.println(map);
        Set<Map.Entry<Student,Integer>> entrySet = map.entrySet();
        for(Map.Entry<Student,Integer> entry : entrySet){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
            }

    }

}
