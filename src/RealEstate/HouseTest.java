package RealEstate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseTest {

    @Test
    void getYardAcres() {
        House house = new House("758 E",12,2,1,2.5,3.0);
        assertEquals(3.0, house.getYardAcres());
    }

    @Test
    void setYardAcres() {
        House house = new House();
        house.setYardAcres(2.5);
        assertEquals(2.5, house.getYardAcres());
    }
}