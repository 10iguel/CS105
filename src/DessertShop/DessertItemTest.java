package DessertShop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DessertItemTest {

    @Test
    public void getName() {
        DessertItem dessertItem = new DessertItem("Alfajor");
        assertEquals("Alfajor", dessertItem.getName());
    }

    @Test
    public void setName() {
        DessertItem dessertItem = new DessertItem();
        dessertItem.setName("cake");
        assertEquals("cake",dessertItem.getName());
    }
}