package DessertShop;

public class DessertItem {
    private String name;

    public DessertItem() {
        this.name = "";
    }

    public DessertItem(String name) {
        this.name = name;
    }
    //Getters

    public String getName() {
        return name.trim();
    }
    // Setters

    public void setName(String name) {
        this.name = name;
    }


}
