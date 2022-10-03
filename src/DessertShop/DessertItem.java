/**
 * File: DessertItem.java
 * Description: Creating a superclass
 * Lessons Learned: In this lesson I learned how to create a superclass and the use of trim .
 *     superclass
 *     DessertItem(String name) {
 *                 this.name = name;
 *         }
 *     trim()
 *     name.trim()
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: Miguel Espinoza.
 * @since: 09/28/2022.
 */

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
