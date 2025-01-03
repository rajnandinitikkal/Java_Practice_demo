package Collection.Comparable_Interface;

import java.util.LinkedList;
import java.util.List;

class Name implements Comparable<Name>{
    private String name;

    public Name(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Name obj) {
        if(name.length() == obj.name.length()){
            return 0;
        }
        else if(name.length() > obj.name.length()){
            return -1;
        }
        else{
            return 1;
        }

    }
}

public class Main {
    public static void main(String[] args) {

//        String x = "b";
//        String y = "t";
//
//        System.out.println(x.compareTo(y));

        List<Name> elements = new LinkedList<>();
        elements.add(new Name("Rutuja"));
        elements.add(new Name("Raj"));
        elements.add(new Name("Ritha"));
        elements.add(new Name("Pooja"));
        elements.add(new Name("Priya"));

        System.out.println(elements);

        elements.sort(null);
        System.out.println(elements);


    }
}