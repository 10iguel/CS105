/**
 * File: DessertItemTest.java
 * Description: Creating a Test file for DessertItem Class and validations for the values.
 * Lessons Learned: In this lesson I learned how to have testing cases for the wrong values
 * and expect the right values
 *  Testing case for not putting names.
 *  public void getTrimName() {
 *         DessertItem dessertItem = new DessertItem("        ");
 *         assertEquals("", dessertItem.getName());
 *     }
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: Miguel Espinoza.
 * @since: 09/28/2022.
 */

package DessertShop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DessertItemTest {

    @Test
    public void getName() {
        DessertItem dessertItem = new DessertItem("Alfajor");
        assertEquals("Alfajor", dessertItem.getName());
    }
    //Testing if they put spaces
    @Test
    public void getTrimName() {
        DessertItem dessertItem = new DessertItem("        ");
        assertEquals("", dessertItem.getName());
    }

    @Test
    public void setName() {
        DessertItem dessertItem = new DessertItem();
        dessertItem.setName("cake");
        assertEquals("cake",dessertItem.getName());
    }
}