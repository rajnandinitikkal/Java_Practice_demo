package Collection.Autiboxing_Unboxing;

import java.util.ArrayList;

class IntWrapper{
    public int num;

    public IntWrapper(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
public class Main {
    public static void main(String[] args) {

//        ArrayList<Integer> numberList = new ArrayList<>();
//        numberList.add(25);  // autoboxing
//        numberList.add(28);
//        System.out.println(numberList); // unboxing

//        ArrayList<IntWrapper> numberList2 = new ArrayList<>();
//        numberList2.add(new IntWrapper(34));
//        System.out.println(numberList2.get(0).getNum());

        ArrayList<Double> number = new ArrayList<>();
        number.add(Double.valueOf(67.4));
        System.out.println(number);
        System.out.println(number.get(0).doubleValue());

    }
}
