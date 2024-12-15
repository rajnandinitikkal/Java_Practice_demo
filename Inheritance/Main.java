package Inheritance;

public class Main {
    public static void main(String[] args) {

//      Bike bike= new Bike("petrol",21,2,4,"led","short");
        Truck truck =new Truck();
        Car car =new Car("petrol", 21,4,6,"LED","Dolby","Honda","ac","intel","adult");

        car.getEngine();

        System.out.println(car);
        System.out.println(truck);

    }
}
