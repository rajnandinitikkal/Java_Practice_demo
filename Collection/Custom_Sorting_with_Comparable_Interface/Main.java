package Collection.Custom_Sorting_with_Comparable_Interface;

import java.util.Comparator;
//import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class Data<k extends Integer, v extends String>{
    private k key;
    private v value;

    public Data(k key, v value) {
        this.key = key;
        this.value = value;
    }

    public k getKey() {
        return key;
    }

//    public v getValue() {
//        return value;
//    }

    @Override
    public String toString() {
        return "Data{" +
                "key=" + key +
                ", value='" + value + '\'' +
                '}';
    }
}
public class Main {
    public static void main(String[] args) {

        Comparator<Data<Integer,String>> COMPARE_KEY = new Comparator<Data<Integer, String>>() {
            @Override
            public int compare(Data<Integer, String> o1, Data<Integer, String> o2) {
                if(o1.getKey() < o2.getKey()){
                    return -1;
                }
                else if(o1.getKey() > o2.getKey()){
                    return 1;
                }
                return 0;
            }
        };
        Set<Data<Integer,String>> set = new TreeSet<>(COMPARE_KEY);
        set.add( new Data<>(1, "Rutabaga"));
        set.add( new Data<>(2, "Tush"));
        set.add( new Data<>(3, "Raj"));
        set.add( new Data<>(4, "Nisha"));
        set.add( new Data<>(5, "Nisha"));
        set.add( new Data<>(6, "Joh "));

        for(Data data:set){
            System.out.println(data);
        }
    }
}
