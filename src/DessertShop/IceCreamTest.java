/**
 * File: IceCreamTest.java
 * Description: Creating a Test file for IceCream Class and validations for the values.
 * Lessons Learned: In this lesson I learned how to have testing cases for the wrong values and testing
 * the override method
 * and expect the right values
 *  Testing case for a negative double
 *     public void getCalculateCost() {
 *         IceCream iceCream = new IceCream("Sundae", 3, 2.5);
 *         assertEquals(7.5, iceCream.calculateCost(),"Error");
 *     }
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: Miguel Espinoza.
 * @since: 10/05/2022.
 */

package DessertShop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IceCreamTest {

    @Test
    void getScoopCount() {
        IceCream iceCream = new IceCream("Sundae", 3, 2.5);
        assertEquals(3, iceCream.getScoopCount(), "Error");
    }

    @Test
    void getScoopCountNegative() {
        IceCream iceCream = new IceCream("Sundae", -3, 2.5);
        assertEquals(0, iceCream.getScoopCount(), "Error");
    }

    @Test
    void getPricePerScoop() {
        IceCream iceCream = new IceCream("Sundae", 2, 8);
        assertEquals(8, iceCream.getPricePerScoop(), "Error");
    }

    @Test
    void getPricePerScoopNegative() {
        IceCream iceCream = new IceCream("Sundae", 2, -8);
        assertEquals(0, iceCream.getPricePerScoop(), "Error");
    }

    @Test
    void setScoopCount() {
        IceCream iceCream = new IceCream();
        iceCream.setScoopCount(3);
        assertEquals(3, iceCream.getScoopCount(), "Error");
    }

    @Test
    void setScoopCountNegative() {
        IceCream iceCream = new IceCream();
        iceCream.setScoopCount(-3);
        assertEquals(0, iceCream.getScoopCount(), "Error");
    }

    @Test
    void setPricePerScoop() {
        IceCream iceCream = new IceCream();
        iceCream.setPricePerScoop(3);
        assertEquals(3, iceCream.getPricePerScoop(), "Error");
    }

    @Test
    void setPricePerScoopNegative() {
        IceCream iceCream = new IceCream();
        iceCream.setPricePerScoop(-3);
        assertEquals(0, iceCream.getPricePerScoop(), "Error");
    }
    @Test
    public void getCalculateCost() {
        IceCream iceCream = new IceCream("Sundae", 3, 2.5);
        assertEquals(7.5, iceCream.calculateCost(),"Error");
    }
    @Test
    public void getCalculateTax() {
        IceCream iceCream = new IceCream("Sundae", 3, 2.5);
        assertEquals(0.54375, iceCream.calculateTax(),"Error");
    }

}