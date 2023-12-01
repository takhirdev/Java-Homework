package Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Set5 {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(7);
        set1.add(13);
        set1.add(6);
        set1.add(21);
        set1.add(3);
        HashSet<Integer>set2 = new HashSet<>();
        set2.add(12);
        set2.add(13);
        set2.add(27);
        set2.add(9);
        set2.add(3);

        // contain elements of first set
        List list = new ArrayList<>();
        Iterator <Integer> iterator = set1.iterator();
        while (iterator.hasNext()){
            Integer number = iterator.next();
            if (!set2.contains(number)){
                list.add(number);
            }
        }
        System.out.println(set1 + " & " + set2 + " -> result: " + list);

        // contain elements of second set
        List <Integer> list2 = new ArrayList<>();
        for (Integer s2 : set2) {
            if (!set1.contains(s2)){
                list2.add(s2);
            }
        }
        System.out.println(set1 + " & " + set2 + " -> result: " + list2);

        // return only even number of positin elements
        List <Integer> convertToList1 = new ArrayList<>(set1);
        List <Integer> convertToList2 = new ArrayList<>(set2);
        List <Integer> list3 = new ArrayList<>();
        for (int i = 1; i < convertToList1.size();) {
            list3.add(convertToList1.get(i));
            i+=2;
        }
        for (int i = 1; i < convertToList2.size();) {
            list3.add(convertToList2.get(i));
            i+=2;
        }
        System.out.println(list3);
    }
}
