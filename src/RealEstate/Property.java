/**
 * File: Residential.java
 * Description: Creating a superclass for more subclasses
 * Lessons Learned: In this lesson I learned how to use the inheritance properties to create organized
 * classes and validations on the setters with trim()
 *     this.zip = zip.trim()
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: Miguel Espinoza.
 * @since: 10/11/2022.
 */

package RealEstate;

public class Property {
    private String streetAddress;
    private String  zip;

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
        return zip;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress.trim();
    }

    public void setZip(String zip) {
        this.zip = zip.trim();
    }
}
