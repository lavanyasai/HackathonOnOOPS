package main.com.stackroute.java;

public class Hondacity extends Car {

    public Hondacity(boolean engine, int cylinders, int wheels, String carName) {
        super(engine, cylinders, wheels, carName);
    }
    public void startEngine()
    {
        System.out.println(getCarName()+" Engine Started");
    }
    public void accelerate()
    {
        System.out.println("HondaCity Car Accelerated");
    }
    public void brake()
    {
        System.out.println("HondaCity Brake Applied");
    }
}
