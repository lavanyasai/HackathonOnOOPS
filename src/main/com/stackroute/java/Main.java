package main.com.stackroute.java;

public class Main {
    public static void main(String[] args) {
        Car car = new Hondacity(true,4,4,"HondaCity");
        car.startEngine();
        car.accelerate();
        car.brake();
        Car car1= new BMW(true,4,4,"BMW");
        car1.startEngine();
        car1.accelerate();
        car1.brake();
        Car car2 = new Audi(true,4,4,"Audi");
        car2.startEngine();
        car2.accelerate();
        car2.brake();


    }
}
