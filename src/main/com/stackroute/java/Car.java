package main.com.stackroute.java;

public class Car
{
    boolean engine;
    int cylinders;
    int wheels;
    String carName;

    public Car(boolean engine, int cylinders, int wheels, String carName) {
        this.engine = engine;
        this.cylinders = cylinders;
        this.wheels = wheels;
        this.carName = carName;
    }

    public boolean isEngine() {
        return engine;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }
    public void startEngine()
    {
        System.out.println("Engine Started");
    }
    public void accelerate()
    {
        System.out.println("Car Accelerated");
    }
    public void brake()
    {
        System.out.println("Brake Applied");
    }
}
