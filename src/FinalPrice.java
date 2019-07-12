import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FinalPrice {

    public static void main(String[] args) {
        HealthyBurger healthyBurger = new HealthyBurger("Brown Rye Bread Roll", "Steak", new ArrayList<String>(Arrays.asList("Tomato", "Carrot")));
        List<AdditionsPrices> healthyAdditionsPricesList = new ArrayList<>();
        healthyAdditionsPricesList.add(new AdditionsPrices("Lettuce", 10.00));
        healthyAdditionsPricesList.add(new AdditionsPrices("Tomato", 10.00));
        healthyAdditionsPricesList.add(new AdditionsPrices("Carrot", 15.00));
        healthyAdditionsPricesList.add(new AdditionsPrices("Green Leaf", 20.00));
        Additions healthyAdditions = new Additions(healthyAdditionsPricesList);
        healthyBurger.setAdditions(healthyAdditions);
        System.out.println("Healthy Burger Cost = " + healthyBurger.calculateFinalPrice() + " with Add-ons\n");

        DeluxeBurger deluxeBurger = new DeluxeBurger("Brown Rye Bread Roll", "Steak", new ArrayList<String>(Arrays.asList("Chips", "Drinks")));
        System.out.println("Deluxe Burger Cost = " + deluxeBurger.calculateFinalPrice() + " with Chips and Drinks");
    }
}
