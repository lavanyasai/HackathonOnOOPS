public class AdditionsPrices {

    private String additionName;
    private Double additionPrice;

    public AdditionsPrices(String additionName, Double additionPrice) {
        this.additionName = additionName;
        this.additionPrice = additionPrice;
    }

    public String getAdditionName() {
        return additionName;
    }

    public void setAdditionName(String additionName) {
        this.additionName = additionName;
    }

    public Double getAdditionPrice() {
        return additionPrice;
    }

    public void setAdditionPrice(Double additionPrice) {
        this.additionPrice = additionPrice;
    }
}
