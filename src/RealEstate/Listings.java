/**
 * File: Listings.java
 * Description: Creating class with an interface to the lists
 * Lessons Learned: In this lesson I learned how to use create new attributes for the class of the interface
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

public class Listings implements Listable{

    private HashMap<String,Residential > listings;

    public Listings(){
        listings = new HashMap<String, Residential>();
    }

    @Override
    public HashMap<String, Residential> getListings() {
        return listings;
    }

    @Override
    public Residential getListing(String list) {
        return listings.get(list);
    }

    @Override
    public Set<String> getStreetAddresses() {
        return listings.keySet();
    }

    @Override
    public Collection<Residential> getResidences() {
        return listings.values();
    }

    @Override
    public int getListingCount() {
        return listings.size();
    }

    @Override
    public void addListing(String list, Residential residential) {
        listings.put(list, residential);
    }
}
