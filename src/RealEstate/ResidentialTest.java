/**
 * File: ResidentialTest.java
 * Description: Creating a testing file to proof validations
 * Lessons Learned: In this lesson I learned how to use test classes and its setters and getters.
 *      residential.setBathCount(-5);
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: Miguel Espinoza.
 * @since: 10/31/2022.
 */

package RealEstate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResidentialTest {

    @Test
    void getBedCount() {
        Residential residential = new House("254 S", "8425",10,1,1.2,1.2);
        assertEquals(10, residential.getBedCount());
    }

    @Test
    void getBathCount() {
        Residential residential = new House("254 S", "8425",10,1,1.2,1.2);
        assertEquals(1, residential.getBathCount());
    }

    @Test
    void getSize() {
        Residential residential = new House("254 S", "8425",10,1,1.2,1.2);
        assertEquals(1.2, residential.getSize());
    }

    @Test
    void setBedCount() {
        Residential residential = new House();
        residential.setBedCount(2);
        assertEquals(2, residential.getBedCount());
    }

    @Test
    void setBathCount() {
        Residential residential = new House();
        residential.setBathCount(2);
        assertEquals(2, residential.getBathCount());
    }

    @Test
    void setBathCountNegative() {
        Residential residential = new House();
        residential.setBathCount(-5);
        assertEquals(0, residential.getBathCount());
    }

    @Test
    void setSize() {
        Residential residential = new House();
        residential.setSize(2.2);
        assertEquals(2.2, residential.getSize());
    }
    @Test
    void setSizeNegative() {
        Residential residential = new House();
        residential.setSize(-5);
        assertEquals(0, residential.getSize());
    }
}