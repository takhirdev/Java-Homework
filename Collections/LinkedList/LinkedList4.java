package LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList4 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList<>();
        LinkedList list2 = new LinkedList<>();
        list.add("green");
        list.add("red");
        list.add("brown");
        list.add("yellow");
        System.out.println("first list -> " + list);
        list2.add("Nexia");
        list2.add("Gentra");
        list2.add("Malibu");
        list2.add("Captiva");
        System.out.println("second list -> " + list2);

        // add two list each other
        list.addAll(list2);
        System.out.println("added first and second lists -> " + list);

        // copy list
        LinkedList copyList  = new LinkedList<>();
        copyList = (LinkedList) list.clone();
        System.out.println( "copy list -> " + copyList);

        // remove first and return list
        list.removeFirst();
        System.out.println("after remove first element -> " + list);
    }
}
