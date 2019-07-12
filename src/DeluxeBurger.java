import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeluxeBurger extends Hamburger {

    final static Double initialPrice = 150.00;
    private List<String> additionList;
    private Additions additions;
    Double finalPrice;

    public DeluxeBurger(String breadRollType, String meat, List<String> additionList) {
        super(breadRollType, meat, additionList);
        this.additionList = additionList;
        additions = new Additions(new ArrayList<>(Arrays.asList(new AdditionsPrices("Chips", 10.00), new AdditionsPrices("Drinks", 20.00))));
    }

    public static Double getInitialPrice() {
        return initialPrice;
    }

    public Double calculateFinalPrice() {
        finalPrice = initialPrice;
        System.out.println("For Deluxe Burger");
        System.out.println("Base Price " + finalPrice);
        for(AdditionsPrices additionsPrices: additions.getAdditions()) {
            System.out.println(additionsPrices.getAdditionName() + " " + additionsPrices.getAdditionPrice());
            finalPrice = finalPrice + additionsPrices.getAdditionPrice();
        }
        System.out.println("Final Price " + finalPrice);
        return finalPrice;
    }


}
