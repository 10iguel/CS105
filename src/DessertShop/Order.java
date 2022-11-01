/**
 * File: Order.java
 * Description: Creating an Object to help sort better my Desert Items, adding the enum in the order
 * Lessons Learned: In this lesson I learned how to loop to an existing array and get the total cost and total tax .
 * add method
 * public double orderCost(){
 * double sum = 0;
 * for (DessertItem dessertItem : this.order) {
 * sum = (sum + dessertItem.calculateCost());
 * }
 * return sum;
 * }
 * Use casting and instanceof keywords to get the same class name
 * dessert instanceof Candy
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: Miguel Espinoza.
 * @since: 10/31/2022.
 */

package DessertShop;

import java.util.ArrayList;

public class Order implements Payable {
    private ArrayList<DessertItem> order;

    private PayType payMethod;

    public Order() {
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

    public void add(DessertItem dessert) {
        boolean valid = true;

        if (dessert instanceof Candy) {
            for (DessertItem dessertItem : this.order) {
                if (dessertItem instanceof Candy && ((Candy) dessert).isSameAs((Candy) dessertItem)) {
                    ((Candy) dessertItem).setCandyWeight(((Candy) dessertItem).getCandyWeight() + ((Candy) dessert).getCandyWeight());
                    valid = false;
                }
            }
        } else if (dessert instanceof Cookie) {
            for (DessertItem dessertItem : this.order) {
                if (dessertItem instanceof Cookie && ((Cookie) dessert).isSameAs((Cookie) dessertItem)) {
                    ((Cookie) dessertItem).setPricePerDozen(((Cookie) dessertItem).getPricePerDozen() + ((Cookie) dessert).getPricePerDozen());
                    valid = false;
                }
            }
        }
        if (valid) {
            order.add(dessert);
        }
    }

    public int itemCount() {
        return order.size();
    }

    public double orderCost() {
        double sum = 0;
        for (DessertItem dessertItem : this.order) {
            sum = (sum + dessertItem.calculateCost());
        }
        return sum;
    }

    public double orderTax() {
        double sum = 0;
        for (DessertItem dessertItem : this.order) {
            sum = sum + dessertItem.calculateTax();
        }
        return sum;
    }

    public String toString() {
        return String.format("%n Paid for with: %s", getPayType());
    }

    public void clear(){
        order.clear();
    }

}
