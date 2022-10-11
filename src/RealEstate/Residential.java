package RealEstate;

public class Residential extends Property {
    private int bedCount;
    private int bathCount;
    private double sqFootage;

    public Residential(){
        super();
        this.bedCount = 0;
        this.bathCount = 0;
        this.sqFootage = 0;
    }

    public Residential(String streetAddress, String zip, int bedCount, int bathCount, double sqFootage) {
        super(streetAddress,zip);
        this.bedCount = bedCount;
        this.bathCount = bathCount;
        this.sqFootage = sqFootage;
    }

    public int getBedCount() {
        return bedCount;
    }

    public int getBathCount() {
        return bathCount;
    }

    public double getSize() {
        return sqFootage;
    }

    public void setBedCount(int bedCount) {
        this.bedCount = bedCount < 0 ? 0 : bedCount;
    }

    public void setBathCount(int bathCount) {
        this.bathCount = bathCount < 0 ? 0 : bathCount;
    }

    public void setSize(double sqFootage) {
        this.sqFootage = sqFootage < 0 ? 0 : sqFootage;
    }
}
