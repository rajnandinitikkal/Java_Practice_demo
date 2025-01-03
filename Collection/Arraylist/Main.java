package Collection.Arraylist;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> listNames = new ArrayList<>();
        listNames.add("Tushar");
        listNames.add("Rutuja");
        listNames.add("Mayank");
        listNames.add("Rahul");
        listNames.add("Pallavi");
        listNames.add("Tupe");
        listNames.add("Sahil");

        System.out.println(listNames.remove("Rutuja"));
        System.out.println(listNames);
        System.out.println(listNames.set(4, "Steev"));
        System.out.println(listNames);

        System.out.println(listNames.indexOf("Steev"));
        listNames.clone();
        System.out.println(listNames);

//        System.out.println(listNames);

//        for(String temp: listNames){
//            System.out.println(temp);
//        }

//        System.out.println(listNames.get(3));
//        listNames.remove(0);
//        System.out.println(listNames);
    }
}