/**
 * File: IceCream.java
 * Description: Creating a subclass with the instance of a superclass and overriding with the method's abstract class
 * Lessons Learned: In this lesson I learned how to create an extended class, setting default values and overriding the
 * toString method to all the values
 *
 * @Override public double calculateCost() {
 * return pricePerScoop * scoopCount;
 * }
 * String.format("%s\n\t %-45s %s %17s", getName()
 * Instructor's Name: Barbara Chamberlin
 * @author: Miguel Espinoza.
 * @since: 10/12/2022.
 */
package DessertShop;

public class IceCream extends DessertItem {
    private int scoopCount;
    private double pricePerScoop;

    public IceCream() {
        super();
        this.setPackaging("");
        this.scoopCount = 0;
        this.pricePerScoop = 0.0;
    }

    public IceCream(String name, int scoopCount, double pricePerScoop) {
        super(name);
        this.setPackaging("Bowl");
        this.scoopCount = scoopCount;
        this.pricePerScoop = pricePerScoop;
    }

    // Getters
    public int getScoopCount() {
        if (scoopCount < 0) {
            scoopCount = 0;
        }
        return scoopCount;
    }

    public double getPricePerScoop() {
        if (pricePerScoop < 0) {
            pricePerScoop = 0;
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

    @Override
    public double calculateCost() {
        return pricePerScoop * scoopCount;
    }

    public String toString() {//overriding the toString() method
        String line1 = getName() + " Ice Cream";
        String line2 = getScoopCount() + " scoops @ " + String.format("%.2f", getPricePerScoop())
                + "/scoop :";
        String line3 = "$" + String.format("%.2f", pricePerScoop * scoopCount);
        String line4 = "[Tax:$" + String.format("%.2f", super.calculateTax()) + "]";
        return String.format("%s(%s)\n\t %-45s %s %17s", line1,super.getPackaging(), line2, line3, line4);
    }
}
