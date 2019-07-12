import java.util.ArrayList;
import java.util.List;

public class HealthyBurger extends Hamburger{

    final static Double initialPrice = 100.00;
    private Additions additions;
    private List<String> additionList;
    Double finalPrice;

    public HealthyBurger(String breadRollType, String meat, List<String> additions) {
        super(breadRollType, meat, additions);
        this.additionList = additions;
    }

    public static Double getInitialPrice() {
        return initialPrice;
    }

    public void setAdditions(Additions additions) {
        this.additions = additions;
    }

    public Double calculateFinalPrice() {
        finalPrice = initialPrice;
        System.out.println("For Healthy Burger");
        System.out.println("Base Price " + finalPrice);
        for(String add: additionList) {
            for(AdditionsPrices additionsPrices: additions.getAdditions()) {
                if(additionsPrices.getAdditionName().equals(add)) {
                    System.out.println(additionsPrices.getAdditionName() + " " + additionsPrices.getAdditionPrice());
                    finalPrice = finalPrice + additionsPrices.getAdditionPrice();
                }
            }
        }
        System.out.println("Final Price " + finalPrice);
        return finalPrice;
    }

}
