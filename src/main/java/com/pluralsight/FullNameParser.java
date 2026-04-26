package com.pluralsight;
// import scanner
import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        // enter my scanner for user input
        Scanner scanner = new Scanner(System.in);

    }
    public static String getName(Scanner scanner) {
        // get the users first name and get variable
        System.out.println("Enter your first name: ");
        String firstName = scanner.nextLine().trim();

        // get the users middle name
        System.out.println("Enter your middle name: ");
        String middleName = scanner.nextLine().trim();

        // get the users last name
        System.out.println("Enter your last name: ");
        String lastName = scanner.nextLine().trim();
}
