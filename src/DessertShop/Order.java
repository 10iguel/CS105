/**
 * File: Order.java
 * Description: Creating an Object to help sort better my Desert Items
 * Lessons Learned: In this lesson I learned how to use the array method to use them with the superclass .
 *     add method
 *     public void add (DessertItem desert){
 *         order.add(desert);
 *     }
 *      public ArrayList<DessertItem> getOrderList() {
 *         return order;
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: Miguel Espinoza.
 * @since: 09/28/2022.
 */

package DessertShop;

import java.util.ArrayList;

public class Order {
    private ArrayList<DessertItem> order;

    public Order(){
        this.order = new ArrayList<DessertItem>();
    }
    // Getter

    public ArrayList<DessertItem> getOrderList() {
        return order;
    }
    public void add (DessertItem desert){
        order.add(desert);
    }
    public int itemCount(){
        return order.size();
    }

    public double orderCost(){
        double sum = 0;
        for (DessertItem dessertItem : this.order) {
            sum = (sum + dessertItem.calculateCost());
        }
        return sum;
    }

    public double orderTax(){
        double sum = 0;
        for (DessertItem dessertItem : this.order) {
            sum = sum + dessertItem.calculateTax();
        }
        return sum;
    }
}
