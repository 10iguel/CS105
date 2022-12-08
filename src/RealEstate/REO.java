/**
 * File: REO.java
 * Description: Creating the interface of the Lists
 * Lessons Learned: In this lesson I learned how to use create new methods for the lists
 * Creating the user interface
 * used of setKeys and fixing a bug
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: Miguel Espinoza.
 * @since: 11/28/2022.
 */

package RealEstate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class REO {
    static Listings listings = new Listings();

    public static void main(String[] args) {
        String choice;
        String choiceMenu;
        String listChoice;
        String bidsChoice;
        boolean done = false;
        Scanner scanner = new Scanner(System.in);
        while (!done) {
            printHeader("MainMenu");
            System.out.println("1: Listing");
            System.out.println("2: Bids");
            System.out.println("What would you like to do?(1-2): ");

            choice = scanner.nextLine();
            if (choice.equals("")) {
                done = true;
            } else {
                switch (choice) {
                    case "1":
                        boolean adminMenu = false;
                        while (!adminMenu) {
                            printHeader("Listing Menu");
                            System.out.println("1: Add Listing");
                            System.out.println("2: Show Listings");
                            System.out.println("3: Auto Populate Listings(Dev tool)");
                            System.out.println("ENTER: Exit back to previous menu");
                            System.out.println("What would you like to do?(1-3): ");
                            choiceMenu = scanner.nextLine();
                            switch (choiceMenu) {
                                case "1":
                                    boolean listValid = false;
                                    while (!listValid) {
                                        printHeader("Add Listing Menu");
                                        System.out.println("1: Add House");
                                        System.out.println("2: Add Condo");
                                        System.out.println("ENTER: Exit back to previous menu");
                                        System.out.println("What would you like to do?(1-2): ");
                                        listChoice = scanner.nextLine();
                                        switch (listChoice) {
                                            case "1":
                                                addHousePrompt();
                                                break;
                                            case "2":
                                                addCondoPrompt();
                                                break;
                                            case "":
                                                listValid = true;
                                                break;
                                            default:
                                                System.out.println("Not the correct output");
                                        }
                                    }
                                    break;
                                case "2":
                                    showListing();
                                    break;
                                case "3":
                                    autoPopulateListings();
                                    break;
                                case "":
                                    adminMenu = true;
                                    break;
                                default:
                                    System.out.println("It is not correct");
                                    break;
                            }
                        }
                        break;
                    case "2":
                        boolean bidsMenu = false;
                        while (!bidsMenu) {
                            printHeader("Bids Menu");
                            System.out.println("1: Add New Bid");
                            System.out.println("2: Show Existing Bids");
                            System.out.println("3: Auto Populate Bids(Dev tool)");
                            System.out.println("ENTER: Exit back to previous menu");
                            System.out.println("What would you like to do?(1-3): ");
                            bidsChoice = scanner.nextLine();
                            switch (bidsChoice) {
                                case "1":
                                    addNewBid();
                                    break;
                                case "2":
                                    break;
                                case "":
                                    bidsMenu = true;
                                    break;
                                default:
                                    System.out.println("Invalid Choice");
                                    break;
                            }
                        }
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
                }
            }
        }
    }

    public static void printHeader(String title) {
        System.out.printf("%n----------------------------------------%n");
        System.out.printf("             %s             ", title);
        System.out.printf("%n----------------------------------------%n");
    }

    public static double getValidDouble(Scanner sIn, String question, String warning) {
        String input;
        double doubleNum = 0;
        boolean validAnswer = false;
        do {
            System.out.print(question);
            input = sIn.nextLine();
            try {
                doubleNum = Double.parseDouble(input);
                if (doubleNum > 0) {
                    validAnswer = true;
                    return doubleNum;
                } else {
                    System.out.println(warning);
                }
            } catch (Exception e) {
                System.out.println(warning);
            }
        } while (!validAnswer);
        return doubleNum;
    }

    public static int getValidInt(Scanner sIn, String question, String warning) {
        String input;
        int intNum = 0;
        boolean validAnswer = false;
        do {
            System.out.print(question);
            input = sIn.nextLine();
            try {
                intNum = Integer.parseInt(input);
                if (intNum > 0) {
                    validAnswer = true;
                    return intNum;
                } else {
                    System.out.println(warning);
                }
            } catch (NumberFormatException e) {
                System.out.println(warning);
            }
        } while (!validAnswer);
        return intNum;
    }

    public static void addHousePrompt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the street address for the residence: ");
        String street = scanner.nextLine();
        System.out.println("Please enter the zip code for the residence: ");
        String zipcode = scanner.nextLine();
        zipcode.trim();
        int bedrooms1 = getValidInt(scanner, "Please enter the number of bedrooms:", "Invalid value, put a number");
        int bathrooms1 = getValidInt(scanner, "Please enter the number of bathrooms:", "Invalid value, put a number");
        double square1 = getValidDouble(scanner, "Please enter the square footage of the residence:", "Invalid value");
        double yard1 = getValidDouble(scanner, "Please enter the size of the yard in acres:", "Invalid value");
        House house = new House(street, zipcode, bedrooms1, bathrooms1, square1, yard1);
        System.out.printf("Appraisal Price for this property is: $%,.2f%n", house.calculateAppraisalPrice());
        double listPrice1 = getValidDouble(scanner, "Please enter the List Price for the property: $", "Invalid value");
        house.setListPrice(listPrice1);
        listings.addListing(street, house);
        System.out.println("You have created a new listing!");
        System.out.println(house);
    }

    public static void addCondoPrompt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the street address for the residence: ");
        String street = scanner.nextLine();
        String zipcode = getZipCodeValidate(scanner, "Please enter the zip code for the residence: ", "Invalid Input");

        int bedrooms1 = getValidInt(scanner, "Please enter the number of bedrooms:", "Invalid value, put a number");
        int bathrooms1 = getValidInt(scanner, "Please enter the number of bathrooms:", "Invalid value, put a number");
        double square1 = getValidDouble(scanner, "Please enter the square footage of the residence:", "Invalid value");
        int floor1 = getValidInt(scanner, "Please enter the floor level of the condo: ", "Invalid value, put a number");
        Condo condo = new Condo(street, zipcode, bedrooms1, bathrooms1, square1, floor1);
        System.out.printf("Appraisal Price for this property is: $%,.2f%n", condo.calculateAppraisalPrice());
        double listPrice1 = getValidDouble(scanner, "Please enter the List Price for the property: $", "Invalid value");
        condo.setListPrice(listPrice1);
        listings.addListing(street, condo);
        System.out.println("You have created a new listing!");
        System.out.println(condo);
    }

    public static String getZipCodeValidate(Scanner scanner, String question, String warning) {
        String input;
        boolean validAnswer = false;
        int numZip = 1;
        do {
            System.out.println(question);
            input = scanner.nextLine();
            input.trim();
            try {
                numZip = Integer.parseInt(input);
            } catch (Exception e) {
                System.out.println(warning);
            }
        } while (!validAnswer && numZip < 0);
        return input;
    }

    public static void showListing() {
        int listingNum = 1;
        if (listings.getListingCount() == 0) {
            System.out.println("There are no listings yet");
        } else {
            System.out.println("Current Listings for REO:\n");
            for (String reo : listings.getStreetAddresses()) {
                System.out.printf("Listing No: %d\n", listingNum);
                listingNum++;
                System.out.println(listings.getListing(reo));
            }
        }
    }

    public static void autoPopulateListings() {
        House house1 = new House("34 Elm", "95129", 3, 2, 2200, .2);
        house1.setListPrice(house1.calculateAppraisalPrice() * 1.1);
        listings.addListing("34 Elm", house1);
        House house2 = new House("42 Hitchhikers", "95136", 4, 3, 2800, .3);
        house2.setListPrice(house2.calculateAppraisalPrice() * 1.1);
        listings.addListing("42 Hitchhikers", house2);
        Condo condo1 = new Condo("4876 Industrial", "95177", 3, 1, 1800, 3);
        condo1.setListPrice(condo1.calculateAppraisalPrice() * 1.1);
        listings.addListing("4876 Industrial", condo1);
        House house3 = new House("2654 Oak", "84062", 5, 53, 4200, .5);
        house3.setListPrice(house3.calculateAppraisalPrice() * 1.1);
        listings.addListing("2654 Oak", house3);
        Condo condo2 = new Condo("9875 Lexington", "84063", 2, 1, 1500, 1);
        condo2.setListPrice(condo2.calculateAppraisalPrice() * 1.1);
        listings.addListing("9875 Lexington", condo2);
        Condo condo3 = new Condo("3782 Market", "84066", 3, 1, 1800, 2);
        condo3.setListPrice(condo3.calculateAppraisalPrice() * 1.1);
        listings.addListing("3782 Market", condo3);
        House house4 = new House("7608 Glenwood", "84055", 6, 3, 3900, .4);
        house4.setListPrice(house4.calculateAppraisalPrice() * 1.1);
        listings.addListing("7608 Glenwood", house4);
        House house5 = new House("1220 Apple", "84057", 8, 7, 7900, 1);
        house5.setListPrice(house5.calculateAppraisalPrice() * 1.1);
        listings.addListing("1220 Apple", house5);
        int currentSize = listings.getListings().size();
        System.out.printf("8 residences have been added to the listings for testing purposes.%n");
    }

    public static void addNewBid() {
        int indexList = 1;
        int bidsNum = 0;
        if (listings.getListingCount() > 0) {
            System.out.println("Current Listings for REO:");
            System.out.println("No.      Property (bids)");
            System.out.println("---------------------------");
            for (String street : listings.getStreetAddresses()) {
                System.out.println(indexList++ + " " + street + " (" + bidsNum + ")");
            }
            System.out.println("ENTER: Exit back to previous menu");
            //int listingIndex = getValidInt(scanner,"Which ","No valid");
        } else {
            System.out.println("There are not current Listings saved");
        }
    }

    public static void showBids() {
        // Declare variables
        Scanner scanner = new Scanner(System.in);
        int num = 1;
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<Integer> options = new ArrayList<Integer>();
        // Print menu
        System.out.println("\nCurrent Listings for REO:\n");
        do {
            int n = 1;
            System.out.printf("%-7s%s%n", "No.", "Property(bids)");
            System.out.println("------------------------");
            for (String a : listings.getStreetAddresses()) {
                System.out.printf("%d: %s (%d)%n", n, a,
                        (listings.getListing(a)).getBidCount());
                list.add(a);
                options.add(n);
                n++;
            }
            System.out.println("ENTER: Exit back to previous menu\n");
            num = getValidInt(scanner, "For which property would you like to see the current bids ?:",
                    " Please enter a valid whole number or ENTER.");

            if (num == 0) {
                break;
            }
            num--;
            System.out.printf("%n%s%n",
                    listings.getListing(list.get(num)));
            System.out.println("\nCurrent bids for this listing:");
            System.out.println("-------------------------------------");
            System.out.printf("%13s%18s%n", "Bidder", "Bid");
            System.out.println("-------------------------------------");
            for (String bidder :
                    (listings.getListing(list.get(num))).getBidders()) {
                System.out.printf("%-24s$%-13.2f%n", bidder,
                        listings.getListing(list.get(num)).getBid(bidder));
            }
            System.out.println("-------------------------------------\n");
            System.out.println();
        } while (num != 0);
    }// End of showBids()

    public static void populateBids() {
        Random r = new Random();
        String[] autoBidders = {"Patric Stewart", "Walter Koenig", "William Shatner", " Leonard Nimoy", " DeForect Kelley", " James Doohan",
                "George Takei", "Majel Barrett", "Nichelle Nichol",
                "Jonathan Frank", "Marina Sirtis", "Brent Spiner", "Gates McFadden",
                "Michael Dorn", "LeVar Burton", "Wil Wheaton", "Colm Meaney", " Michelle Forbes"};
        System.out.println();
        for (Residential residential : listings.getResidences()) {
            int added = 0;
            for (int i = 0; i < r.nextInt(10); i++) {
                String name = autoBidders[(r.nextInt((autoBidders.length - 1) + 1))];
                int max = (int) (residential.calculateAppraisalPrice() * 1.1);
                int min = (int) (residential.calculateAppraisalPrice() * .9);
                double bid = (int) (Math.random() * ((max - min) + 1) + min);
                residential.newBid(name, bid);
                added += 1;
            }
            System.out.printf("%n%d new bids have been added to listing %s.", added, residential.getStreetAddress());
        }// End of loop that creates a random amount of bids
        System.out.println();
    }
}

