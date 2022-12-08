/**
 * File: Residential.java
 * Description: Creating a superclass for more subclasses
 * Lessons Learned: In this lesson I learned how to use the inheritance properties to create organized
 * classes and validations on the setters with trim() and updating the abstract class
 *     this.zip = zip.trim()
 *     public  abstract class Property
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: Miguel Espinoza.
 * @since: 10/31/2022.
 */

package RealEstate;

public  abstract class Property {
    private String streetAddress;
    private String  zip;

    private double listPrice = 0;

    private double appraisalPrice = 0;

    public Property(){
        this.streetAddress = "";
        this.zip = "";
    }

    public Property(String streetAddress, String zip) {
        this.streetAddress = streetAddress;
        this.zip = zip;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getZip() {
        int num;
        try {
            num = Integer.parseInt(zip);
            if (num<0){
                zip = "0";
            }
        }catch (NumberFormatException e){
            zip = "0";
        }
        return zip.trim();
    }

    public double getListPrice() {
        return listPrice;
    }

    public double getAppraisalPrice() {
        return appraisalPrice;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress.trim();
    }

    public void setZip(String zip) {
        zip = zip.trim();
        int num;
        try {
            num = Integer.parseInt(zip);
            if (num<0){
                zip = "0";
            }
        }catch (NumberFormatException e){
            zip = "0";
        }
        this.zip = zip;
    }

    public void setListPrice(double listPrice) {
        this.listPrice = listPrice;
    }

    protected void setAppraisalPrice(double appraisalPrice) {
        this.appraisalPrice = appraisalPrice;
    }
    public abstract double calculateAppraisalPrice();
}
