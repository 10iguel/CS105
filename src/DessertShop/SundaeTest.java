/**
 * File: IceCreamTest.java
 * Description: Creating a Test file for Sundae Class and validations for the values.
 * Lessons Learned: In this lesson I learned how to have testing cases for the wrong values and testing
 * the override method
 *     public void getCalculateCost() {
 *         Sundae sundae = new Sundae("Frio Rico",2,2.1,"cuacua",2.1);
 *         assertEquals(6.300000000000001, sundae.calculateCost(),"Error");
 *     }
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: Miguel Espinoza.
 * @since: 10/05/2022.
 */

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
    public void getToppingPriceNegative() {
        Sundae sundae = new Sundae("Frio Rico",2,2.1,"cuacua",-2.1);
        assertEquals(0,sundae.getToppingPrice(),"Error");
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
    @Test
    public void setToppingPriceNegative() {
        Sundae sun = new Sundae();
        sun.setToppingPrice(-2.1);
        assertEquals(0,sun.getToppingPrice(),"Error");
    }
    @Test
    public void getCalculateCost() {
        Sundae sundae = new Sundae("Frio Rico",2,2.1,"cuacua",2.1);
        assertEquals(6.300000000000001, sundae.calculateCost(),"Error");
    }
    @Test
    public void getCalculateTax() {
        Sundae sundae = new Sundae("Frio Rico",2,2.1,"cuacua",2.1);
        assertEquals(0.45675000000000004, sundae.calculateTax(),"Error");
    }
}