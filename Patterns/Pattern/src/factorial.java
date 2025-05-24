import java.util.Scanner;

public class factorial {
    public static int fact(int n){
        int num=1;
        for(int i =1;i<=n;i++){
            num = num *i ;
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans =fact(n);
        System.out.println("Factorial of n is:" + ans);
    }
}
