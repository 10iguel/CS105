package DessertShop;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in1 = new Scanner(System.in); // Scanner for number
        Scanner in2 = new Scanner(System.in);// Scanner for string to play again

//defining the variable
        boolean valid = false;
        boolean playAgain = false;
        String input = "";
        // define the range of numbers
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int largestNum = 0;

//primary do while loop
        do {
            System.out.println("This program will ask the user for three numbers + "
                    + "and determine which of the three number is the largest.\n");
            System.out.println("\n\n");

            // do while loop for first number validation
            do {
                System.out.println("Please enter the first number: ");
                System.out.println("Look here "+in1.hasNextInt());
                 //if block to check the input is valid
                if (in1.hasNextInt()) {
                    num1 = in1.nextInt();
                    valid = true;
                } else {
                    System.out.println("Invalid Response.Please enter a whole number.");
                } // end of if and else statement
//                try{
//                    num1 = Integer.parseInt(in1.nextLine());
//                    valid = true;
//                }catch (Exception e){
//                    System.out.println("Invalid Response.Please enter a whole number.");
//                }

            } while (!valid); // if false run the loop again
            valid = false; // to reset the validation

            // do while loop for second number validation
            do {
                System.out.println("Please enter the second number: ");

                // if block to check the input is valid
                if (in1.hasNextInt()) {
                    num2 = in1.nextInt();
                    valid = true;
                } else {
                    System.out.println("Invalid responce.Please enter a whole number.");
                } // end of if and else statement
            } while (!valid); // if false run the loop again
            valid = false; // this resets the validation

            // do while loop for 3rd number validation
            do {
                System.out.println("Please enter the third number: ");

                // if block to check the input is valid
                if (in1.hasNextInt()) {
                    num3 = in1.nextInt();
                    valid = true;
                } else {
                    System.out.println("Invalid Response. Please enter a whole number.");
                } // end of if and else
            } while (!valid); // if false run the loop again
            valid = false; // this resets the validation

            // passing the number to my new method and save the results

            largestNum = largestNum(num1, num2, num3);

            // print results
            System.out.println("\n");
            System.out.println("The largest of the three number is: " + largestNum + "/n/n");

            // non numeric input validation for play again feature do while loop
            do {
                valid = false;
                System.out.println("Would you like to play again?: (Y/N) ");
                input = in1.next();

                // if block to check the input
                if (input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("N")) {
                    valid = true;
                } else {
                    System.out.println("Invalid Response. Please use Y for yes and N for no. ");
                    valid = false;
                } // end of if and else statement
            } while (!valid);

            // if and else if to decide
            if (input.equalsIgnoreCase("Y")) {
                playAgain = false;
                System.out.println("Okay!");
            } else if (input.equalsIgnoreCase("N")) {
                System.out.println("Thanks for playing. Have a nice day!");
                playAgain = true;
            } // end of if else statement

        } while (!playAgain); // will reset the game with the primary do while.

        in1.close(); // close of number scanner
        in2.close();// close of string scanner for play again.
    }// end of the main method

    public static int largestNum(int i, int j, int k) {// int i = num1, int j= num2, int k = num3
        int a = 0; // links to int largestNum

        // determine which number is largest with if, else if, and else statement.
        if (i >= j && i >= k)
            i = 1;
        else if (j >= i && j >= k)
            a = k;
        else if (k >= i && k >= j)
            a = k;
        else
            System.out.println("Error of some sort.");
        return a;
    }// end of method largeNumber

}// end of Lab6a

