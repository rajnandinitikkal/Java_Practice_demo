package Wildcards_in_Generic;

import java.util.ArrayList;
import java.util.List;

class Vehicle{
    private int id;

    public Vehicle(int id){
        this.id = id;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                '}';
    }
}

class car extends Vehicle{
    private String model;

    public car(int id, String model){
       super(id);
        this.model=model;
    }

    @Override
    public String toString() {
        return "car{" +
                "model='" + model + '\'' +
                "} " + super.toString();
    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Vehicle> list = new ArrayList<>();
        list.add(new Vehicle(11));
        list.add(new Vehicle(12));
        list.add(new Vehicle(87));
        list.add(new Vehicle(12));
        list.add(new car(8, "Payal"));
//        System.out.println(list);
        Main.display(list);
    }

    public static void display(List<?super Vehicle> list){
        for(Object data: list){
            System.out.println(data);
        }
    }
}
