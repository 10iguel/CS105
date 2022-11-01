/**
 * File: Condo.java
 * Description: Creating a subclass to be use the super classes
 * Lessons Learned: In this lesson I learned how to use the inheritance properties to create organized
 * classes and validations on the setters with ternary operators and colling the abstract method
 * floorLvl < 0 ? 0 : floorLvl
 * public double calculateAppraisalPrice()
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: Miguel Espinoza.
 * @since: 10/11/2022.
 */
package RealEstate;

public class Condo extends Residential {
    private int floorLvl;

    public Condo() {
        super();
        this.floorLvl = 0;
    }

    public Condo(String streetAddress, String zip, int bedCount, int bathCount, double sqFootage, int floorLvl) {
        super(streetAddress, zip, bedCount, bathCount, sqFootage);
        this.floorLvl = floorLvl;
    }

    public int getFloorLvl() {
        return floorLvl;
    }

    public void setFloorLvl(int floorLvl) {
        this.floorLvl = floorLvl < 0 ? 0 : floorLvl;
    }

    public double calculateAppraisalPrice() {
        double first = 88.0 * this.getSize();
        double second = 8000 * this.getBedCount();
        double third = 10000 * this.getBathCount();
        double fourth = 0;
        if (this.getFloorLvl() > 1) {
            fourth = this.getFloorLvl() * 5000;
        }
        return first + second + third + fourth;
    }
}
