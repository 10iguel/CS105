package DessertShop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IceCreamTest {

    @Test
    void getScoopCount() {
        IceCream cookie = new IceCream("Sundae",3,2.5);
        assertEquals(3, cookie.getScoopCount(),"Error");
    }
    @Test
    void getScoopCountnegative() {
        IceCream cookie = new IceCream("Sundae",-3,2.5);
        assertEquals(0, cookie.getScoopCount(),"Error");
    }

    @Test
    void getPricePerScoop() {
        IceCream cookie = new IceCream("Sundae",2,8);
        assertEquals(8, cookie.getPricePerScoop(),"Error");
    }
    @Test
    void getPricePerScoopnegative() {
        IceCream cookie = new IceCream("Sundae",2,-8);
        assertEquals(0, cookie.getPricePerScoop(),"Error");
    }

    @Test
    void setScoopCount() {
        IceCream cookie = new IceCream();
        cookie.setScoopCount(3);
        assertEquals(3, cookie.getScoopCount(),"Error");
    }
    @Test
    void setScoopCountnegative() {
        IceCream cookie = new IceCream();
        cookie.setScoopCount(-3);
        assertEquals(0, cookie.getScoopCount(),"Error");
    }

    @Test
    void setPricePerScoop() {
        IceCream cookie = new IceCream();
        cookie.setPricePerScoop(3);
        assertEquals(3, cookie.getPricePerScoop(),"Error");
    }
    @Test
    void setPricePerScoopnegative() {
        IceCream cookie = new IceCream();
        cookie.setPricePerScoop(-3);
        assertEquals(0, cookie.getPricePerScoop(),"Error");
    }
}