/**
 * File: DessertItemTest.java
 * Description: Creating a Test file for DessertItem Class, validations for the values and checking
 * if the taxes are passing and verifying that is sorting good.
 * Lessons Learned: In this lesson I learned how to have testing cases for the wrong values
 * and expect the right values
 * public void compareToMajorToMinor(){
 *      DessertItem dessertItem1 = new Candy("Alfajor",10,10);
 *      DessertItem dessertItem2 = new Candy("Alfajor",100,100);
 *      assertEquals(-1, dessertItem1.compareTo(dessertItem2));
 * }
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: Miguel Espinoza.
 * @since: 10/24/2022.
 */

package DessertShop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DessertItemTest {

    @Test
    public void getName() {
        DessertItem dessertItem = new Candy("Alfajor", 10, 1);
        assertEquals("Alfajor", dessertItem.getName());
    }

    //Testing if they put spaces
    @Test
    public void getTrimName() {
        DessertItem dessertItem = new Candy("        ", 10, 1);
        assertEquals("", dessertItem.getName());
    }

    @Test
    public void setName() {
        DessertItem dessertItem = new Candy();
        dessertItem.setName("cake");
        assertEquals("cake", dessertItem.getName());
    }

    @Test
    public void calculateTaxTest() {
        DessertItem dessertItem = new Candy("        ", 10, 1);
        assertEquals(0.725, dessertItem.calculateTax());
    }

    @Test
    public void calculateCostTest() {
        DessertItem dessertItem = new Candy("        ", 10, 1);
        assertEquals(10, dessertItem.calculateCost());
    }

    @Test
    public void getTaxPercent() {
        DessertItem dessertItem = new Candy("        ", 10, 1);
        assertEquals(7.25, dessertItem.getTaxPercent());
    }

    @Test
    public void setTaxPercent() {
        DessertItem dessertItem = new Candy();
        dessertItem.setTaxPercent(5.2);
        assertEquals(5.2, dessertItem.getTaxPercent());
    }

    @Test
    public void getPackaging() {
        DessertItem dessertItem = new Candy("        ", 10, 1);
        assertEquals("Bag", dessertItem.getPackaging());
    }

    @Test
    public void setPackaging() {
        DessertItem dessertItem = new Candy();
        dessertItem.setPackaging("Bag");
        assertEquals("Bag", dessertItem.getPackaging());
    }

    @Test
    public void compareToMajorToMinor() {
        DessertItem dessertItem1 = new Candy("Alfajor", 10, 10);
        DessertItem dessertItem2 = new Candy("Alfajor", 100, 100);
        assertEquals(-1, dessertItem1.compareTo(dessertItem2));
    }

    @Test
    public void compareToMinorToMajor() {
        DessertItem dessertItem1 = new Candy("Alfajor", 100, 100);
        DessertItem dessertItem2 = new Candy("Alfajor", 10, 10);
        assertEquals(1, dessertItem1.compareTo(dessertItem2));
    }

    @Test
    public void compareToEquals() {
        DessertItem dessertItem1 = new Candy("Alfajor", 10, 5);
        DessertItem dessertItem2 = new Candy("Alfajor", 5, 10);
        assertEquals(0, dessertItem1.compareTo(dessertItem2));
    }
}