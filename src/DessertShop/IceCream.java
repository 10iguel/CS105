package DessertShop;

public class IceCream extends DessertItem{
    private int scoopCount;
    private double pricePerScoop;

    public IceCream(){
        super();
        this.scoopCount = 0;
        this.pricePerScoop = 0.0;
    }

    public IceCream(String name,int scoopCount, double pricePerScoop) {
        super(name);
        this.scoopCount = scoopCount;
        this.pricePerScoop = pricePerScoop;
    }

    // Getters
    public int getScoopCount() {
        if(scoopCount<0){
            scoopCount=0;
        }
        return scoopCount;
    }

    public double getPricePerScoop() {
        if(pricePerScoop<0){
            pricePerScoop=0;
        }
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
