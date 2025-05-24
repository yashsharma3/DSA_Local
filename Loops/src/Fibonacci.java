import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Nth Number:");
        int n = sc.nextInt();
        int a =0;
        int b =1;
        int count =2;
        while(count<=n){
            int t = b;
            b = b+a;
            a=t;
            count++;
        }
        System.out.println(b);
    }
}
