package DessertShop;

public class Sundae extends DessertItem {
    private String toppingName;
    private double toppingPrice;

    public Sundae(){
        this.toppingName = "";
        this.toppingPrice = 0.0;
    }

    public Sundae(String toppingName, double toppingPrice) {
        this.toppingName = toppingName;
        this.toppingPrice = toppingPrice;
    }
    // Getters

    public String getToppingName() {
        return toppingName;
    }

    public double getToppingPrice() {
        return toppingPrice;
    }

    // Setters


    public void setToppingName(String toppingName) {
        this.toppingName = toppingName;
    }

    public void setToppingPrice(double toppingPrice) {
        this.toppingPrice = toppingPrice;
    }
}
