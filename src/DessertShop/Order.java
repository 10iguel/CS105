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
}
