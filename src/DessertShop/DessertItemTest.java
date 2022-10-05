/**
 * File: DessertItemTest.java
 * Description: Creating a Test file for DessertItem Class, validations for the values and checking
 * if the taxes are passing.
 * Lessons Learned: In this lesson I learned how to have testing cases for the wrong values
 * and expect the right values
 * public void setTaxPercent(){
 *         DessertItem dessertItem = new Candy();
 *         dessertItem.setTaxPercent(5.2);
 *         assertEquals(5.2,dessertItem.getTaxPercent());
 *     }
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: Miguel Espinoza.
 * @since: 10/05/2022.
 */

package DessertShop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DessertItemTest {

    @Test
    public void getName() {
        DessertItem dessertItem = new Candy("Alfajor",10,1);
        assertEquals("Alfajor", dessertItem.getName());
    }
    //Testing if they put spaces
    @Test
    public void getTrimName() {
        DessertItem dessertItem = new Candy("        ",10,1);
        assertEquals("", dessertItem.getName());
    }

    @Test
    public void setName() {
        DessertItem dessertItem = new Candy();
        dessertItem.setName("cake");
        assertEquals("cake",dessertItem.getName());
    }

    @Test
    public void calculateTaxTest(){
        DessertItem dessertItem = new Candy("        ",10,1);
        assertEquals(0.725, dessertItem.calculateTax());
    }
    @Test
    public void calculateCostTest(){
        DessertItem dessertItem = new Candy("        ",10,1);
        assertEquals(10, dessertItem.calculateCost());
    }
    @Test
    public void getTaxPercent(){
        DessertItem dessertItem = new Candy("        ",10,1);
        assertEquals(7.25, dessertItem.getTaxPercent());
    }
    public void setTaxPercent(){
        DessertItem dessertItem = new Candy();
        dessertItem.setTaxPercent(5.2);
        assertEquals(5.2,dessertItem.getTaxPercent());
    }
}