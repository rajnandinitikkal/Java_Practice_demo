package Collection.Collection_Things;

import java.util.*;

class Name implements Comparable<Name>{
    private String name;

    public Name(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Name nmae = (Name) o;
        return Objects.equals(name, nmae.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public int compareTo(Name o) {
        return name.compareTo(o.getName());
    }
}
public class Main {
    public static void main(String[] args) {

        Set<Name> set = new HashSet<>();
        set.add(new Name("Tushar"));
        set.add(new Name("Rutuja"));
        set.add(new Name("Alfiya"));
        set.add(new Name("Pallavi"));
        set.add(new Name("Balu"));

        List<Name> list = new ArrayList<>();
        list.addAll(set);
//        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        System.out.println(Collections.binarySearch(list, new Name("Rutuja")));

    }
} 
