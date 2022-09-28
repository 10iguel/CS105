package DessertShop;

public class Cookie extends DessertItem {
    private int cookieQty;
    private double pricePerDozen;

    public Cookie(){
        super();
        this.cookieQty = 0;
        this.pricePerDozen = 0.0;
    }

    public Cookie(String name, int cookieQty, double pricePerDozen) {
        super(name);
        this.cookieQty = cookieQty;
        this.pricePerDozen = pricePerDozen;
    }

    // Getter

    public int getCookieQty() {
        return cookieQty;
    }

    public double getPricePerDozen() {
        return pricePerDozen;
    }

    // Setters

    public void setCookieQty(int cookieQty) {
        this.cookieQty = cookieQty;
    }

    public void setPricePerDozen(double pricePerDozen) {
        this.pricePerDozen = pricePerDozen;
    }
}
