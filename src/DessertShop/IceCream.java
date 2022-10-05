/**
 * File: IceCream.java
 * Description: Creating a subclass with the instance of a superclass
 * Lessons Learned: In this lesson I learned how to create an extended class and setting default values
 * for the attributes.
 *     extends, super, super()
 *     public class IceCream extends DessertItem
 *     default constructor
 *     public IceCream() {
 *         super();
 *         this.scoopCount = 0;
 *         this.pricePerScoop = 0.0;
 *     }
 *     constructor with arguments
 *     public IceCream(String name, int scoopCount, double pricePerScoop) {
 *         super(name);
 *         this.scoopCount = scoopCount;
 *         this.pricePerScoop = pricePerScoop;
 *     }
 *     Validations if there are negative values entered
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: Miguel Espinoza.
 * @since: 09/28/2022.
 */
package DessertShop;

public class IceCream extends DessertItem {
    private int scoopCount;
    private double pricePerScoop;

    public IceCream() {
        super();
        this.scoopCount = 0;
        this.pricePerScoop = 0.0;
    }

    public IceCream(String name, int scoopCount, double pricePerScoop) {
        super(name);
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
}
