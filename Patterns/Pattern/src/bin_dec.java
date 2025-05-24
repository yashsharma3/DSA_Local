import java.util.Scanner;

public class bin_dec {
    public static void binNum(int n) {
        int dec = 0;
        int pow = 0;
        while (n > 0) {
            int LD = n % 10;
            dec = dec + (LD * (int)(Math.pow(2, pow)));
            pow++;
            n = n / 10;
        }
        System.out.println(dec);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        binNum(n);
    }
}
