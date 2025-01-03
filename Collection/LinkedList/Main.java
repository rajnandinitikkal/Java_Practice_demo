package Collection.LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

//        LinkedList<String> names = new LinkedList<>();
//        names.add("Rutuja");
//        names.add(2, "Tushar");
//        names.add("Prajkta");
//        names.add("Vishal");
//
//        System.out.println(names);
//
//        names.add("Ritha");
//        names.add(1, "Pallavi");
//        System.out.println(names);

        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Riman");
        list1.add("AAyan");
        list1.add("Radha");
//        System.out.println(list1);

        list1.add(3,"Pavan");
        System.out.println(list1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Krishna");
        list2.add("Balveer");
        list2.add("Pankaj");
//        System.out.println(list2);

        list2.sort(null);
        System.out.println(list2);

        Collections.reverse(list2);
        System.out.println(list2);

list2.add(3,"Shardhha");
//        System.out.println(list2);
    }
}