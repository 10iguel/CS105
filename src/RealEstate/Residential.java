/**
 * File: Residential.java
 * Description: Creating a superclass for 2 subclasses
 * Lessons Learned: In this lesson I learned how to use the inheritance properties to create organized
 * classes and validations on the setters with ternary operators and updating the abstract class
 *     bedCount < 0 ? 0 : bedCount
 *     public abstract class Residential extends Property
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: Miguel Espinoza.
 * @since: 10/31/2022.
 */

package RealEstate;

import java.text.DecimalFormat;
import java.util.*;

public abstract class Residential extends Property implements Biddable {
    private int bedCount;
    private int bathCount;
    private double sqFootage;

    private HashMap<String,Double> bids = new HashMap<String,Double>();

    public Residential(){
        super();
        this.bedCount = 0;
        this.bathCount = 0;
        this.sqFootage = 0;
    }

    public Residential(String streetAddress, String zip, int bedCount, int bathCount, double sqFootage) {
        super(streetAddress,zip);
        this.bedCount = bedCount;
        this.bathCount = bathCount;
        this.sqFootage = sqFootage;
    }

    public int getBedCount() {
        return bedCount;
    }

    public int getBathCount() {
        return bathCount;
    }

    public double getSize() {
        return sqFootage;
    }

    public void setBedCount(int bedCount) {
        this.bedCount = bedCount < 0 ? 0 : bedCount;
    }

    public void setBathCount(int bathCount) {
        this.bathCount = bathCount < 0 ? 0 : bathCount;
    }

    public void setSize(double sqFootage) {
        this.sqFootage = sqFootage < 0 ? 0 : sqFootage;
    }

    public abstract double calculateAppraisalPrice();

    public HashMap<String, Double> getBids() {
        return bids;
    }
    public Double getBid(String key) {
        return bids.get(key);
    }
    public Set<String> getBidders() {
        return bids.keySet();
    }
    public int getBidCount() {
        return bids.size();
    }
    public void newBid(String bidder, Double bid) {
        if (bids.get(bidder) == null) {
            bids.put(bidder, bid);
        }
        else {
            bids.replace(bidder, bid);
        }
    }
    public String detailedBids() {
        String text = "";
        ArrayList<String> bidders = new ArrayList<String>(bids.keySet());
        DecimalFormat formatValue = new DecimalFormat("$###,###,###.00");
        System.out.println("Current bids for this listing: ");
        System.out.println("---------------------------------------------");
        System.out.printf("%10s%20s\n", "Bidder", "Bids");
        System.out.println("---------------------------------------------\n");
        if (bids.size() == 0) return "No Bids\n";
        for (String b : bidders)
            text += String.format("%6s%18s\n", b,
                    formatValue.format(bids.get(b)));
        return text;
    }
}
