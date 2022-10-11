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
}