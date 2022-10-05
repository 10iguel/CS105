/**
 * File: IceCreamTest.java
 * Description: Creating a Test file for Candy Class and validations for the values.
 * Lessons Learned: In this lesson I learned how to have testing cases for the wrong values and testing
 * the override method
 *     public void getCalculateTax() {
 *         Candy candy = new Candy("bar",3,1.5);
 *         assertEquals(0.32625, candy.calculateTax(),"Error");
 *     }
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: Miguel Espinoza.
 * @since: 10/05/2022.
 */

package DessertShop;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CandyTest {
    @Test
    public void getCandyWeight() {
        Candy candy = new Candy("bar",3,1.5);
        assertEquals(3, candy.getCandyWeight(),"Error");
    }
    @Test
    public void getCandyWeightNegative() {
        Candy candy = new Candy("bar",-2.5,1.5);
        assertEquals(0, candy.getCandyWeight(),"Error");
    }

    @Test
    public void getPricePerPound() {
        Candy candy = new Candy("bar",2.5,1.5);
        assertEquals(1.5, candy.getPricePerPound(),"Error");
    }
    @Test
    public void getPricePerPoundNegative() {
        Candy candy = new Candy("bar",2.5,-1.5);
        assertEquals(0, candy.getPricePerPound(),"Error");
    }
    @Test
    public void setCandyWeight() {
        Candy candy = new Candy();
        candy.setCandyWeight(2.5);
        assertEquals(2.5,candy.getCandyWeight(),"Error");
    }
    @Test
    public void setCandyWeightNegative() {
        Candy candy = new Candy();
        candy.setCandyWeight(-2.5);
        assertEquals(0,candy.getCandyWeight(),"Error");
    }
    @Test
    public void setPricePerPound() {
        Candy candy = new Candy();
        candy.setPricePerPound(-1.5);
        assertEquals(0,candy.getPricePerPound(),"Error");
    }
    @Test
    public void setPricePerPoundNegative() {
        Candy candy = new Candy();
        candy.setPricePerPound(-1.5);
        assertEquals(0,candy.getPricePerPound(),"Error");
    }
    @Test
    public void getCalculateCost() {
        Candy candy = new Candy("bar",3,1.5);
        assertEquals(4.5, candy.calculateCost(),"Error");
    }
    @Test
    public void getCalculateTax() {
        Candy candy = new Candy("bar",3,1.5);
        assertEquals(0.32625, candy.calculateTax(),"Error");
    }
}