package Collection.sets;


import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("Rutuja");
        set.add("Pallavi");
        set.add("shardul");
        set.add("Anjali");

        for(String name:set){
            System.out.println(name);
        }

        System.out.println(set);
        System.out.println(set.contains("Tushar"));
    }
}
