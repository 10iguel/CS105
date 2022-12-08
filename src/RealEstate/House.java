/**
 * File: Condo.java
 * Description: Creating a subclass to be use the super classes and overriding toString
 * Lessons Learned: In this lesson I learned how to use the inheritance properties to create organized
 * classes and validations on the setters with ternary operators and colling the abstract method
 * yardAcres < 0 ? 0 : yardAcres
 * calculateAppraisalPrice
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: Miguel Espinoza.
 * @since: 11/28/2022.
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

    @Override
    public String toString() {
        String line = "Residence Type: House";
        String line1 = "Address: " + getStreetAddress();
        String line2 = "Zip Code: " + getZip();
        String line3 = "Sq Footage: " + getSize() ;
        String line4 = "Bedrooms:"+ getBedCount();
        String line5 = "Bathrooms:"+ getBathCount();
        String line6 = "Yard Size (Acres):"+ getYardAcres();
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
