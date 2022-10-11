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
