/**
 * File: IceCreamTest.java
 * Description: Creating a Test file for IceCream Class and validations for the values.
 * Lessons Learned: In this lesson I learned how to have testing cases for the wrong values
 * and expect the right values
 *  Testing case for a negative double
 * void getPricePerScoopNegative() {
 *         IceCream cookie = new IceCream("Sundae", 2, -8);
 *         assertEquals(0, cookie.getPricePerScoop(), "Error");
 *     }
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: Miguel Espinoza.
 * @since: 09/28/2022.
 */

package DessertShop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IceCreamTest {

    @Test
    void getScoopCount() {
        IceCream cookie = new IceCream("Sundae", 3, 2.5);
        assertEquals(3, cookie.getScoopCount(), "Error");
    }

    @Test
    void getScoopCountNegative() {
        IceCream cookie = new IceCream("Sundae", -3, 2.5);
        assertEquals(0, cookie.getScoopCount(), "Error");
    }

    @Test
    void getPricePerScoop() {
        IceCream cookie = new IceCream("Sundae", 2, 8);
        assertEquals(8, cookie.getPricePerScoop(), "Error");
    }

    @Test
    void getPricePerScoopNegative() {
        IceCream cookie = new IceCream("Sundae", 2, -8);
        assertEquals(0, cookie.getPricePerScoop(), "Error");
    }

    @Test
    void setScoopCount() {
        IceCream cookie = new IceCream();
        cookie.setScoopCount(3);
        assertEquals(3, cookie.getScoopCount(), "Error");
    }

    @Test
    void setScoopCountNegative() {
        IceCream cookie = new IceCream();
        cookie.setScoopCount(-3);
        assertEquals(0, cookie.getScoopCount(), "Error");
    }

    @Test
    void setPricePerScoop() {
        IceCream cookie = new IceCream();
        cookie.setPricePerScoop(3);
        assertEquals(3, cookie.getPricePerScoop(), "Error");
    }

    @Test
    void setPricePerScoopNegative() {
        IceCream cookie = new IceCream();
        cookie.setPricePerScoop(-3);
        assertEquals(0, cookie.getPricePerScoop(), "Error");
    }
}