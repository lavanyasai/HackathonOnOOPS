package main.com.stackroute.java;

public class BMW extends Car{

    public BMW(boolean engine, int cylinders, int wheels, String carName) {
        super(engine, cylinders, wheels, carName);
    }
    public void startEngine()
    {
        System.out.println("BMW Engine Started");
    }
    public void accelerate()
    {
        System.out.println("BMW Car Accelerated");
    }
    public void brake()
    {
        System.out.println("BMW Brake Applied");
    }
}
