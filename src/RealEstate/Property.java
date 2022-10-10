package RealEstate;

public class Property {
    private String streetAddress;
    private int zip;

    public Property(){
        this.streetAddress = "";
        this.zip = 0;
    }

    public Property(String streetAddress, int zip) {
        this.streetAddress = streetAddress;
        this.zip = zip;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public int getZip() {
        return zip  < 0 ? zip = 0: zip;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }
}
