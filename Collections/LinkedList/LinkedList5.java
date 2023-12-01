package LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedList5 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList<>();
        linkedList.add(12);
        linkedList.add(7);
        linkedList.add(35);
        linkedList.add(23);
        linkedList.add(3);
        linkedList.add(41);
        System.out.println("before using swap method -> " + linkedList);
        Collections.swap(linkedList,1,3);
        System.out.println("after using swap method -> " + linkedList);

        // linkedList to arraylist
        ArrayList arrayList = new ArrayList<>(linkedList);
        System.out.println(arrayList);

        // sorted DNSO
        System.out.println("before sorting -> " + linkedList);
        Collections.sort(linkedList);
        System.out.println("after sorting -> " + linkedList);

        // searching elements in linkedList
        boolean a = linkedList.contains(12);
        System.out.println(a);
    }
}
