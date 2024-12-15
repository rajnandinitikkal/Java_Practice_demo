package ConstuctorGetterSetter;
// package ConstuctorGetterSetter;

public class car {
    private String doors ;
    private String engine ;
   private String driver;
    private int speed;

    public car(){
        doors ="closed";
        engine ="off";
        driver="seated";
        speed=0;
    }

    public car(String doors,String engine, String driver, int speed) {
        this.doors = doors;
        this.engine = engine;
        this.driver = driver;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getDriver(String driver) {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine( String engine) {
        this.engine = engine;
    }

    public String getDoors() {
        return doors;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    public String run(){
        if(doors.equals("closed") && engine.equals("on") && driver.equals("seated") && speed >0){
            return "running";
        }else{
            return "not running";
        }
    }
}


