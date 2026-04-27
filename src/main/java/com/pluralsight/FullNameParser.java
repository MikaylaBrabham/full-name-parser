package com.pluralsight;
// import scanner
import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        // enter my scanner for user input
        Scanner scanner = new Scanner(System.in);

    }
    public static String getName(Scanner scanner) {
        // ask the user for their name
        System.out.println(" Please enter your name:");
        String fullName = scanner.nextLine().trim();

    }

}
