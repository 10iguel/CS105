/**
 * File: Condo.java
 * Description: Creating a subclass to be use the super classes and overriding toString
 * Lessons Learned: In this lesson I learned how to use the inheritance properties to create organized
 * classes and validations on the setters with ternary operators and colling the abstract method
 * floorLvl < 0 ? 0 : floorLvl
 * public double calculateAppraisalPrice()
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: Miguel Espinoza.
 * @since: 11/28/2022.
 */
package RealEstate;

import java.util.HashMap;
import java.util.Set;

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
        double floorPrice = 5000.00;
        double condoPrice = ((first) + (second) + (third) + (floorLvl >= 1 ? ((floorLvl -1)  *
                floorPrice) : 0));
        return condoPrice;
    }
    @Override
    public String toString() {
        String line = "Residence Type: Condo";
        String line1 = "Address: " + getStreetAddress();
        String line2 = "Zip Code: " + getZip();
        String line3 = "Sq Footage: " + getSize() ;
        String line4 = "Bedrooms:"+ getBedCount();
        String line5 = "Bathrooms:"+ getBathCount();
        String line6 = "Floor:"+ getFloorLvl();
        String line7 = "Appraisal Price: $";
        String line8 = "List Price:$";
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.printf("%s          %s         %s%n", line, line1,line2);
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.printf("%s%n%s%n%s%n%s%n",line3,line4,line5,line6);
        System.out.println("-------------------------------");
        System.out.printf("%s %,.2f%n%s %,.2f%n",line7,calculateAppraisalPrice(),line8, getListPrice());
        return "-------------------------------";
    }
}
