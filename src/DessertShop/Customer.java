/**
 * File: Customer.java
 * Description: Creating the class to add to the dessertShop and a static
 * Lessons Learned: In this lesson I learned how to use the static attribute
 * private static int nextCustID = 1000;
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: Miguel Espinoza.
 * @since: 10/31/2022.
 */
package DessertShop;

import java.util.ArrayList;

public class Customer {
    private String custName;
    private ArrayList<Order> orderHistory;
    private int custID;
    private static int nextCustID = 1000;

    public Customer() {
        this.custName = "";
        this.custID = 0;
    }

    public Customer(String custName) {
        this.custName = custName;
        this.custID = nextCustID;
        nextCustID++;
        orderHistory = new ArrayList<>();
    }

    public String getCustName() {
        return custName.trim();
    }

    public ArrayList<Order> getOrderHistory() {
        return orderHistory;
    }

    public int getID() {
        return custID;
    }

    public void setName(String custName) {
        this.custName = custName.trim();
    }

    public void addToHistory(Order order) {
        orderHistory.add(order);
    }
}
