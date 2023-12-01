package LinkedList;

import java.util.*;

public class LinkedList2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("green");
        list.add("red");
        list.add("brown");
        list.add("yellow");

        // print reverse order
        reverseOrder(list);

        // add elements first and last
        list.addFirst("BLUE");
        list.addLast("DARK");
        System.out.println(list);

        // print first and last element
        System.out.println("first element -> " + list.getFirst());
        System.out.println("last element -> " + list.getLast());
    }
    static void reverseOrder(List list){
        Collections.reverse((List<?>) list);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
