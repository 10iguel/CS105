package DessertShop;

public class IceCream extends DessertItem{
    private int scoopCount;
    private double pricePerScoop;

    public IceCream(){
        this.scoopCount = 0;
        this.pricePerScoop = 0.0;
    }

    public IceCream(int scoopCount, double pricePerScoop) {
        this.scoopCount = scoopCount;
        this.pricePerScoop = pricePerScoop;
    }

    // Getters
    public int getScoopCount() {
        return scoopCount;
    }

    public double getPricePerScoop() {
        return pricePerScoop;
    }

    //Setters
    public void setScoopCount(int scoopCount) {
        this.scoopCount = scoopCount;
    }

    public void setPricePerScoop(double pricePerScoop) {
        this.pricePerScoop = pricePerScoop;
    }
}
