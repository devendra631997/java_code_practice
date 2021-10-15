package java_collection;

import java.util.*;

public class basic_practice {
    public static void main(String[] args) {
        System.out.println("Working on list's Now integer based");
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        System.out.println("ArrayList ->");
        System.out.println(list);
        ListIterator<Integer> li = list.listIterator();
        while(li.hasNext()){
            System.out.println(li.next());
        }
        List<Integer> llist = new LinkedList<>();
        llist.add(0);
        llist.add(1);
        llist.add(2);
        System.out.println("LinkedList ->");
        System.out.println(llist);
        List<Integer> stack = new Stack<>();
        stack.add(0);
        stack.add(1);
        stack.add(2);
        System.out.println("Stack ->");
        System.out.println(stack);
        System.out.println("Working on list's Now integer based");
        List<String> names = new LinkedList<>();
        names.add("iterate");
        names.add("over");
        names.add("strig");
        ListIterator<String> namesIterator = names.listIterator();
        while(namesIterator.hasNext()){
            System.out.println(namesIterator.next());
        }
        for(String s : names){
            System.out.println(s);
        }
    }
}
