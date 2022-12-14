/**
 * File: CookieTest.java
 * Description: Creating a Test file for Cookie Class and validations for the values.
 * Lessons Learned: In this lesson I learned how to have testing cases for the wrong values
 * and expect the right values
 *  Testing case for a negative double
 *  public void setCookieQtyNegative() {
 *         Cookie cookie = new Cookie();
 *         cookie.setCookieQty(-5);
 *         assertEquals(0, cookie.getCookieQty(),"Error");
 *     }
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: Miguel Espinoza.
 * @since: 10/31/2022.
 */


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
    public void getCookieQtyNegative() {
        Cookie cookie = new Cookie("Cookie Dough",-2,2.5);
        assertEquals(0, cookie.getCookieQty(),"Error");
    }
    @Test
    public void getPricePerDozen() {
        Cookie cookie = new Cookie("Cookie Dough",2,2.5);
        assertEquals(2.5, cookie.getPricePerDozen(),"Error");
    }
    @Test
    public void getPricePerDozenNegative() {
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
    public void setCookieQtyNegative() {
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
    public void setPricePerDozenNegative() {
        Cookie cookie = new Cookie();
        cookie.setPricePerDozen(-5);
        assertEquals(0, cookie.getPricePerDozen(),"Error");
    }
    @Test
    public void getCalculateCost() {
        Cookie cookie = new Cookie("Cookie Dough",2,2.5);
        assertEquals(0.4166666666666667, cookie.calculateCost(),"Error");
    }
    @Test
    public void getCalculateTax() {
        Cookie cookie = new Cookie("Cookie Dough",2,2.5);
        assertEquals(0.030208333333333334, cookie.calculateTax(),"Error");
    }
    @Test
    public void isSameCookie(){
        Order order = new Order();
        Cookie cookie = new Cookie();
        Cookie cookie1 = new Cookie("cookie1", 10, 1);
        Cookie cookie2 = new Cookie("cookie1", 10, 1);
        assertEquals(true, cookie1.isSameAs(cookie2));
    }
    @Test
    public void isDifferentCookie(){
        Order order = new Order();
        Cookie cookie = new Cookie();
        Cookie cookie1 = new Cookie("cookie1", 20, 20);
        Cookie cookie2 = new Cookie("cookie1", 20, 10);
        order.add(cookie1);
        order.add(cookie2);
        assertEquals(false, cookie1.isSameAs(cookie2));
    }
}