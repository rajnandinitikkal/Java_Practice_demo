package Array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] names ={"Raj", "Pooja","Snehal"};

        for (String name :
                names){
        System.out.println(name);
         }

        int[] arr;
        arr = new int[20];
        arr[2] = 12;
        System.out.println(arr[2]);

        float[] arr1 = {21.0f, 33f};
        arr1[2] = 34.2f;
        for (int i =0; i<arr1.length; i++) {
            System.out.println(arr1[i]);
        }
//
//        String[] names = {"Study", "Easy", "Tush"};
//        names = new String[10];
//        names[9] = "Rutuja";

        System.out.println(names[9]);

        System.out.println(names.length);

    }
}
