// BirthMonth.java
// Program ask user for their birth month (1-12) and validates input.

import java.util.Scanner;

class BirthMonth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int month = 0;

        System.out.print("Enter your birth month (1-12): ");

        if (in.hasNextInt()) {
            month = in.nextInt();
            in.nextLine(); // clear buffer

            if (month >= 1 && month <= 12) {
                System.out.println("Your birth month is: " + month);
            } else {
                System.out.println("You entered an incorrect month value: " + month);
            }
        } else {
            String trash = in.nextLine();
            System.out.println("Invalid input; " + trash);
        }

        in.close();
    }
}