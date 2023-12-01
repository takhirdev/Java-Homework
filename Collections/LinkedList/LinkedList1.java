package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("green");
        list.add("red");
        list.add("brown");
        list.add("yellow");

        // print using iterator
        Iterator <String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // print list size
        int size = list.size();
        System.out.println(size);

        // clear list
        list.clear();
        System.out.println(list);
    }
}
