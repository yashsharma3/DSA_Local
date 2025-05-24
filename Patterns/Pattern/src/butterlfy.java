import java.util.Scanner;

public class butterlfy {
    public static void butter(int row) {
        // Upper half
        for (int i = 1; i <= row; i++) {
            // Left stars with spaces
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Spaces in the middle
            for (int j = 1; j <= 2 * (row - i); j++) {
                System.out.print("  "); // Two spaces for better alignment
            }

            // Right stars with spaces
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // Lower half
        for (int i = row; i >= 1; i--) {
            // Left stars with spaces
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Spaces in the middle
            for (int j = 1; j <= 2 * (row - i); j++) {
                System.out.print("  ");
            }

            // Right stars with spaces
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int row = sc.nextInt();
        butter(row);
    }
}
