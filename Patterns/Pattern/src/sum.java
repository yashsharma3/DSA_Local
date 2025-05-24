import java.util.Scanner;

public class sum {
    public static void numAdd(int a, int b){
        int sum = a + b;
        System.out.println("Sum is : " + sum);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        numAdd(a,b);
    }
}
