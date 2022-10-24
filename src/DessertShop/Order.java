/**
 * File: Order.java
 * Description: Creating an Object to help sort better my Desert Items, adding the enum in the order
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
 * @since: 10/17/2022.
 */

package DessertShop;

import java.util.ArrayList;
import java.util.List;

public class Order implements Payable {
    private ArrayList<DessertItem> order;

    private PayType payMethod;

    public Order(){
        this.order = new ArrayList<DessertItem>();
        this.payMethod = PayType.CASH;
    }
    // Getter

    public ArrayList<DessertItem> getOrderList() {
        return order;
    }

    public PayType getPayType() {
        return payMethod;
    }

    public void setPayType(PayType payMethod) {
        this.payMethod = payMethod;
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

    public String toString(){
        return String.format("%n Paid for with: %s", getPayType());
    }

}
