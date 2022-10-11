package RealEstate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyTest {

    @Test
    void getStreetAddress() {
        Property property = new Property("254 S", "8425");
        assertEquals("254 S", property.getStreetAddress());
    }

    @Test
    void getZip() {
        Property property = new Property("254 S", "8425");
        assertEquals("8425", property.getZip());
    }

    @Test
    void setStreetAddress() {
        Property property = new Property();
        property.setStreetAddress("254 S");
        assertEquals("254 S", property.getStreetAddress());
    }

    @Test
    void setZip() {
        Property property = new Property();
        property.setZip("8451");
        assertEquals("8451", property.getZip());
    }
}