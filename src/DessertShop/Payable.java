/**
 * File: Payable.java
 * Description: Creating the interface to implement to the classes and enum
 * Lessons Learned: In this lesson I learned how to create and use interfaces
 *  method without an arguments and use enums
 * public String getPackaging();
 * method with an argument
 * public void setPackaging(String pack);
 * Instructor's Name: Barbara Chamberlin
 *enum PayType {
 *     CASH,
 *     CARD,
 *     PHONE,
 * }
 * @author: Miguel Espinoza.
 * @since: 10/17/2022.
 */

package DessertShop;

public interface Payable {
    public PayType getPayType();
    public void setPayType(PayType payType);

}

enum PayType {
    CASH,
    CARD,
    PHONE,
}