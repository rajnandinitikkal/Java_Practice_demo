package Generic_method_in_java_generic;

// import java.util.ArrayList;
import java.util.List;

class Data{
    public <E> void printListData(List<E> list){
        for (E elements : list) {
            System.out.println(elements);
        }
    }
    public <E> void printArrayData(E[] array){
        for(E elements : array){
            System.out.println(elements);
        }
    }
}

public class gen {
    public static void main(String[] args) {

//        List<Integer> list1 = new ArrayList<>();
//        list1.add(12);
//        list1.add(16);
//        list1.add(30);
//        list1.add(20);
//        list1.add(10);
//        System.out.println(list1);
//        new Data().printListData(list1);

//        List<String> list2 = new ArrayList<>();
//        list2.add("Tushar");
//        list2.add("Rutuja");
//        list2.add("Nisha");
//        list2.add("Sai");
//        list2.add("Pallavi");
//
//        new Data().printListData(list2);

        String[] strdata = {"Tushar","Navin","Shreya"};
        new Data().printArrayData(strdata);

        Integer[] intarray = {1,2,3};
        new Data().printArrayData(intarray);
    }
}
