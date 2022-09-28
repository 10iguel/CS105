package DessertShop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CookieTest {

    @Test
    public void getCookieQty() {
        Cookie cookie = new Cookie("Cookie Dough",2,2.5);
        assertEquals(2, cookie.getCookieQty(),"Error");
    }
    @Test
    public void getCookieQtynegative() {
        Cookie cookie = new Cookie("Cookie Dough",-2,2.5);
        assertEquals(0, cookie.getCookieQty(),"Error");
    }
    @Test
    public void getPricePerDozen() {
        Cookie cookie = new Cookie("Cookie Dough",2,2.5);
        assertEquals(2.5, cookie.getPricePerDozen(),"Error");
    }
    @Test
    public void getPricePerDozennegative() {
        Cookie cookie = new Cookie("Cookie Dough",2,-2.5);
        assertEquals(0, cookie.getPricePerDozen(),"Error");
    }

    @Test
    public void setCookieQty() {
        Cookie cookie = new Cookie();
        cookie.setCookieQty(5);
        assertEquals(5, cookie.getCookieQty(),"Error");
    }
    @Test
    public void setCookieQtynegative() {
        Cookie cookie = new Cookie();
        cookie.setCookieQty(-5);
        assertEquals(0, cookie.getCookieQty(),"Error");
    }

    @Test
    public void setPricePerDozen() {
        Cookie cookie = new Cookie();
        cookie.setPricePerDozen(5);
        assertEquals(5, cookie.getPricePerDozen(),"Error");
    }
    @Test
    public void setPricePerDozennegative() {
        Cookie cookie = new Cookie();
        cookie.setPricePerDozen(-5);
        assertEquals(0, cookie.getPricePerDozen(),"Error");
    }
}