/**
 * File: Sundae.java
 * Description: Creating a subclass with the instance of a superclass
 * Lessons Learned: In this lesson I learned how to create an extended class and setting default values
 * for the attributes and override the toString method to all the values.
 * this.toppingName = toppingName;
 * this.toppingPrice = toppingPrice;
 * }
 * Validations if there are negative values entered
 * String.format("%s\n\t %s\n\t %-45s %s %17s",
 * getToppingName())
 *
 * @Override public double calculateCost() {
 * return super.calculateCost() + toppingPrice;
 * }
 * Instructor's Name: Barbara Chamberlin
 * @author: Miguel Espinoza.
 * @since: 10/12/2022.
 */

package DessertShop;

public class Sundae extends IceCream {
    private String toppingName;
    private double toppingPrice;

    public Sundae() {
        super();
        this.setPackaging("");
        this.toppingName = "";
        this.toppingPrice = 0.0;
    }

    public Sundae(String name, int scoopCount, double pricePerScoop, String toppingName, double toppingPrice) {
        super(name, scoopCount, pricePerScoop);
        this.setPackaging("Boat");
        this.toppingName = toppingName;
        this.toppingPrice = toppingPrice;
    }
    // Getters

    public String getToppingName() {
        if (toppingPrice < 0) {
            toppingPrice = 0;
        }
        return toppingName;
    }

    public double getToppingPrice() {
        if (toppingPrice < 0) {
            toppingPrice = 0;
        }
        return toppingPrice;
    }

    // Setters


    public void setToppingName(String toppingName) {
        this.toppingName = toppingName;
    }

    public void setToppingPrice(double toppingPrice) {
        this.toppingPrice = toppingPrice;
    }

    @Override
    public double calculateCost() {
        return super.calculateCost() + toppingPrice;
    }

    public String toString() {//overriding the toString() method
        String line1 = getToppingName() + " " + getName() + " Sundae";
        String line2 = getScoopCount() + " scoops of " + getName() + " ice cream @ $" +
                String.format("%.2f", super.getPricePerScoop()) + "/scoop";
        String line3 = getToppingName() + " topping @ $" + String.format("%.2f", getToppingPrice()) + ":";
        String line4 = "$" + String.format("%.2f", (super.calculateCost() + getToppingPrice()));
        String line5 = "[Tax:$" + String.format("%.2f", super.calculateTax()) + "]";

        return String.format("%s(%s)\n\t %s\n\t %-45s %s %17s", line1,super.getPackaging(), line2, line3, line4, line5);
    }
}
