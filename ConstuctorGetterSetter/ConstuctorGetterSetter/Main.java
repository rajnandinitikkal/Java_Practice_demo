package ConstuctorGetterSetter;

public class Main {
    public static void main(String[] args) {
        
        smartphone phone =new smartphone("Samsung");
        System.out.println(phone.grtBrand());

        car car =new car("Closed", "off", "Not-Seated", 0);
        
        car.setDoors(null);
        car.run();
        car.setDriver(null);

        car.setSpeed(0);

        System.out.println(car.getSpeed());
        System.out.println(car.getEngine());
        // System.out.println(car.getDriver());
        System.out.println(car);
    }
}
