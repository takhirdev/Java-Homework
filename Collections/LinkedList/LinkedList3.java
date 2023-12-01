package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedList3 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("green");
        list.add("red");
        list.add("brown");
        list.add("yellow");
        System.out.println(list);

        // remove element using index
        list.remove(2);
        System.out.println(list);

        // remove and return first and last elements
        String first = list.removeFirst();
        String last = list.removeLast();
        System.out.println(first);
        System.out.println(last);
        System.out.println(list);

        // clear list
        list.clear();
        System.out.println(list);
    }
}

