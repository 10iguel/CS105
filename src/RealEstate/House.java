/**
 * File: Condo.java
 * Description: Creating a subclass to be use the super classes
 * Lessons Learned: In this lesson I learned how to use the inheritance properties to create organized
 * classes and validations on the setters with ternary operators and colling the abstract method
 * yardAcres < 0 ? 0 : yardAcres
 * calculateAppraisalPrice
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: Miguel Espinoza.
 * @since: 10/31/2022.
 */

package RealEstate;

public class House extends Residential {
    private double yardAcres;

    public House() {
        super();
        this.yardAcres = 0;
    }

    public House(String streetAddress, String zip, int bedCount, int bathCount, double sqFootage, double yardAcres) {
        super(streetAddress, zip, bedCount, bathCount, sqFootage);
        this.yardAcres = yardAcres;
    }

    public double getYardAcres() {
        return yardAcres;
    }

    public void setYardAcres(double yardAcres) {
        this.yardAcres = yardAcres < 0 ? 0 : yardAcres;
    }

    public double calculateAppraisalPrice() {
        double first = 97 * this.getSize();
        double second = 10000 * this.getBedCount();
        double third = 12000 * this.getBathCount();
        double fourth = 460000 * this.getYardAcres();
        return first + second + third + fourth;
    }
}
