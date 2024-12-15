package Inheritance;

public class Vehicle {
    public String engine;
    public int wheels;
    public int seats;
    public int fuelTank;
    public String lights;

    public Vehicle() {
        engine ="petrol";
        wheels=2;
        seats =2;
        fuelTank =14;
        lights = "led";
    }

    public Vehicle(String engine, int fuelTank, int wheels, int seats, String lights) {
        this.engine = engine;
        this.fuelTank = fuelTank;
        this.wheels = wheels;
        this.seats = seats;
        this.lights = lights;
    }

    public String getEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getSeats() {
        return seats;
    }

    public int getFuelTank() {
        return fuelTank;
    }

    public String getLights() {
        return lights;
    }
    public String run(){
        return "Running vehicle";
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "engine='" + engine + '\'' +
                ", wheels=" + wheels +
                ", seats=" + seats +
                ", fuelTank=" + fuelTank +
                ", lights='" + lights + '\'' +
                '}';
    }
}
