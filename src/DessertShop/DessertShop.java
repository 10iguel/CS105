/**
 * File: DessertShop.java
 * Description: Creating an array of orders and printing out the result
 * Lessons Learned: In this lesson I learned how to use the inheritance in my favor to sort better
 * my classes and string formatting.
 * Storing all of them in an Array
 * Order orders = new Order();
 * Calling a lots of objects in the same main method.
 * Candy candy1 = new Candy("Candy Corn", 1.5, .25);
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: Miguel Espinoza.
 * @since: 09/28/2022.
 */

package DessertShop;

public class DessertShop {
    public static void main(String[] args) {
        Order orders = new Order();

        Candy candy1 = new Candy("Candy Corn", 1.5, .25);
        Candy candy2 = new Candy("Gummy Bears", .25, .35);
        Cookie cookie = new Cookie("Chocolate Chip", 6, 3.99);
        IceCream iceCream = new IceCream("Pistachio", 2, .79);
        Sundae sundae = new Sundae("Vanilla", 3, .69, "Hot Fudge", 1.29);
        Cookie cookie1 = new Cookie("Oatmeal Raisin", 2, 3.45);

        orders.add(candy1);
        orders.add(candy2);
        orders.add(cookie);
        orders.add(iceCream);
        orders.add(sundae);
        orders.add(cookie1);

        System.out.println("These are the names of the orders");
        for (DessertItem order : orders.getOrderList()) {
            System.out.printf("%-25s$%-8.2f[Tax: $%.2f]\n", order.getName(), order.calculateCost(), order.calculateTax());
        }
        System.out.printf("%s", "----------------------------------------------\n");

        System.out.println();
        System.out.printf("%-25s$%-8.2f[Tax: $%.2f]\n", "Order Subtotals: ", orders.orderCost(), orders.orderTax());
        System.out.printf("%-25s$%-8.2f\n", "Order Total: ", orders.orderCost() + orders.orderTax());
        System.out.printf("Total items in the order: %d", orders.itemCount());
    }
}
