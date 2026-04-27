package com.pluralsight;
// import scanner
import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        // enter my scanner for user input
        Scanner scanner = new Scanner(System.in);

        // call the getName method
        String fullNamePar = getName(scanner);
        System.out.println("Full Name: " + fullNamePar);
    }

    public static String getName(Scanner scanner) {
        // ask the user for their name and trim and split into parts based on the spaces
        System.out.println(" Please enter your name:");
        String[] fullName = scanner.nextLine().trim().split(" ");


        // firstName variable
        //String firstName = fullName[0];

        //print the first and middle name and last name
        String fullNamePar = "Full Name: ";
        if (fullName.length == 3) {
            //assign name parts to variables
            String firstName = fullName[0];
            String middleName = fullName[1];
            String lastName = fullName[2];

            //print out full name and parts of name
            fullNamePar = firstName + " " + middleName + " " + lastName;
            System.out.println("First Name: " + firstName);
            System.out.println("Middle Name: " + middleName);
            System.out.println("Last Name: " + lastName);

        }
        if (fullName.length == 2) {
            //assign name parts to variables
            String firstName = fullName[0];
            String noMiddle = "(none)" + " ";
            String lastName = fullName[1];

            //print out full name and parts of name
            fullNamePar = firstName + " " + noMiddle + " " + lastName;
            System.out.println("First Name: " + firstName);
            System.out.println("Middle Name: " + noMiddle);
            System.out.println("Last Name: " + lastName);
        }
        return fullNamePar;
    }
}

