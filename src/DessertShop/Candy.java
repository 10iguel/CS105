/**
 * File: Candy.java
 * Description: Creating a subclass with the instance of a superclass
 * Lessons Learned: In this lesson I learned how to create an extended class and setting default values
 * for the attributes and overriding the  toString method to all the values
 * Validations if there are negative values entered
 * public double calculateCost() {
 * return candyWeight*pricePerPound;
 * }
 * String.format("%s\n\t %-45s %s %17s",
 * getName())
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: Miguel Espinoza.
 * @since: 10/12/2022.
 */

package DessertShop;

public class Candy extends DessertItem {
    private double candyWeight;
    private double pricePerPound;

    public Candy() {
        super();
        this.setPackaging("");
        this.candyWeight = 0;
        this.pricePerPound = 0;
    }

    public double calculateCost() {
        return candyWeight * pricePerPound;
    }

    public Candy(String name, double candyWeight, double pricePerPound) {
        super(name);
        this.setPackaging("Bag");
        this.candyWeight = candyWeight;
        this.pricePerPound = pricePerPound;
    }

    // getters
    public double getCandyWeight() {

        if (candyWeight < 0) {
            candyWeight = 0;
        }
        return candyWeight;
    }

    public double getPricePerPound() {

        if (pricePerPound < 0) {
            pricePerPound = 0;
        }
        return pricePerPound;
    }

    // Setters
    public void setCandyWeight(double candyWeight) {
        this.candyWeight = candyWeight;
    }

    public void setPricePerPound(double pricePerPound) {
        this.pricePerPound = pricePerPound;

    }

    public String toString() {//overriding the toString() method
        String line1 = getName() + " " + " Candy";
        String line2 = String.format("%.2f", getCandyWeight()) + "lb. @ " + String.format("%.2f",
                getPricePerPound()) + "/lb.:";
        String line3 = "$" + String.format("%.2f", pricePerPound * candyWeight);
        String line4 = "[Tax:$" + String.format("%.2f", super.calculateTax()) + "]";
        return String.format("%s(%s)\n\t %-45s %s %17s", line1,super.getPackaging(), line2, line3, line4);
    }


}
