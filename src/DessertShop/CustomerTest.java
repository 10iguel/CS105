/**
 * File: CustomerTest.java
 * Description: Creating the test for the customer class
 * Lessons Learned: In this lesson I learned how to test a static field
 * void getCustNameSpaces() {
 *         Customer customer = new Customer("      Manu");
 *         assertEquals("Manu", customer.getCustName());
 *     }
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: Miguel Espinoza.
 * @since: 10/31/2022.
 */
package DessertShop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void getCustName() {
        Customer customer = new Customer("Manu");
        assertEquals("Manu", customer.getCustName());
    }

    @Test
    void getCustNameSpaces() {
        Customer customer = new Customer("      Manu");
        assertEquals("Manu", customer.getCustName());
    }

    @Test
    void setCustName() {
        Customer customer = new Customer();
        customer.setName("man");
        assertEquals("man", customer.getCustName());
    }

    @Test
    void getID() {
        Customer customer = new Customer();
        assertEquals(0, customer.getID());
    }

}