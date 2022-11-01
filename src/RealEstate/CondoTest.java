/**
 * File: CondoTest.java
 * Description: Creating a testing file to proof validations
 * Lessons Learned: In this lesson I learned how to use test classes and its setters and getters.
 *      condo.setFloorLvl(-5);
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: Miguel Espinoza.
 * @since: 10/31/2022.
 */

package RealEstate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CondoTest {

    @Test
    void getFloorLvl() {
        Condo condo = new Condo("758 E","12",2,1,2.5,3);
        assertEquals(3, condo.getFloorLvl());
    }

    @Test
    void setFloorLvl() {
        Condo condo = new Condo();
        condo.setFloorLvl(2);
        assertEquals(2, condo.getFloorLvl());
    }
    @Test
    void setFloorLvlNegative() {
        Condo condo = new Condo();
        condo.setFloorLvl(-5);
        assertEquals(0, condo.getFloorLvl());
    }

    @Test
    void getCalculateAppraisalPrice() {
        Condo condo = new Condo("758 E","12",2,1,2.5,3);
        assertEquals(41220.0, condo.calculateAppraisalPrice());
    }
}