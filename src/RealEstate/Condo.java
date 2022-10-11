/**
 * File: Condo.java
 * Description: Creating a subclass to be use the super classes
 * Lessons Learned: In this lesson I learned how to use the inheritance properties to create organized
 * classes and validations on the setters with ternary operators
 *      floorLvl < 0 ? 0 : floorLvl
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: Miguel Espinoza.
 * @since: 10/11/2022.
 */
package RealEstate;

public class Condo extends Residential {
    private int floorLvl;

    public Condo(){
        super();
        this.floorLvl = 0;
    }

    public Condo(String streetAddress, String zip, int bedCount, int bathCount, double sqFootage, int floorLvl) {
        super( streetAddress, zip, bedCount,bathCount,sqFootage);
        this.floorLvl = floorLvl;
    }

    public int getFloorLvl() {
        return floorLvl;
    }

    public void setFloorLvl(int floorLvl) {
        this.floorLvl = floorLvl < 0 ? 0 : floorLvl;
    }
}
