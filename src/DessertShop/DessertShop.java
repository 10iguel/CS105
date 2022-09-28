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
        int index = 0;
        for (DessertItem order: orders.getOrderList()){
            index++;
            System.out.printf("%d.- %s \n",index, order.getName());
        }
        System.out.println();
        System.out.printf("Total number of items in order: %d",orders.itemCount());
    }
}
