package Salary;
import java.util.Scanner;

public class StringManuplation {

    private static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    private static boolean isPalindrome(String str) {
        String reversed = reverseString(str);
        return str.equalsIgnoreCase(reversed);
    }

    private static void countVowelsAndConsonants(String str) {
        int vowels = 0, consonants = 0;
        str = str.toLowerCase(); 
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) != -1) { 
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        String input;

        do {
            System.out.println("\n--- String Manipulation Toolkit ---");
            System.out.println("1. Reverse String");
            System.out.println("2. Convert to Uppercase");
            System.out.println("3. Convert to Lowercase");
            System.out.println("4. Check Palindrome");
            System.out.println("5. Count Vowels and Consonants");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1-6): ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter a string: ");
                    input = scanner.nextLine();
                    System.out.println("Reversed String: " + reverseString(input));
                    break;
                case 2:
                    System.out.print("Enter a string: ");
                    input = scanner.nextLine();
                    System.out.println("Uppercase: " + input.toUpperCase());
                    break;
                case 3:
                    System.out.print("Enter a string: ");
                    input = scanner.nextLine();
                    System.out.println("Lowercase: " + input.toLowerCase());
                    break;
                case 4:
                    System.out.print("Enter a string: ");
                    input = scanner.nextLine();
                    if (isPalindrome(input)) {
                        System.out.println("The string is a palindrome.");
                    } else {
                        System.out.println("The string is not a palindrome.");
                    }
                    break;
                case 5:
                    System.out.print("Enter a string: ");
                    input = scanner.nextLine();
                    countVowelsAndConsonants(input);
                    break;
                case 6:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
