package Inheritance;

public class Bike extends Vehicle {
    private String handle;

    public Bike(){
        handle ="short";
    }

    public Bike(String engine, int fuelTank, int wheels, int seats, String lights, String handle) {
        super(engine, fuelTank, wheels, seats, lights);
        this.handle = handle;
    }

    public String getHandle() {
        return handle;
    }
    @Override
    public String run(){
        return "Running Bike";
    }

    @Override
    public String toString() {
        return "Bike{" +
                "handle='" + handle + '\'' +
                "} " + super.toString();
    }
}

