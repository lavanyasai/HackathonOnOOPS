package main.com.stackroute.java;

public class Audi extends Car {

    public Audi(boolean engine, int cylinders, int wheels, String carName) {
        super(engine, cylinders, wheels, carName);
    }
    public void startEngine()
    {
        System.out.println("Audi Engine Started");
    }
    public void accelerate()
    {
        System.out.println("Audi Car Accelerated");
    }
    public void brake()
    {
        System.out.println("Audi Car Brake Applied");
    }
}
