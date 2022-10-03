/**
 * File: Candy.java
 * Description: Creating a subclass with the instance of a superclass
 * Lessons Learned: In this lesson I learned how to create an extended class and setting default values
 * for the attributes.
 *     extends, super, super()
 *     public class Candy extends DessertItem
 *     default constructor
 *     public Candy() {
 *         super();
 *         this.candyWeight = 0;
 *         this.pricePerPound = 0;
 *     }
 *     constructor with arguments
 *     public Candy(String name, double candyWeight, double pricePerPound) {
 *         super(name);
 *         this.candyWeight = candyWeight;
 *         this.pricePerPound = pricePerPound;
 *     }
 *     Validations if there are negative values entered
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: Miguel Espinoza.
 * @since: 09/28/2022.
 */

package DessertShop;

public class Candy extends DessertItem {
    private double candyWeight;
    private double pricePerPound;

    public Candy() {
        super();
        this.candyWeight = 0;
        this.pricePerPound = 0;
    }

    public Candy(String name, double candyWeight, double pricePerPound) {
        super(name);
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


}
