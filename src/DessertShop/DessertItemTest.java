package DessertShop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DessertItemTest {

    @Test
    public void getName() {
        DessertItem dessertItem = new DessertItem("Alfajor");
        assertEquals("Alfajor", dessertItem.getName());
    }
    //Testing if they put spaces
    @Test
    public void getTrimName() {
        DessertItem dessertItem = new DessertItem("        ");
        assertEquals("", dessertItem.getName());
    }

    @Test
    public void setName() {
        DessertItem dessertItem = new DessertItem();
        dessertItem.setName("cake");
        assertEquals("cake",dessertItem.getName());
    }
}