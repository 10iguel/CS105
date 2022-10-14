/**
 * File: DessertShop.java
 * Description: Creating the interface with the user to let the user type their choices
 * Lessons Learned: In this lesson I learned how to use the arrays with methods and using the toString method to
 * display all the orders.
 * my classes and string formatting.
 * Storing all of them in an Array
 * return new Candy(name, candyWeight1, pricePerPound1);
 * Calling a lots of objects in the same main method.
 * Candy candy1 = new Candy("Candy Corn", 1.5, .25);
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: Miguel Espinoza.
 * @since: 10/12/2022.
 */

package DessertShop;

import java.util.Scanner;

public class DessertShop {
    public static void main(String[] args) {
        Order orders = new Order();

        Scanner sIn = new Scanner(System.in);
        String choice;
        DessertItem orderItem;

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
                        System.out.printf("%n%s has been added to your order.%n",orderItem.getName());
                        break;
                    case "2":
                        orderItem = userPromptCookie();
                        orders.add(orderItem);
                        System.out.printf("%n%s has been added to your order.%n",orderItem.getName());
                        break;
                    case "3":
                        orderItem = userPromptIceCream();
                        orders.add(orderItem);
                        System.out.printf("%n%s has been added to your order.%n",orderItem.getName());
                        break;
                    case "4":
                        orderItem = userPromptSundae();
                        orders.add(orderItem);
                        System.out.printf("%n%s has been added to your order.%n",orderItem.getName());
                        break;
                    default:
                        System.out.println("Invalid response:  Please enter a choice from the menu (1-4)");
                        break;
                }//end of switch (choice)
            }//end of if (choice.equals(""))
        }//end of while (!done)
        System.out.println("\n");

        /*System.out.println("These are the names of the orders");*/
        int index = 0;
        System.out.println("----------------------------------Receipt----------------------------------------------------------");
        for (DessertItem order: orders.getOrderList()){
            index++;
            //System.out.printf("%-25s$%-8.2f[Tax: $%.2f]\n",order.getName(), order.calculateCost(), order.calculateTax());
            System.out.println(order);
        }
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.printf("Total number of items in order: %d\n",orders.itemCount());
        System.out.printf("%-25s$%-8.2f[Tax: $%.2f]\n", "Order Subtotals: ", orders.orderCost(), orders.orderTax());

        System.out.printf("%-25s$%-8.2f\n", "Order Total:" ,orders.orderCost() + orders.orderTax());

        System.out.println("-----------------------------------------------------------------------------------------------------");
    }
    private static DessertItem userPromptCandy(){

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
    private static DessertItem userPromptCookie(){
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
    private static DessertItem userPromptIceCream(){
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
    private static DessertItem userPromptSundae(){
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
