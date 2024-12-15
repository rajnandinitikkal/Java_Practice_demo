package Inheritance;

public class Truck extends  Vehicle {
    private String steering;
    private String musicSystem;
    private String airConditioner;
    private int  container;

    public Truck() {
        steering ="round";
        musicSystem ="dolby";
        airConditioner ="cool";
        container = 80;
    }

    public Truck(String engine, int fuelTank, int wheels, int seats, String lights, String musicSystem, String airConditioner, String steering, int container) {
        super(engine, fuelTank, wheels, seats, lights);
        this.musicSystem = musicSystem;
        this.airConditioner = airConditioner;
        this.steering = steering;
        this.container = container;
    }

    public String getAirConditioner() {
        return airConditioner;
    }

    public int getContainer() {
        return container;
    }

    public String getMusicSystem() {
        return musicSystem;
    }

    public String getSteering() {
        return steering;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "steering='" + steering + '\'' +
                ", musicSystem='" + musicSystem + '\'' +
                ", airConditioner='" + airConditioner + '\'' +
                ", container=" + container +
                "} " + super.toString();
    }
}
