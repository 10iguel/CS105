/**
 * File: HouseTest.java
 * Description: Creating a testing file to proof validations
 * Lessons Learned: In this lesson I learned how to use test classes and its setters and getters.
 *      house.setYardAcres(-2.5);
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: Miguel Espinoza.
 * @since: 10/31/2022.
 */

package RealEstate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseTest {

    @Test
    void getYardAcres() {
        House house = new House("758 E","12",2,1,2.5,3.0);
        assertEquals(3.0, house.getYardAcres());
    }

    @Test
    void setYardAcres() {
        House house = new House();
        house.setYardAcres(2.5);
        assertEquals(2.5, house.getYardAcres());
    }
    @Test
    void setYardAcresNegative() {
        House house = new House();
        house.setYardAcres(-2.5);
        assertEquals(0, house.getYardAcres());
    }
    @Test
    void getCalculateAppraisalPrice() {
        House condo = new House("758 E","12",2,1,2.5,3);
        assertEquals(1412242.5, condo.calculateAppraisalPrice());
    }
}