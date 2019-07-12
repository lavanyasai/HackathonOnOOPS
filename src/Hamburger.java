import java.util.List;

public class Hamburger {

    private String breadRollType;
    private String meat;
    private List<String> additions;

    public Hamburger(String breadRollType, String meat, List<String> additions) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.additions = additions;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public void setBreadRollType(String breadRollType) {
        this.breadRollType = breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public List<String> getAdditions() {
        return additions;
    }

    public void setAdditions(List<String> additions) {
        this.additions = additions;
    }
}
