package Inheritance;

public class Car extends Vehicle {
    private String steering;
    private String musicSystem;
    private String airConditioner;
    private String fridge;
    private String entertainmentSystems;

    public Car(){
        steering ="honda";
        musicSystem ="DJ";
        airConditioner="AC";
        fridge="index";
        entertainmentSystems="kids";
    }

    public Car(String engine, int fuelTank, int wheels, int seats, String lights, String musicSystem, String steering, String airConditioner, String fridge, String entertainmentSystems) {
        super(engine, fuelTank, wheels, seats, lights);
        this.musicSystem = musicSystem;
        this.steering = steering;
        this.airConditioner = airConditioner;
        this.fridge = fridge;
        this.entertainmentSystems = entertainmentSystems;
    }

    public String getSteering() {
        return steering;
    }

    public String getMusicSystem() {
        return musicSystem;
    }

    public String getAirConditioner() {
        return airConditioner;
    }

    public String getFridge() {
        return fridge;
    }

    public String getEntertainmentSystems() {
        return entertainmentSystems;
    }

    @Override
    public String toString() {
        return "Car{" +
                "steering='" + steering + '\'' +
                ", musicSystem='" + musicSystem + '\'' +
                ", airConditioner='" + airConditioner + '\'' +
                ", fridge='" + fridge + '\'' +
                ", entertainmentSystems='" + entertainmentSystems + '\'' +
                "} " + super.toString();
    }

}
