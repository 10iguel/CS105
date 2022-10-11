/**
 * File: ResidentialTest.java
 * Description: Creating a testing file to proof validations
 * Lessons Learned: In this lesson I learned how to use test classes and its setters and getters.
 *      residential.setBathCount(-5);
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: Miguel Espinoza.
 * @since: 10/11/2022.
 */

package RealEstate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResidentialTest {

    @Test
    void getBedCount() {
        Residential residential = new Residential("758 E","12",2,1,2.5);
        assertEquals(2, residential.getBedCount());
    }

    @Test
    void getBathCount() {
        Residential residential = new Residential("758 E","12",2,1,2.5);
        assertEquals(1, residential.getBathCount());
    }

    @Test
    void getSize() {
        Residential residential = new Residential("758 E","12",2,1,2.5);
        assertEquals(2.5, residential.getSize());
    }

    @Test
    void setBedCount() {
        Residential residential = new Residential();
        residential.setBedCount(2);
        assertEquals(2, residential.getBedCount());
    }

    @Test
    void setBathCount() {
        Residential residential = new Residential();
        residential.setBathCount(2);
        assertEquals(2, residential.getBathCount());
    }

    @Test
    void setBathCountNegative() {
        Residential residential = new Residential();
        residential.setBathCount(-5);
        assertEquals(0, residential.getBathCount());
    }

    @Test
    void setSize() {
        Residential residential = new Residential();
        residential.setSize(2.2);
        assertEquals(2.2, residential.getSize());
    }
    @Test
    void setSizeNegative() {
        Residential residential = new Residential();
        residential.setSize(-5);
        assertEquals(0, residential.getSize());
    }
}