package DessertShop;

public class Candy extends DessertItem {
    private double candyWeight;
    private double pricePerPound;

    public Candy(){
        super();
        this.candyWeight = 0;
        this.pricePerPound = 0;
    }

    public Candy(String name ,double candyWeight, double pricePerPound) {
        super(name);
        this.candyWeight = candyWeight;
        this.pricePerPound = pricePerPound;
    }

    // getters
    public double getCandyWeight() {
        return candyWeight;
    }

    public double getPricePerPound() {
        return pricePerPound;
    }

    // Setters
    public void setCandyWeight(double candyWeight) {
        this.candyWeight = candyWeight;
    }

    public void setPricePerPound(double pricePerPound) {
        this.pricePerPound = pricePerPound;
    }
}
