/**
 * File: DessertShop.java
 * Description: Creating the interface with the user to let the user type their choices
 * Lessons Learned: In this lesson I learned how to use the arrays with methods and using the toString method to
 * display all the orders.
 * my classes and string formatting.
 * Sort the array with collection
 * Collections.sort(orders.getOrderList());
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: Miguel Espinoza.
 * @since: 10/24/2022.
 */

package DessertShop;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class DessertShop {
    private static HashMap<String, Customer> customerDB = new HashMap<>();

    public static void main(String[] args) {
        Order orders = new Order();
        String paymentMethod = "";
        Scanner sIn = new Scanner(System.in);
        String choice;
        DessertItem orderItem;
        String customerName;

        boolean closed = false;

        while (!closed) {

            boolean done = false;
            while (!done) {
                System.out.println("\n1: Candy");
                System.out.println("2: Cookie");
                System.out.println("3: Ice Cream");
                System.out.println("4: Sunday");

                System.out.print("\nWhat would you like to add to the order? (1-4, Enter for done): ");
                choice = sIn.nextLine();

                if (choice.equals("")) {
                    done = true;
                } else {
                    switch (choice) {
                        case "1":
                            orderItem = userPromptCandy();
                            orders.add(orderItem);
                            System.out.printf("%n%s has been added to your order.%n", orderItem.getName());
                            break;
                        case "2":
                            orderItem = userPromptCookie();
                            orders.add(orderItem);
                            System.out.printf("%n%s has been added to your order.%n", orderItem.getName());
                            break;
                        case "3":
                            orderItem = userPromptIceCream();
                            orders.add(orderItem);
                            System.out.printf("%n%s has been added to your order.%n", orderItem.getName());
                            break;
                        case "4":
                            orderItem = userPromptSundae();
                            orders.add(orderItem);
                            System.out.printf("%n%s has been added to your order.%n", orderItem.getName());
                            break;
                        default:
                            System.out.println("Invalid response:  Please enter a choice from the menu (1-4)");
                            break;
                    }//end of switch (choice)
                }//end of if (choice.equals(""))
            }//end of while (!done)
            System.out.println("\n");

            done = false;
            System.out.println("Enter the customer name:");
            customerName = sIn.nextLine();
            if (!customerDB.containsKey(customerName)) {
                Customer customer = new Customer(customerName);
                customerDB.put(customerName, customer);
                customerDB.get(customerName).addToHistory(orders);
            }else {
                customerDB.get(customerName).addToHistory(orders);
            }




            while (!done) {
                System.out.printf("What form of payment will be used? (%s,%s,%s): ", PayType.CASH, PayType.CARD, PayType.PHONE);
                paymentMethod = sIn.nextLine();

                for (PayType type : PayType.values()) {
                    if (paymentMethod.equals(type.name())) {
                        orders.setPayType(PayType.valueOf(paymentMethod));
                    }
                }
                switch (paymentMethod) {
                    case "CASH":
                    case "CARD":
                    case "PHONE":
                        done = true;
                        break;
                    default:
                        System.out.println("That's not a valid form of payment.");
                        break;
                }
            }
            System.out.println("\n");

            Collections.sort(orders.getOrderList());



            /*System.out.println("These are the names of the orders");*/
            int index = 0;
            System.out.println("----------------------------------Receipt----------------------------------------------------------");
            for (DessertItem order : orders.getOrderList()) {
                index++;
                //System.out.printf("%-25s$%-8.2f[Tax: $%.2f]\n",order.getName(), order.calculateCost(), order.calculateTax());
                System.out.println(order);
            }
            System.out.println("-----------------------------------------------------------------------------------------------------");
            System.out.printf("Total number of items in order: %d\n", orders.itemCount());
            System.out.printf("%-25s$%-8.2f[Tax: $%.2f]\n", "Order Subtotals: ", orders.orderCost(), orders.orderTax());

            System.out.printf("%-25s$%-8.2f\n", "Order Total:", orders.orderCost() + orders.orderTax());

            System.out.println("-----------------------------------------------------------------------------------------------------");

            System.out.println(orders);

            System.out.println("-----------------------------------------------------------------------------------------------------");
            System.out.printf("Customer Name: %s       Customer ID: %d       Total Orders: %d\n",customerName,customerDB.get(customerName).getID(),
                    customerDB.get(customerName).getOrderHistory().size());

            System.out.println("Hit enter to start a new order");
            String continueOrder = sIn.nextLine();
            if (continueOrder == "") {
                closed = false;
                orders.clear();
            } else {
                closed = true;
            }
        }

    }

    private static DessertItem userPromptCandy() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the type of candy: ");
        String name = scanner.nextLine();
        System.out.print("Enter the candy weight: ");
        String candyWeight = scanner.nextLine();
        double candyWeight1 = Double.parseDouble(candyWeight);
        System.out.print("Enter the price per pound: ");
        String pricePerPound = scanner.nextLine();
        double pricePerPound1 = Double.parseDouble(pricePerPound);

        return new Candy(name, candyWeight1, pricePerPound1);
    }

    private static DessertItem userPromptCookie() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the type of cookie: ");
        String name = scanner.nextLine();
        System.out.print("Enter the quantity purchased: ");
        String cookieQty = scanner.nextLine();
        int cookieQty1 = Integer.parseInt(cookieQty);
        System.out.print("Enter the price per dozen: ");
        String pricePerDozen = scanner.nextLine();
        double pricePerDozen1 = Double.parseDouble(pricePerDozen);

        return new Cookie(name, cookieQty1, pricePerDozen1);

    }

    private static DessertItem userPromptIceCream() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the type of Ice Cream used: ");
        String name = scanner.nextLine();
        System.out.print("Enter the number of scoops: ");
        String scoopCount = scanner.nextLine();
        int scoopCount1 = Integer.parseInt(scoopCount);
        System.out.print("Enter the price per scoop: ");
        String pricePerScoop = scanner.nextLine();
        double pricePerScoop1 = Double.parseDouble(pricePerScoop);

        return new IceCream(name, scoopCount1, pricePerScoop1);

    }

    private static DessertItem userPromptSundae() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the type of Ice Cream: ");
        String name = scanner.nextLine();
        System.out.print("Enter the number of scoops: ");
        String scoopCount = scanner.nextLine();
        int scoopCount1 = Integer.parseInt(scoopCount);
        System.out.print("Enter the price per scoop: ");
        String pricePerScoop = scanner.nextLine();
        double pricePerScoop1 = Double.parseDouble(pricePerScoop);
        System.out.print("Enter the kind of topping used: ");
        String toppingName = scanner.nextLine();
        System.out.print("Enter the price for the topping: ");
        String toppingPrice = scanner.nextLine();
        double toppingPrice1 = Double.parseDouble(toppingPrice);

        return new Sundae(name, scoopCount1, pricePerScoop1, toppingName, toppingPrice1);

    }
}
