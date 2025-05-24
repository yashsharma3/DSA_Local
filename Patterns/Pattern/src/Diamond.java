import java.util.Scanner;

public class Diamond {
    public static void Heera(int n) {
        // Upper half
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" "+" ");
            }
            // Stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            // Spaces
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" "+" ");
            }
            // Stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();
        Heera(n);
    }
}
