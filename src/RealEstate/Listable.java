/**
 * File: Listable.java
 * Description: Creating an interface to the lists
 * Lessons Learned: In this lesson I learned how to use create new attributes for the interface
 * Creating the user interface
 * used of setKeys and fixing a bug
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: Miguel Espinoza.
 * @since: 11/28/2022.
 */
package RealEstate;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public interface Listable {
    public HashMap<String, Residential> getListings();
    public Residential getListing(String list);
    public Set<String> getStreetAddresses();
    public Collection<Residential> getResidences();
    public int getListingCount();
    public void addListing(String list, Residential residential);
}
