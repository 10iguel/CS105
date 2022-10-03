/**
 * File: Cookie.java
 * Description: Creating a subclass with the instance of a superclass
 * Lessons Learned: In this lesson I learned how to create an extended class and setting default values
 * for the attributes.
 *     extends, super, super()
 *     public class Cookie extends DessertItem
 *     default constructor
 *     public Cookie() {
 *         super();
 *         this.cookieQty = 0;
 *         this.pricePerDozen = 0.0;
 *     }
 *     constructor with arguments
 *     public Cookie(String name, int cookieQty, double pricePerDozen) {
 *         super(name);
 *         this.cookieQty = cookieQty;
 *         this.pricePerDozen = pricePerDozen;
 *     }
 *     Validations if there are negative values entered
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: Miguel Espinoza.
 * @since: 09/28/2022.
 */

package DessertShop;

public class Cookie extends DessertItem {
    private int cookieQty;
    private double pricePerDozen;

    public Cookie() {
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
}
