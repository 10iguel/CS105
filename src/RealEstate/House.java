package RealEstate;

public class House extends Residential {
    private double yardAcres;

    public House(){
        super();
        this.yardAcres = 0;
    }

    public House(String streetAddress, String zip, int bedCount, int bathCount, double sqFootage, double yardAcres) {
        super(streetAddress, zip, bedCount, bathCount, sqFootage);
        this.yardAcres = yardAcres;
    }

    public double getYardAcres() {
        return yardAcres < 0 ? yardAcres = 0 : yardAcres;
    }

    public void setYardAcres(double yardAcres) {
        this.yardAcres = yardAcres < 0 ? 0 : yardAcres;
    }
}
