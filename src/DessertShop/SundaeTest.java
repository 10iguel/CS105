package DessertShop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SundaeTest {

    @Test
    public void getToppingName() {
        Sundae sundae = new Sundae("Frio Rico",2,2.1,"cuacua",2.1);
        assertEquals("cuacua",sundae.getToppingName(),"Error");
    }
    @Test
    public void getToppingPrice() {
        Sundae sundae = new Sundae("Frio Rico",2,2.1,"cuacua",2.1);
        assertEquals(2.1,sundae.getToppingPrice(),"Error");
    }

    @Test
    public void setToppingName() {
        Sundae sun = new Sundae();
        sun.setToppingName("milk");
        assertEquals("milk",sun.getToppingName(),"Error");
    }

    @Test
    public void setToppingPrice() {
        Sundae sun = new Sundae();
        sun.setToppingPrice(2.1);
        assertEquals(2.1,sun.getToppingPrice(),"Error");
    }
}