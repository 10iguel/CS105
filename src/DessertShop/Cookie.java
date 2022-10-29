/**
 * File: Cookie.java
 * Description: Creating a subclass with the instance of a superclass
 * Lessons Learned: In this lesson I learned how to create an extended class and setting default values
 * for the attributes and overriding the toString method to all the values.
 * Validations if there are negative values entered
 * Adding the value of the interface and calling with super
 * String.format("%s\n\t %-45s %s %17s", getName() + " " + " Cookie",
 * super.getPackaging()
 *
 * @Override public double calculateCost() {
 * return cookieQty * pricePerDozen/12;
 * }
 * Instructor's Name: Barbara Chamberlin
 * @author: Miguel Espinoza.
 * @since: 10/14/2022.
 */

package DessertShop;

import java.util.Objects;

public class Cookie extends DessertItem implements SameItem<Cookie> {
    private int cookieQty;
    private double pricePerDozen;

    public Cookie() {
        super();
        this.setPackaging("");
        this.cookieQty = 0;
        this.pricePerDozen = 0;
    }

    public Cookie(String name, int cookieQty, double pricePerDozen) {
        super(name);
        this.setPackaging("Box");
        this.cookieQty = cookieQty;
        this.pricePerDozen = pricePerDozen;
    }

    // Getter

    public int getCookieQty() {
        if (cookieQty < 0) {
            cookieQty = 0;
        }
        return cookieQty;
    }

    public double getPricePerDozen() {
        if (pricePerDozen < 0) {
            pricePerDozen = 0;
        }
        return pricePerDozen;
    }

    // Setters

    public void setCookieQty(int cookieQty) {
        this.cookieQty = cookieQty;
    }

    public void setPricePerDozen(double pricePerDozen) {
        this.pricePerDozen = pricePerDozen;
    }

    @Override
    public double calculateCost() {
        return cookieQty * pricePerDozen / 12;
    }

    public String toString() {//overriding the toString() method
        String line1 = getName() + " " + " Cookie";
        String line2 = getCookieQty() + " cookies @ " + String.format("%.2f", getPricePerDozen()) + "/dozen:";
        String line3 = "$" + String.format("%.2f", (pricePerDozen * cookieQty) / 12);
        String line4 = "[Tax:$" + String.format("%.2f", super.calculateTax()) + "]";

        return String.format("%s(%s)\n\t %-45s %s %17s", line1,super.getPackaging(), line2, line3, line4);
    }

    public boolean isSameAs(Cookie same) {
        return Objects.equals(same.getName(), this.getName()) && same.getPricePerDozen() == this.getPricePerDozen();
    }
}
