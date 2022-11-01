/**
 * File: CondoTest.java
 * Description: Creating a testing file to proof validations
 * Lessons Learned: In this lesson I learned how to use test classes and its setters and getters.
 *      property.setZip("           ");
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: Miguel Espinoza.
 * @since: 10/31/2022.
 */

package RealEstate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyTest {

    @Test
    void getStreetAddress() {
        Property property = new House("254 S", "8425",10,1,1.2,1.2);
        assertEquals("254 S", property.getStreetAddress());
    }

    @Test
    void getZip() {
        Property property = new House("254 S", "8425",10,1,1.2,1.2);
        assertEquals("8425", property.getZip());
    }

    @Test
    void setStreetAddress() {
        Property property = new House();
        property.setStreetAddress("254 S");
        assertEquals("254 S", property.getStreetAddress());
    }

    @Test
    void setZip() {
        Property property = new House();
        property.setZip("8451");
        assertEquals("8451", property.getZip());
    }

    @Test
    void setZipWithSpaces() {
        Property property = new House();
        property.setZip("           ");
        assertEquals("", property.getZip());
    }
}