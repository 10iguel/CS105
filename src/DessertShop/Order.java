/**
 * File: Order.java
 * Description: Creating an Object to help sort better my Desert Items
 * Lessons Learned: In this lesson I learned how to loop to an existing array and get the total cost and total tax .
 *     add method
 *     public double orderCost(){
 *         double sum = 0;
 *         for (DessertItem dessertItem : this.order) {
 *             sum = (sum + dessertItem.calculateCost());
 *         }
 *         return sum;
 *     }
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: Miguel Espinoza.
 * @since: 10/05/2022.
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
