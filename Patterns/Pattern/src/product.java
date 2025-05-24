import java.util.Scanner;

public class product {
    public static int prod(int a,int b){
        int product= a * b;
        return product;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int pr = prod(a,b);
        System.out.println("Product of a and b is: " + pr);
    }
}
