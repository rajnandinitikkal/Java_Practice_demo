package Collection.LinkedHashset_Hashset_TreeSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<String> set = new LinkedHashSet<>();
        for (int i = 20; i >0 ; i--) {
            set.add("A" + i);

        }
        for(String x:set) {
            System.out.println(x);
        }

        Set<String> set1 = new TreeSet<>();
        for (int i = 20; i >0 ; i--) {
            set1.add("A" + i);

        }
        for(String x:set1) {
            System.out.println(x);
        }

        Set<String> set2 = new HashSet<>();
        for (int i = 20; i >0 ; i--) {
            set2.add("A" + i);

        }
        for(String x:set2) {
            System.out.println(x);
        }


    }
}
