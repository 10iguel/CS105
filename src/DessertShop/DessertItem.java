/**
 * File: DessertItem.java
 * Description: Creating a superclass
 * Lessons Learned: In this lesson I learned how to create a new attribute and instanced with a value and use the abstract
 * to call this class in all the subclasses.
 *     public abstract class DessertItem
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: Miguel Espinoza.
 * @since: 10/12/2022.
 */

package DessertShop;

public abstract class DessertItem implements Packaging {
    private String name;

    private double taxPercent = 7.25;
    private String packaging;


    public DessertItem() {
        this.name = "";
    }

    public DessertItem(String name) {
        this.name = name;
    }
    //Getters

    public String getName() {
        return name.trim();
    }

    public double getTaxPercent() {
        return taxPercent;
    }

    public String getPackaging() {
        return packaging;
    }
    // Setters

    public void setName(String name) {
        this.name = name.trim();
    }

    public void setTaxPercent(double taxPercent) {
        this.taxPercent = taxPercent <0 ? 0: taxPercent;
    }
    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }

    public abstract double calculateCost();

    public double calculateTax(){
        return (taxPercent * calculateCost())/100 ;
    }
}
