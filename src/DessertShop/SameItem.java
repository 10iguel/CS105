/**
 * File: SameItem.java
 * Description: Creating the interface to implement to the classes
 * Lessons Learned: In this lesson I learned how to create and use interfaces with a general interface
 * method with an argument
 * public boolean isSameAs()
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: Miguel Espinoza.
 * @since: 10/31/2022.
 */
package DessertShop;

public interface SameItem<T> {
    public boolean isSameAs(T same);
}
